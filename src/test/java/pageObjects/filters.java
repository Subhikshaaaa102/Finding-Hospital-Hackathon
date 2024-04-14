package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class filters extends basePage{

	public filters(WebDriver driver) {
		super(driver);
	}
	
	//Locator for review Filter
	@FindBy(xpath="//*[@class='c-filter__box u-pos-rel c-dropdown'][2]")
	WebElement reviewFilter;
	public void reviewFilter() throws InterruptedException {
		reviewFilter.click();
	}
	
	//Locator to locate the first element in the dropdown 
	@FindBy(xpath="//*[@data-qa-id='doctor_review_count_list']//li[1]")
	WebElement  review;
	public void review() throws InterruptedException {
		review.click();
		Thread.sleep(3000);
	}
	
	////Locator for Experience
	@FindBy(xpath="//*[@data-qa-id='years_of_experience_section']")
	WebElement experienceFilter;
	public void experienceFilter() throws InterruptedException {
		experienceFilter.click();
	}
	
	//Locator to locate the first element in the dropdown
	@FindBy(xpath="//*[@data-qa-id='years_of_experience_section']//li[1]")
	WebElement experience;
	public void experience() throws InterruptedException {
		experience.click();
		Thread.sleep(3000);
	}
	
	//Locator to locate All Filters
	@FindBy(xpath="//div[@class='u-d-inlineblock u-color--white u-c-pointer']")
	WebElement priceFilter;
	public void priceFilter() throws InterruptedException {
		priceFilter.click();
	}
	
	//Locator to locate the Fees
	@FindBy(xpath="//label[@for='Fees1']//div[@data-qa-id='Fees_radio']")
	WebElement  price;
	public void price() throws InterruptedException {
		price.click();
		Thread.sleep(3000);
	}
	
	//Locator to locate All Filters
	@FindBy(xpath="//div[@class='u-d-inlineblock u-color--white u-c-pointer']")
	WebElement availabilityFilter;
	public void availabilityFilter() throws InterruptedException {
		availabilityFilter.click();
	}
	
	//Locator to locate the Availability
	@FindBy(xpath="//label[@for='Availability2']//div[@class='c-filter__select--radio u-d-inlineblock u-valign--middle u-pos-rel']")
	WebElement availability;
	public void availability() throws InterruptedException {
		availability.click();
		Thread.sleep(3000);
	}
	
	//Locator to locate the SortBy Filter
	@FindBy(xpath="//span[@class='c-sort-dropdown__selected c-dropdown__selected']")
	WebElement sortByFilter;
	public void sortByFilter() throws InterruptedException {
		sortByFilter.click();
		Thread.sleep(3000);
	}
	
	////Locator to locate the Consultation fee low to high
	@FindBy(xpath="//li[@aria-label='Consultation Fee - Low to High']")
	WebElement sortBy;
	public void sortBy() throws InterruptedException {
		sortBy.click();
		Thread.sleep(3000);
	}
}