package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.Setup;

public class LoginPage {



	/* @FindBy */

	@FindBy(how = How.ID, using = "user-name")
	public static WebElement userName;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Products')]")
	public static WebElement productMessage;

	@FindBy(how = How.XPATH, using = "//h3[@data-test='error']")
	public static WebElement messageErreur;

	public LoginPage() {
		PageFactory.initElements(Setup.driver, this);
		
	}

	/* Create methode */
	
	/*
	public void FillUserName(String name ) {
		
		userName.sendKeys(name);
	}
	
	public void FillPas(String pass ) {
		password.sendKeys(pass);
	}
	public void clickOnBtn() {
		btnLogin.click();
	}
	
	*/
/*
	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
		userName.clear();
		userName.sendKeys(configFileReader.getProperties("home.login"));
		password.clear();
		password.sendKeys(configFileReader.getProperties("home.password"));
		btnLogin.click();

	}

	public void loginNp() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
		userName.clear();
		userName.sendKeys(configFileReader.getProperties("home.loginNp"));
		password.clear();
		password.sendKeys(configFileReader.getProperties("home.passwordNp"));
		btnLogin.click();

	}
*/
}
