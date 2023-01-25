package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import GenericUtils.DriverUtils;
public class DemoPage {
	
		WebDriver driver1;
		public DemoPage(){
		driver1=DriverUtils.getDriver1();PageFactory.initElements(driver1, this);
		}
	}

