package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;
import com.e2etests.automation.utils.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {

	private LoginPage loginPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;
	

	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
		this.seleniumUtils = new SeleniumUtils();
		this.validations = new Validations();
		this.configFileReader = new ConfigFileReader();
	}

	@Given("Je me connect a l application Swag Labs")
	public void jeMeConnectALApplicationSwagLabs() throws InterruptedException {
		// loginPage.login();
		seleniumUtils.get(configFileReader.getProperties("home.url"));
		seleniumUtils.writeText(loginPage.userName, configFileReader.getProperties("home.login"));
		long mediumWait = seleniumUtils.getWait("MediumWait");
		Thread.sleep(mediumWait);
		seleniumUtils.writeText(loginPage.password, configFileReader.getProperties("home.password"));
		seleniumUtils.click(loginPage.btnLogin);

	}

	@Given("Je me connect a l application Swag Labs avec  incorrect coordoner")
	public void jeMeConnectALApplicationSwagLabsAvecIncorrectCoordoner() {
		// loginPage.loginNp();
		seleniumUtils.get(configFileReader.getProperties("home.url"));
		seleniumUtils.writeText(loginPage.userName, configFileReader.getProperties("home.loginNp"));
		seleniumUtils.writeText(loginPage.password, configFileReader.getProperties("home.passwordNp"));
		seleniumUtils.waitForElementToBeClickable(loginPage.btnLogin);
		seleniumUtils.click(loginPage.btnLogin);
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
		// String message = LoginPage.productMessage.getText();
		// Assert.assertEquals(message, string);
		validations.assertEquals(loginPage.productMessage, string);

	}

	@Then("Un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String string) {
		// String messageErreur = LoginPage.messageErreur.getText();
		// Assert.assertEquals(messageErreur, string);
		validations.assertEquals(loginPage.messageErreur, string);

	}

}
