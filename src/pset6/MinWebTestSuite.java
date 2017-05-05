package pset6;
/* after replace the min.html with minandax.hrml, there are 27 failures, these failure are caused by faulty test cases, because the default result for the minandmax is
 * to find the maximum number, but out test suites are expecting the minimum number. 
 * */
import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class MinWebTestSuite {
	private static WebDriver wd;
	private WebElement we;
	private WebElement result;
	private String output;

	@BeforeClass
	public static void initialize() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/tony zhang/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
		wd = new FirefoxDriver();
		wd.get("file:///C:/Users/tony zhang/Desktop/EE 422C/problemset6/min.html");
	}

	@Test
	public void test0() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test1() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test2() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test3() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test4() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test5() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test6() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test7() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test8() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test9() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test10() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test11() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test12() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test13() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test14() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test15() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test16() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test17() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test18() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test19() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test20() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test21() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test22() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test23() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test24() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test25() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test26() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test27() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test28() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test29() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test30() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test31() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("six");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test32() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test33() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test34() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test35() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test36() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test37() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test38() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test39() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test40() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test41() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test42() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, -2, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test43() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test44() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, -2, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test45() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test46() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, -2, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test47() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test48() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test49() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test50() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 0, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test51() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test52() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 0, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test53() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test54() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 0, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test55() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test56() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test57() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test58() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 8, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test59() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test60() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 8, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test61() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test62() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(-2, 8, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test63() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test64() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test65() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test66() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test67() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test68() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test69() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test70() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test71() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test72() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test73() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test74() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -2, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test75() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test76() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -2, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test77() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test78() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, -2, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test79() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test80() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test81() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test82() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test83() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test84() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test85() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test86() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 0, 8) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test87() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test88() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test89() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test90() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 8, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test91() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test92() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 8, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test93() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test94() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(0, 8, 8) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test95() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test96() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test97() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test98() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test99() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test100() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test101() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test102() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test103() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("six");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test104() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test105() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test106() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, -2, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test107() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test108() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, -2, 0) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test109() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test110() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, -2, 8) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test111() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test112() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test113() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test114() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 0, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test115() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test116() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 0, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test117() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test118() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 0, 8) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test119() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test120() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("Please enter integer values only!", output);
		wd.navigate().refresh();
	}

	@Test
	public void test121() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("six");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test122() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 8, -2) = -2", output);
		wd.navigate().refresh();
	}

	@Test
	public void test123() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-2");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test124() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 8, 0) = 0", output);
		wd.navigate().refresh();
	}

	@Test
	public void test125() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@Test
	public void test126() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		output = result.getText();
		assertEquals("min(8, 8, 8) = 8", output);
		wd.navigate().refresh();
	}

	@Test
	public void test127() {
		we = wd.findElement(By.id("x"));
		we.sendKeys("8");
		we = wd.findElement(By.id("y"));
		we.sendKeys("8");
		we = wd.findElement(By.id("z"));
		we.sendKeys("8");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		output = result.getText();
		wd.navigate().refresh();
	}

	@AfterClass
	public static void teardown() {
		wd.quit();
	}
}
