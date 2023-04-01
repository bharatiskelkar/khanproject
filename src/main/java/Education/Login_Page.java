package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	// step 1-to declare global veriable or data member
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Loginlink;
	
	@FindBy(xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-1-wb-id-field']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SubmitButton;
	
	//step2- initialise variable 
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3- method creation
	public void login()
	{
		Loginlink.click();
	}
	
	public void username()
	{
		Username.sendKeys("Bharatiskelkar@gmail.com");
	}
	
	public void pwd()
	{
		Password.sendKeys("khan@1234567");;
	}
	
	public void submitbtn()
	{
		SubmitButton.click();
	}

}
