package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	@FindBy(xpath="//span[@class='_wozql4 _13hnk7qk']")
	private WebElement Logginglink;
	
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement Logout;

	public Logout_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logging()
	{
		Logginglink.click();
	}
	
	public void logout()
	{
		Logout.click();
	}

}
