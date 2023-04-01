package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Courses_Page {
	
	@FindBy(xpath="(//span[text()='Courses'])[2]")
	private WebElement Courses;
	
	@FindBy(xpath="(//a[@class='_19oyg81o'])[1]")
	private WebElement SeeAllCourses;
	
	@FindBy(xpath="//div[text()='Interest and debt']")
	private WebElement Intanddept;
	
	@FindBy(xpath="//div[text()='Housing']")
	private WebElement Housingdept;
	
	@FindBy(xpath="//div[text()='Inflation']")
	private WebElement Inflationdept;
	
	@FindBy(xpath="//div[text()='Taxes']")
	private WebElement Taxesdept;
	
	@FindBy(xpath="//div[text()='Accounting and financial statements']")
	private WebElement Accountingdept;
	
	@FindBy(xpath="(//a[@class='_19oyg81o'])[2]")
	private WebElement Highseeall;
	
	@FindBy(xpath="//div[text()='Displaying a single quantitative variable']")
	private WebElement Display;
	
	@FindBy(xpath="//div[text()='Analyzing a single quantitative variable']")
	private WebElement Analysecourse;
	
	@FindBy(xpath="//div[text()='Two-way tables']")
	private WebElement Twowy;
	
	@FindBy(xpath="//div[text()='Scatterplots']")
	private WebElement Scatterplots;
	
	@FindBy(xpath="//div[text()='Study design']")
	private WebElement Studydesign;
	
	public Courses_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void course()
	{
		Courses.click();
	}
	
	public void seeallcourses()
	{
		SeeAllCourses.click();
	}
	
	public void housing()
	{
		Housingdept.click();
	}
	
	public void intanddept()
	{
		Intanddept.click();
	}
	
	public void inflation()
	{
		Inflationdept.click();
	}
	
	public void tax()
	{
		Taxesdept.click();
	}
	
	public void account()
	{
		Accountingdept.click();
	}
	
	public void highschoolall()
	{
		Highseeall.click();
	}
	
	public void disp()
	{
		Display.click();
	}
	
	public void analyse()
	{
		Analysecourse.click();
	}
	
	public void twoway()
	{
		Twowy.click();
	}
	
	public void scatter()
	{
		Scatterplots.click();
	}
	
	public void study()
	{
		Studydesign.click();
	}
	
	
	
	

}
