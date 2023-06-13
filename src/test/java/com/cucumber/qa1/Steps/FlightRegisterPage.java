package com.cucumber.qa1.Steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.qa1.pages.FlightPage;
import com.cucumber.qa1.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightRegisterPage {

	FlightPage obj;

	@Given("User navigates to purchase Page {string}")
	public void PurchasePage(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);

		obj = new FlightPage();

	}

	@When("User enters Full Name {string}")
	public void FullName(String fullname) {
		obj.fullName(fullname);

	}

	@When("User enters Address {string}")
	public void Address(String address) {
		obj.addressField(address);

	}

	@When("User enters City {string}")
	public void City(String city) {
		obj.cityField(city);

	}

	@When("User etners State {string}")
	public void State(String state) {
		obj.stateField(state);

	}

	@When("User  etners ZipCode {string}")
	public void ZipCode(String zipcode) {
		obj.zipField(zipcode);

	}

	@When("User  etners CreditCardNumber {string}")
	public void CreditCardNumber(String cardnumber) {
		obj.enterCreditCardNum(cardnumber);

	}

	@When("User etners Month {string}")
	public void MonthField(String month) {
		obj.monthField(month);

	}

	@When("User  etners Year {string}")
	public void YearField(String year) {
		obj.yearField(year);

	}

	@When("User enters nameOnCard {string}")
	public void NameOnCardField(String nameoncard) {
		obj.nameOnCard(nameoncard);

	}

	@When("User clicks rememberMe")
	public void RememberMe() {
		obj.rememberField();

	}

	@When("User clicks purchaseButton")
	public void PurchaseButton() {
		obj.purchaseFlightButt();

	}

	@Then("User verifies success message {string}")
	public void VerifiesSuccessMessage(String message) throws InterruptedException {
		obj.verifyMessage(message);

		Thread.sleep(2000);
		Constants.driver.quit();

	}

}
