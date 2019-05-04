package Test_Techbodi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestiNgWithMaven {
	public static WebDriver driver;
	  @Test
	  public void f()  {
		  
		  driver.get("https://www.google.com/");
		  String Googletitile = driver.getTitle();
		  System.out.println(Googletitile);
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

	}





