
package Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Admin extends BasePage {

	 @FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminClick;
	 @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addClick;
	 @FindBy(xpath = "//div[@class='oxd-select-wrapper']")
	 private WebElement adminSelect;
	 @FindBy(xpath = "(//div[@class='oxd-select-text-input'][1])")
	 private WebElement role;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	 private WebElement employee;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	 private WebElement saveBtn;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimClick;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement adClick;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	private WebElement lastName;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement EmpId;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement SaveClick;
	
	public void admin(){
	adminClick.click();
	}
	public void add()
	{
	addClick.click();
	}
	 public void adminSelect()
	{
	 adminSelect.click();
	 }
	 public void role(){
		 role.click();
		 }
	public void employee(String string){
		employee.sendKeys(string);
	}
	public void username(String string){
		username.sendKeys(string);
	}
	public void password(String string)
	{
		password.sendKeys(string);
	}
	public void confirmPassword(String string)
	{
		confirmPassword.sendKeys(string);
	}
	public void pim(){
		pimClick.click();
		}
	public void adClick(){
		adClick.click();
		}
	public void firstName(String string){
		firstName.sendKeys(string);
		}
	public void lastName(String string){
		lastName.sendKeys(string);
		}
	public void EmpId(String string){
		EmpId.sendKeys(string);
		}
	public void SaveClick(){
		SaveClick.click();
		}
	
}
	




