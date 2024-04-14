package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//To make driver available for all element
public class basePage {
	WebDriver driver;
	basePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
}
