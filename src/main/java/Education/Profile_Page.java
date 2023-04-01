package Education;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_Page {
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement Profile;
	
	@FindBy(xpath="(//div[@class='achievement-badge compact badge-overlay'])[1]")
	private WebElement Firstbadge;
	
	@FindBy(xpath="(//div[@class='achievement-badge compact badge-overlay'])[2]")
	private WebElement Secondbadge;
	
	@FindBy(xpath="(//div[@class='achievement-badge compact badge-overlay'])[3]")
	private WebElement Thirdbadge;
	
	@FindBy(xpath="(//div[@class='achievement-badge compact badge-overlay'])[4]")
	private WebElement Fourthbadge;
	
	@FindBy(xpath="(//div[@class='achievement-badge compact badge-overlay'])[5]")
	private WebElement Fifthbadge;
	
	@FindBy(xpath="(//a[text()='View all'])[2]")
	private WebElement ViewAllBadge;
	
	@FindBy(xpath="//a[@class='_1g8isxy8']")
	private WebElement Backprofile;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement Chknewbadge;
	
	
	
	public Profile_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void profiletab()
	{
		Profile.click();
	}
	
	public void firstbadge()
	{
		Firstbadge.click();
	}
	
	public void secondbadge()
	{
		Secondbadge.click();
	}
	
	public void thirdbadge()
	{
		Thirdbadge.click();
	}
	
	public void fourthbadge()
	{
		Fourthbadge.click();
	}
	
	public void fifthbadge()
	{
		Fifthbadge.click();
	}
	
	public void viewAllBadge()
	{
		ViewAllBadge.click();
	}
	
	public void backprofile()
	{
		Backprofile.click();
	}
	
	public void chknewbadge()
	{
		Chknewbadge.click();	
	}

}
