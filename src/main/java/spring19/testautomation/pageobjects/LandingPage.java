package spring19.testautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	public By produktDaten = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]/span[2]");
	public By produkt = By
			.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]/span[2]");
	public By produkTyp = By
			.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]");
	public By standardTyp = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]");
	public By verkaufProdukBezeichnung = By
			.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/input[1]");
	public By gtin= By
			.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[2]/input[1]");
	public By alternateIdent= By
			.xpath("//label[contains(text(),'Alternatives Ident')]");
	public By alternativeIds = By.xpath("//div[3]/div[2]/div");

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getProduktdaten() {

		return driver.findElement(produktDaten);
	}

	public WebElement getProdukt() {

		return driver.findElement(produkt);
	}

	public WebElement getProdukTyp() {

		return driver.findElement(produkTyp);
	}

	public WebElement getStandardTyp() {

		return driver.findElement(standardTyp);
	}

	public WebElement getVerkaufProdukBezeichnung() {

		return driver.findElement(verkaufProdukBezeichnung);
	}
	public WebElement getGtin() {

		return driver.findElement(gtin);
	}
	public WebElement getAlternateIdent() {

		return driver.findElement(alternateIdent);
	}
	public WebElement getAlternateIdents() {

		return driver.findElement(alternativeIds);
	}
}

