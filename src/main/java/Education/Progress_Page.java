package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress_Page {
	
	@FindBy(xpath="//span[text()='Progress']")
	private WebElement ProgressTab;
	
	@FindBy(xpath="(//button[@aria-expanded='false'])[4]")
	private WebElement Days;
	
	@FindBy(xpath="//span[text()='Last 30 days']")
	private WebElement Lastthirtyday;
	
	@FindBy(xpath="//button[@data-test-id='course-type-filter']")
	private WebElement Content;
	
	@FindBy(xpath="//span[text()='Course mastery goals']")
	private WebElement Coursegoals;
	
	@FindBy(xpath="(//button[@aria-haspopup='listbox'])[3]")
	private WebElement AllActivity;
	
	@FindBy(xpath="//span[text()='Unit tests']")
	private WebElement Unit;
	
	public Progress_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void progresslink()
	{
		ProgressTab.click();
	}
	
	public void dayslist()
	{
		Days.click();
	}
	
	public void thirtyday()
	{
		Lastthirtyday.click();
	}
	
	public void contentdata()
	{
		Content.click();
	}
	
	public void goals()
	{
		Coursegoals.click();
	}
	
	public void activity()
	{
		AllActivity.click();
	}
	
	public void unittest()
	{
		Unit.click();
	}
	
	

}
