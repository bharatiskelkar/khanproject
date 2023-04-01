package TestingProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import Education.Courses_Page;
import Education.Login_Page;
import Education.Logout_Page;
import Education.Profile_Page;
import Education.Progress_Page;
import Education.Teacher_page;

public class Validation_Page {
	ChromeDriver driver;
	Login_Page login;
	Courses_Page course;
	Profile_Page prof;
	Logout_Page logout;
	Teacher_page teach;
	Progress_Page progress;
	
	
	
	
	@BeforeClass
	public void beforeclass() {
		
		System.setProperty("Webdriver.crome.driver","C:\\Users\\OMKAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://www.khanacademy.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforemethod() {
		login=new Login_Page(driver);
		login.login();
		login.username();
		login.pwd();
		login.submitbtn();
	}
	
	@Test
	
	public void CoursesPage()
	{
		course=new Courses_Page(driver);
		course.course();
		course.seeallcourses();
		driver.navigate().back();
		course.housing();
		driver.navigate().back();
		course.intanddept();
		driver.navigate().back();
		course.inflation();
		driver.navigate().back();
		course.tax();
		driver.navigate().back();
		course.account();
		driver.navigate().back();
		course.highschoolall();
		driver.navigate().back();
		course.disp();
		driver.navigate().back();
		course.analyse();
		driver.navigate().back();
		course.twoway();
		driver.navigate().back();
		course.scatter();
		driver.navigate().back();
		course.study();
		driver.navigate().back();
	}
	
	@Test
	public void profilepage() {
		prof=new Profile_Page(driver);
		prof.profiletab();
		prof.firstbadge();
		prof.profiletab();
		prof.secondbadge();
		prof.profiletab();
		prof.thirdbadge();
		prof.profiletab();
		prof.fourthbadge();
		prof.profiletab();
		prof.fifthbadge();
		prof.profiletab();
		prof.viewAllBadge();
		prof.backprofile();
		prof.chknewbadge();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
	
	@Test
	public void progresspage() {
		progress=new Progress_Page(driver);
		progress.progresslink();
		String url = driver.getCurrentUrl();
		String title= driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/progress","TestCase Passed");
		progress.dayslist();
		progress.thirtyday();
		progress.contentdata();
		progress.goals();
		progress.activity();
		progress.unittest();
	}
	
	@Test
	public void teacherpage() {
		teach=new Teacher_page(driver);
		teach.Teachertab();
		String url = driver.getCurrentUrl();
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/teachers","Test done");
//		if(url.equals("https://www.khanacademy.org/profile/me/teachers")) {
//			System.out.println("Test case is Passed");
//		}
//		else {
//			System.out.println("Test case is failed");
//		}
		teach.TeacherEmailId();
		teach.AddTeacherButton();
		teach.acceptTeacherButton();
		teach.RemoveTeacher();
		teach.Removebtn();
		teach.classcodebtn();
		teach.entercode();
		teach.continuecodebtn();
		teach.backbtn();
	}
	
	@AfterMethod
	public void aftermethod() {
		logout=new Logout_Page(driver);
		logout.logging();
		logout.logout();
		
	}
	
	@AfterClass
	public void afterclass() {
		driver.close();
		
	}

}
