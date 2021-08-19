package spring19.testautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	By username = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]");
	By passwort = By.xpath("html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]");
	By signin = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserName() {

		return driver.findElement(username);
	}

	public WebElement getPasswort() {

		return driver.findElement(passwort);
	}

	public WebElement getSignIn() {

		return driver.findElement(signin);
	}
}
