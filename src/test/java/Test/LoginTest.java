package Test;
import org.testng.annotations.Test;
import GenericUtils.DriverUtils;
import Page.Admin;
import Page.LoginPage;
public class LoginTest extends BaseTest {
	@Test
	public void Login() throws InterruptedException {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
		Thread.sleep(5000);
		
		Admin admin = new Admin();
		admin.admin();
		admin.add();
		admin.adminSelect();
		admin.role();
		Thread.sleep(5000);
		admin.employee("Cecil  Bonaparte");
		admin.username("Zeeshan");
		admin.password("Zeeshan@123");
		admin.confirmPassword("Zeeshan@123");
		admin.pim();
		admin.adClick();
		admin.firstName("Esha");
		admin.lastName("Khan");
		admin.EmpId("2780");
		admin.SaveClick();
		
}

}
