package TestingProject;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Base;
import Education.Courses_Page;
import Education.Login_Page;
import Education.Logout_Page;
import Education.Profile_Page;
import Education.Progress_Page;
import Education.Teacher_page;
import Utils.Utility;

public class cross extends Base{
	
		int testID;
		WebDriver driver;
		
		Login_Page login;
		Courses_Page course;
		Profile_Page prof;
		Logout_Page logout;
		Teacher_page teach;
		Progress_Page progress;
		
		@Parameters("Browser")
		
		@BeforeTest
		public void openBrowser(String browsername) {
			System.out.println(browsername);
			
			if (browsername.equals("Chrome")) 
			{
				driver=OpenCromeBrowser();
			}
			
			if (browsername.equals("FireFox")) 
			{
				driver=OpenFirefoxBrowser();
			}
			
			if (browsername.equals("Edge")) 
			{
				driver=OpenEdgeBrowser();
			}
			
			driver.get("https://www.khanacademy.org/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}

		

		@BeforeClass
		public void beforeclass() {
			login=new Login_Page(driver);
			course=new Courses_Page(driver);
			prof=new Profile_Page(driver);
			progress=new Progress_Page(driver);
			teach=new Teacher_page(driver);
			logout=new Logout_Page(driver);
			
		}
		
		@BeforeMethod
		public void beforemethod() {
			
			login.login();
			login.username();
			login.pwd();
			login.submitbtn();
		}
		
		@Test
		
		public void CoursesPage()
		{
			testID=1;
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
			
			testID=2;
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
			
			testID=3;
			progress.progresslink();
			String url = driver.getCurrentUrl();
			String title= driver.getTitle();
			System.out.println(title);
//			Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/progress");
//			Assert.fail();
			progress.dayslist();
			progress.thirtyday();
			progress.contentdata();
			progress.goals();
			progress.activity();
			progress.unittest();
		}
		
		@Test
		public void teacherpage() {
			testID=4;
			teach.Teachertab();
			String url = driver.getCurrentUrl();
			String title= driver.getTitle();
			System.out.println(title);
			//Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/teachers");
			if(url.equals("https://www.khanacademy.org/profile/me/teachers")) {
				System.out.println("Test case is Passed");
			}
			else {
				System.out.println("Test case is failed");
			}
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
		public void aftermethod(ITestResult result) throws IOException 
		{
		
			if(ITestResult.FAILURE == result.getStatus() ) 
			{
				Utility.capturescreenshot(driver, testID);
			}
			
			logout.logging();
			logout.logout();
			
		}
		
		@AfterClass
		public void afterclass() {
			login=null;
			course=null;
			prof=null;
			progress=null;
			teach=null;
			logout=null;
			
		}
		
		@AfterTest
		public void browserclose()
		{
			System.gc();//garbage collector use to free the unused object memory
			driver.close();
		}

	}

