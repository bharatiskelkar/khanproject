package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacher_page {
	
	@FindBy(xpath="//span[text()='Teachers']")
	private WebElement Teachertab;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement TeacherEmailId;
	
	@FindBy(xpath="//input[@id='add-coach']")
	private WebElement AddTeacherButton;
	
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement Acceptteacher;
	
	@FindBy(xpath="//button[@class='remove simple-button']")
	private WebElement RemoveTeacher;
	
	@FindBy(xpath="//button[@data-test-id='remove-coach-button-confirm']")
	private WebElement Removebtn;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement classcodebtn;
	
	@FindBy(xpath="//input[@class='_q92ef6']")
	private WebElement entcd;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//a[@class='_1mwdd64y']")
	private WebElement back;

	public Teacher_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Teachertab()
	{
		Teachertab.click();
	}
	
	public void TeacherEmailId()
	{
		TeacherEmailId.sendKeys("Bharatiskelkar@gmail.com");
	}
	
	public void AddTeacherButton()
	{
		AddTeacherButton.click();
	}
	
	public void acceptTeacherButton()
	{
		Acceptteacher.click();
	}
	
	public void RemoveTeacher()
	{
		RemoveTeacher.click();
	}
	
	public void Removebtn()
	{
		Removebtn.click();
	}
	
	public void classcodebtn()
	{
		classcodebtn.click();
	}
	
	public void entercode()
	{
		entcd.sendKeys("Velo1234");
	}
	
	public void continuecodebtn()
	{
		continuebtn.click();
	}
	
	public void backbtn()
	{
		back.click();
	}
	
	


}
