package testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://ar-ar.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("raya.mah.987@gmail.com");
driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("rayamah987");
Select x=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
x.selectByIndex(6);
driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
