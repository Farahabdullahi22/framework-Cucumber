package com.cucumber.qa1.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.cucumber.qa1.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightPage {

	@FindBy(id = "inputName")
	WebElement firstLastField;

	@FindBy(id = "address")
	WebElement addressField;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipCodeField;

	@FindBy(xpath = "//select[@id='cardType']//option") // this is not working
	List<WebElement> cardTypeField;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumber;

	@FindBy(id = "creditCardMonth")
	WebElement MonthField;

	@FindBy(id = "creditCardYear")
	WebElement YearField;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement rememberMeField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement purchaseButton;
	
	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement successMessage; 
	
	// we are creating Class Constructor

	public FlightPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	public void fullName(String firstLastName) {
		firstLastField.sendKeys(firstLastName);
	}

	public void addressField(String addrress) {
		addressField.sendKeys(addrress);

	}

	public void cityField(String city) {
		cityField.sendKeys(city);

	}

	public void stateField(String state) {
		stateField.sendKeys(state);

	}

	public void zipField(String zipCode) {
		zipCodeField.sendKeys(zipCode);

	}

	public void cardTypeField() {

		for (WebElement ec : cardTypeField) {
			String card = ec.getText();
			if (card.equals(ec)) {
				ec.click();
				break;
			}

		}
	}

	public void enterCreditCardNum(String cardNum) {
		creditCardNumber.sendKeys(cardNum);
	}

	public void monthField(String month) {
		MonthField.clear();
		MonthField.sendKeys(month);
	}

	public void yearField(String year) {
		YearField.clear();
		YearField.sendKeys(year);
	}

	public void nameOnCard(String cardFieldName) {
		nameOnCardField.sendKeys(cardFieldName);
	}

	public void rememberField() {
		rememberMeField.click();

	}

	public void purchaseFlightButt()  {
		purchaseButton.click();

	}
	
	public void verifyMessage(String message) {
		String verifyMessage = successMessage.getText();
		if (verifyMessage.equals(message)) {
			System.out.println("passed");
		}else {
			System.out.println("falled");
			
		}
	}
	


}
