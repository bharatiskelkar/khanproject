package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {
	
	@FindBy(xpath="//span[text()='Edit Profile']")
	private WebElement Editpro;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement Nickname;
	
	public EditProfile(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void profile()
	{
		Editpro.click();
	}
	
	public void name()
	{
		Nickname.clear();
		Nickname.sendKeys("Bharati");
	}

}
