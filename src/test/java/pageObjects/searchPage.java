package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchPage extends basePage {
	public searchPage(WebDriver driver) {
		super(driver);
	}
	
	//Locator to locate city input box
	@FindBy(xpath = "(//input[@class='c-omni-searchbox c-omni-searchbox--small'])[1]")
	public WebElement city;
	public void city(String cities) throws InterruptedException {
		Thread.sleep(3000);
		city.sendKeys(cities);
		city.clear();
		city.sendKeys(cities);
		
	}
	
	//Locator to locate city from dropDown
	@FindBy(xpath="(//*[@class='c-omni-suggestion-group']//div[1])[1]")
	WebElement cityDropDown;
	public void cityDropDown() throws InterruptedException {
		Thread.sleep(3000);
		cityDropDown.click();
	}
	
	//Locator to locate specialty input box
	@FindBy(xpath = "//*[@data-qa-id='omni-searchbox-keyword']")
	WebElement speciality;
	public void speciality(String speciality2) throws InterruptedException {
		Thread.sleep(4000);
		speciality.sendKeys(speciality2);
	}
	
	//Locator to locate specialty from dropDown
	@FindBy(xpath="(//*[@class='c-omni-suggestion-item'])[1]")
	WebElement specialityDropDown;
	public void specialityDropDown() throws InterruptedException {
		Thread.sleep(3000);
		specialityDropDown.click();
	}
}
