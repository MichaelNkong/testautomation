package spring19.testautomation.resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	static Properties props ;
	
	public WebDriver initializeDriver() throws IOException {
		props = new Properties();
		FileInputStream datei = new FileInputStream("C:\\Users\\nkong\\eclipse-workspace\\testautomation_ftrace\\src\\main\\java\\spring19\\testautomation\\resource\\daten.properties");
		props.load(datei);
		String browserName = props.getProperty("browser");
		if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		driver = new ChromeDriver();
			
		} 
		
		else if(browserName.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			//to do
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
	public static String getUrl() throws IOException {
		props = new Properties();
		FileInputStream datei = new FileInputStream("C:\\Users\\nkong\\eclipse-workspace\\testautomation_ftrace\\src\\main\\java\\spring19\\testautomation\\resource\\daten.properties");
		props.load(datei);
		return props.getProperty("url");

	}

}
