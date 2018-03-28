package testing;

import org.junit.jupiter.api;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import javax.swing.JOptionPane;
import org.junit.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;
class test1 {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("https://ar-ar.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("raya.mah.987@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("rayamah987");
		Select x=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		x.selectByIndex(6);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
