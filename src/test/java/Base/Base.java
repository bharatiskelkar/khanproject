package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver OpenCromeBrowser() {
		//System.setProperty("Webdriver.crome.driver","C:\\Users\\OMKAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		return driver;
	}
	
	public WebDriver OpenEdgeBrowser() {
		//System.setProperty("Webdriver.crome.driver","C:\\Users\\OMKAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver(); // upcasting
		return driver;
	}
	
	public WebDriver OpenFirefoxBrowser() {
		//System.setProperty("Webdriver.crome.driver","C:\\Users\\OMKAR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver(); // upcasting
		return driver;
	}

}
