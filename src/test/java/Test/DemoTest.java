package Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import GenericUtils.DriverUtils;
	public class DemoTest {
	WebDriver driver1;
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException
	{
		DriverUtils.createDriver1();
		
	}
}
