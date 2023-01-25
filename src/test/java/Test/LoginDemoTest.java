package Test;
import org.testng.annotations.Test;
import GenericUtils.DriverUtils;
import Page.DemoApp;


	public class LoginDemoTest  extends DemoTest {
	
		@Test
		public void LoginDemo() throws InterruptedException {
			DriverUtils.getDriver1().get("https://demowebshop.tricentis.com/login");
			Thread.sleep(5000);
			DemoApp dmp = new DemoApp();
			dmp.mailId("ishrathsd6666@gmail.com");
			dmp.EnterPassword("123456789");
			dmp.logInnbtn();
			//dmp.book();
			//dmp.AdCart();
			dmp.Computers();
			dmp.Notebooks();
			dmp.noteCart();
		}
	}
