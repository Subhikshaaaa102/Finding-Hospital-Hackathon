package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class surgeries extends basePage {

	public surgeries(WebDriver driver) {
		super(driver);
	}
	
	//Locator to locate surgery page
	@FindBy(xpath="//*[@class='nav-mid']//*[@title='surgery']")
	WebElement surgeryPage;
	public void surgeryPage() throws InterruptedException {
		//Thread.sleep(3000);
		surgeryPage.click();
	}
	
	//Locator to locate the surgery element
	@FindBy(xpath="//*[@data-qa-id=\"surgical-solution-sub-header\"]")
	WebElement scrollElement;
	public void scrolling() {
		BaseClass baseClass = new BaseClass();
		baseClass.Scroll(scrollElement);
	}
	
	//Locator to locate all surgeries box
	@FindBy(xpath="//*[@class='mt-12px AilmentItem-module_itemText__XvCHL']")
	List<WebElement> surgeries;
	public List<String> surgeriess() throws InterruptedException{
		Thread.sleep(3000);
		List<String> surgeriesList = new ArrayList<String>();
		for(WebElement e : surgeries) {
			surgeriesList.add(e.getText());
		}
		return surgeriesList;
	}
}
