package pset6;

import static org.junit.Assert.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * There are 27 failures after replace the min.html with minandmax.html.
 * They were caused by faulty tests because in the MinWebTestSuite, the test result is computed using the min value; however the minandmax.html has an option to compute the max value as well.
 */
public class MinWebTestSuite {
	private static WebDriver wd;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Eric/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
		wd = new FirefoxDriver();
		wd.get("file:///C:/depot/EE360T/src/pset6/min.html");
	}

	@AfterClass
	public static void teardown() {
		wd.quit();
	}

	@Test
	public void test0() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test1() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test2() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test3() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test4() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test5() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test6() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test7() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test8() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test9() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test10() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test11() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test12() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test13() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test14() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test15() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test16() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test17() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test18() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test19() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test20() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test21() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test22() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test23() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test24() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test25() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test26() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test27() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test28() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test29() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test30() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test31() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("infinity"); // enter infinity for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test32() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test33() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test34() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test35() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test36() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test37() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test38() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test39() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test40() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test41() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test42() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, -3, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test43() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test44() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, -3, 0) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test45() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test46() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, -3, 7) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test47() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test48() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test49() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test50() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 0, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test51() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test52() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 0, 0) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test53() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test54() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 0, 7) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test55() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test56() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test57() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test58() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 7, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test59() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test60() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 7, 0) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test61() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test62() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 7, 7) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test63() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-3"); // enter -3 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test64() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test65() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test66() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test67() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test68() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test69() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test70() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test71() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test72() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test73() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test74() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -3, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test75() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test76() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -3, 0) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test77() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test78() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -3, 7) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test79() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test80() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test81() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test82() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test83() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test84() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test85() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test86() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 7) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test87() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test88() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test89() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test90() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 7, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test91() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test92() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 7, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test93() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test94() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 7, 7) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test95() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter 0 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test96() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test97() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test98() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test99() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test100() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test101() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test102() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test103() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity"); // enter infinity for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test104() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test105() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test106() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, -3, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test107() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test108() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, -3, 0) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test109() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test110() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, -3, 7) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test111() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3"); // enter -3 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test112() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test113() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test114() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 0, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test115() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test116() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test117() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test118() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 0, 7) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test119() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter 0 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test120() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test121() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity"); // enter infinity for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test122() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 7, -3) = -3", output);
		wd.navigate().refresh();
	}

	@Test
	public void test123() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3"); // enter -3 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test124() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 7, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test125() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter 0 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test126() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); // click the compute button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 7, 7) = 7", output);
		wd.navigate().refresh();
	}

	@Test
	public void test127() {
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("7"); // enter 7 for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("7"); // enter 7 for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("7"); // enter 7 for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText();
		wd.navigate().refresh();
	}

}
