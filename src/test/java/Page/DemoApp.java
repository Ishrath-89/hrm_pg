package Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	public class DemoApp extends DemoPage{
		
		@FindBy(xpath ="//input[@id='Email']")
		private WebElement entermailId;
		@FindBy(xpath ="//input[@name='Password']")
		private WebElement enterPassword;
		@FindBy(xpath ="//input[@class='button-1 login-button']")
		private WebElement logInnClick;
		/*@FindBy(xpath ="(//a[@href='/books'])[1]")
		private WebElement booksClick;
		@FindBy(xpath ="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
		private WebElement cart;*/
		@FindBy(xpath ="//a[@href='/computers']")
		private WebElement comp;
		@FindBy(xpath ="(//a[@title='Show products in category Notebooks'])[1]")
		private WebElement noteb;
		@FindBy(xpath ="//input[@class='button-2 product-box-add-to-cart-button']")
		private WebElement notesCart;
		
		public void mailId(String string){
			entermailId.sendKeys(string);
		}
		public void EnterPassword(String string){
			enterPassword.sendKeys(string);
		}
		public void logInnbtn() {
			logInnClick.click();
		}
		/*public void book() {
			booksClick.click();
		}
		public void AdCart() {
			cart.click();
		}*/
		public void Computers() {
			comp.click();
		}
		public void Notebooks() {
			noteb.click();
		}
		public void noteCart() {
			notesCart.click();
		}
}
