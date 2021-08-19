package sprint19.testautomation_ftrace;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spring19.testautomation.pageobjects.LandingPage;
import spring19.testautomation.pageobjects.LoginPage;
import spring19.testautomation.resource.Base;

public class ProduktDatenTest extends Base {
	

	private WebDriver driver;
	
	@Test(enabled=true)
	public void test_verkauf_produkt_anlegen() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver = initializeDriver();
		driver.get(Base.getUrl());
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.getUserName().sendKeys("7151d146.rds.de@emea.teams.ms");
		login.getPasswort().sendKeys("N8U=rQq3%H&tQkgh");
		login.getSignIn().click();
		
		driver.findElement(By.cssSelector(".\\_4dFEnrKjwLg0FAcHHKRwU:nth-child(5) > a > .\\_1wFYDicGG3xt_chbJKTWzd")).click();
	    driver.findElement(By.cssSelector(".aTaS_U3S0eSM0S1ZecZT- li:nth-child(1) .\\_1wFYDicGG3xt_chbJKTWzd")).click();
	    driver.findElement(By.linkText("Verkaufsprodukt anlegen")).click();
	    driver.findElement(By.xpath("//div[@id='root']/div/div[4]/div/div/div[3]/form/div/div/div")).click();
	    driver.findElement(By.xpath("//div[@id='root']/div/div[4]/div/div/div[3]/form/div/div/div/div[2]/div/div/span")).click();
	    driver.findElement(By.cssSelector(".\\_3QaFj4q89FnQFddiY9SJhc:nth-child(2) > .\\_3cXiPxilMrVOoWE3aXSFmz")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div/div/input")).sendKeys("adad new");
	    driver.findElement(By.xpath("//div[@id='root']/div/div[4]/div/div/div[3]/form/div[3]/div/div[2]/input")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div/div[2]/input")).sendKeys("0102584012599");
	    driver.findElement(By.cssSelector(".mt-0 > .\\_3cXiPxilMrVOoWE3aXSFmz:nth-child(2)")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div/div[3]/div/div/input")).sendKeys("156");
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div/div[3]/div[2]/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div/div[3]/div[2]/div/div[2]/div[2]/div/span")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div/div[4]")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div/div[4]/div[2]/div/div/span")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div/div[2]/div[2]/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div[2]/div/span")).click();
	    driver.findElement(By.cssSelector("//div[@id='root']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div[3]/div")).click();
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[3]/form[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div[3]/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div[4]/div/span")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div[4]/div/span")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[3]/div[2]/div[4]/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[3]/form/div[4]/div/button[2]")).click();
	    driver.close();
	 	}

	@Test(enabled = false)
	public void testNeueVorlageInfoAnlagen() throws IOException {
		driver = initializeDriver();
		driver.get(Base.getUrl());
		LoginPage login = new LoginPage(driver);
		login.getUserName().sendKeys("7151d146.rds.de@emea.teams.ms");
		login.getPasswort().sendKeys("N8U=rQq3%H&tQkgh");
		login.getSignIn().click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".\\_4dFEnrKjwLg0FAcHHKRwU:nth-child(7) > a > .\\_1wFYDicGG3xt_chbJKTWzd"))
				.click();
		driver.findElement(By.cssSelector(".\\_2JKDQ4kF0KoGxQizRgsLWb > li:nth-child(6) .\\_1wFYDicGG3xt_chbJKTWzd"))
				.click();
		driver.findElement(By.cssSelector(".row:nth-child(1) > .col-md-4:nth-child(1) .HdilDftuW5eACU2a_4ljL svg"))
				.click();
		driver.findElement(By.cssSelector(".\\_2SC-EMQDTX42z57pSo1nio:nth-child(2) > .\\_3cXiPxilMrVOoWE3aXSFmz"))
				.click();
		driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("unternehmen ja 13");
	    driver.findElement(By.cssSelector(".\\_2SC-EMQDTX42z57pSo1nio:nth-child(3)")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/div/div")).click();
	    driver.findElement(By.cssSelector(".\\_2SC-EMQDTX42z57pSo1nio:nth-child(4) > .\\_3cXiPxilMrVOoWE3aXSFmz")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[3]/input")).sendKeys("hhhhh");
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[4]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[4]/div/div/div[2]/div[2]/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[5]/div")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[5]/div[2]/div/label/span")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[5]/div[2]/div[2]/label/span")).click();
	    driver.findElement(By.cssSelector(".row:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".\\_2lRJ9IK6CFyAaDFF6a6BQb:nth-child(7) > .\\_3I89tdEKH4jHVJvP4QieX7")).click();
	    driver.findElement(By.cssSelector(".\\_2lRJ9IK6CFyAaDFF6a6BQb:nth-child(8) > .\\_3I89tdEKH4jHVJvP4QieX7")).click();
	    driver.findElement(By.cssSelector(".\\_2SC-EMQDTX42z57pSo1nio:nth-child(9)")).click();
	    driver.findElement(By.xpath("//div[@id=\'root\']/div/div[4]/div/div/div[2]/div/div[2]/form/div/div[2]/div[2]/div[6]/div[2]/div/label/span")).click();
	    driver.findElement(By.cssSelector(".row:nth-child(2)")).click();
	    driver.close();
	}

}