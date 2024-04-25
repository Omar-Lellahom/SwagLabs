package com.e2etests.automation.step_definitions;
import com.e2etests.automation.page_objects.LogOutPage;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStepDefinition {

	private LogOutPage logOutPage;
	private SeleniumUtils seleniumUtils;

	private Validations validations;

	public LogOutStepDefinition() {
		this.logOutPage = new LogOutPage();
		this.seleniumUtils = new SeleniumUtils();
		this.validations = new Validations();

	}

	@When("Je clique sur le menu burger")
	public void jeCliqueSurLeMenuBurger() {
		seleniumUtils.click(logOutPage.btnBurger);

	}

	@When("Je clique sur Logout")
	public void jeCliqueSurLogout() throws InterruptedException {
		seleniumUtils.waitForElementToBeClickable(LogOutPage.btnLogOut);
		seleniumUtils.click(logOutPage.btnLogOut);

	}

	@Then("Je me redirige vers la page authentification Swag labs {string}")
	public void jeMeRedirigeVersLaPageAuthentificationSwagLabs(String text) {
		validations.assertEquals(LogOutPage.authentificationMessage, text);

	}

	@When("Je clique sur le boutton  about")
	public void jeCliqueSurLeBouttonAbout() throws InterruptedException {
		seleniumUtils.waitForElementToBeClickable(LogOutPage.btnAbout);
		seleniumUtils.click(logOutPage.btnAbout);
	}

	@Then("Je me redirige vers la page about {string}")
	public void jeMeRedirigeVersLaPageAbout(String url) {
		validations.checkChangedURL(url);

	}

}
