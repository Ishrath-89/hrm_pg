package GenericUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverUtils {
	static WebDriver driver;
public static void createDriver(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ISHRSYED\\Documents\\Java STS\\hrm_pg\\src\\test\\resources\\driver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
public static WebDriver getDriver(){
	if(driver== null) {
		createDriver();
		}
	return driver;
}
	static WebDriver driver1;
	public static void createDriver1(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ISHRSYED\\Documents\\Java STS\\hrm_pg\\src\\test\\resources\\driver\\chromedriver.exe" );
		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	public static WebDriver getDriver1(){
		if(driver1== null) {
			createDriver1();
			}
		return driver1;
	
	
	}
}