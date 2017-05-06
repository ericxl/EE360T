package pset6;

import java.io.*;
/**
 * Created by Eric on 5/5/17.
 */
public class MinWebTestGenerator {
    public static void main(String[] a) {
        String suite = new MinWebTestGenerator().createTestSuite();

        System.out.println(suite);
    }

    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }

    String packageDecl() {
        return "package pset6;\n";
    }

    String imports() {
        return "import static org.junit.Assert.*;\n"
                + "import org.junit.*;\n"
                + "import org.openqa.selenium.By;\n"
                + "import org.openqa.selenium.WebDriver;\n"
                + "import org.openqa.selenium.WebElement;\n"
                + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
    }

    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class MinWebTestSuite {\n");

        sb.append(variableDecl());
        sb.append(testInit());
        sb.append(testTeardown());
        sb.append(testCases());

        sb.append("}\n");
        return sb.toString();
    }

    String variableDecl() {
        return "\tprivate static WebDriver wd;\n\n";
    }

    String testInit(){
        return "\t@BeforeClass\n"
                + "\tpublic static void setUp() {\n"
                + "\t\tSystem.setProperty(\"webdriver.gecko.driver\", \"C:/Users/Eric/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe\");\n"
                + "\t\twd = new FirefoxDriver();\n"
                + "\t\twd.get(\"file:///C:/depot/EE360T/src/pset6/min.html\");\n"
                + "\t}\n\n";
    }

    String testTeardown(){
        return "\t@AfterClass\n" + "\tpublic static void teardown() {\n" + "\t\twd.quit();\n" + "\t}\n\n";
    }

    String testCases(){
        StringBuilder sb = new StringBuilder();

        String[] numTexts = { "infinity", "-3", "0", "7" };
        String[] buttonTexts = { "\t\twe.click(); // click the compute button\n", "\t\t\n" };

        int testIndex = 0;

        for (String x : numTexts) {
            for (String y : numTexts) {
                for (String z : numTexts) {
                    for (String button : buttonTexts) {
                        sb.append("\t@Test\n");
                        sb.append("\tpublic void test" + testIndex + "() {\n");
                        sb.append("\t\tWebElement we = wd.findElement(By.id(\"x\"));\n");
                        sb.append("\t\twe.sendKeys(\""+ x +"\"); // enter "+ x +" for x\n");
                        sb.append("\t\twe = wd.findElement(By.id(\"y\"));\n");
                        sb.append("\t\twe.sendKeys(\""+ y +"\"); // enter "+ y +" for y\n");
                        sb.append("\t\twe = wd.findElement(By.id(\"z\"));\n");
                        sb.append("\t\twe.sendKeys(\""+ z +"\"); // enter "+ z +" for z\n");
                        sb.append("\t\twe = wd.findElement(By.id(\"computeButton\"));\n");
                        sb.append(button);
                        sb.append("\t\tWebElement result = wd.findElement(By.id(\"result\"));\n");
                        sb.append("\t\tString output = result.getText();\n");

                        if(button.equals(buttonTexts[0])){
                            if(x.equals(numTexts[0]) || y.equals(numTexts[0]) || z.equals(numTexts[0])) {
                                String error = "Please enter integer values only!";
                                sb.append("\t\tassertEquals(\""+ error +"\", output);\n");
                            } else {
                                int min = Math.min(Math.min(Integer.parseInt(x), Integer.parseInt(y)), Math.min(Integer.parseInt(y), Integer.parseInt(z)));
                                sb.append("\t\tassertEquals(\"min("+ x + ", "+ y +", "+ z +") = " + min +"\", output);\n");
                            }
                        }
                        sb.append("\t\twd.navigate().refresh();\n");
                        sb.append("\t}\n\n");

                        testIndex ++;
                    }
                }
            }
        }
        return sb.toString();
    }
}
