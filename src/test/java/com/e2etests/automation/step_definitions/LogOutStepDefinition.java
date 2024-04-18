package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.LogOutPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStepDefinition {

	private LogOutPage logOutPage;

	public LogOutStepDefinition() {
		this.logOutPage = new LogOutPage();
	}

	@When("Je clique sur le menu burger")
	public void jeCliqueSurLeMenuBurger() {
		logOutPage.clickOnBouttonBurger();
	}

	@When("Je clique sur Logout")
	public void jeCliqueSurLogout() throws InterruptedException {
		logOutPage.clickOnBtnLogout();
		;
	}

	@Then("Je me redirige vers la page authentification Swag labs {string}")
	public void jeMeRedirigeVersLaPageAuthentificationSwagLabs(String text) {
		String message = LogOutPage.authentificationMessage.getText();
		Assert.assertEquals(message, text);

	}

	@When("Je clique sur le boutton  about")
	public void jeCliqueSurLeBouttonAbout() throws InterruptedException {
		logOutPage.clickOnBtnAbout();
	}

	@Then("Je me redirige vers la page about {string}")
	public void jeMeRedirigeVersLaPageAbout(String url) {
		String currentUrl=Setup.getDriver().getCurrentUrl();
		Assert.assertEquals(currentUrl,url);
	}

}
