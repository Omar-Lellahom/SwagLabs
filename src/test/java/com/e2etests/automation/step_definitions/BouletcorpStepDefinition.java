package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;
import io.cucumber.java.fr.Quand;

public class BouletcorpStepDefinition {
	private BouletcorpPage bouletcorpPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;

	public BouletcorpStepDefinition() {
		this.bouletcorpPage = new BouletcorpPage();
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
	}

	@Etantdonné("Je me rends  sur le site  bouletcorp")
	public void jeMeRendsSurLeSiteBouletcorp() {
		seleniumUtils.get(configFileReader.getProperties("home.urlBouletcorp"));
	}

	@Quand("Je clique sur l onglet  Apropos")
	public void jeCliqueSurLOngletApropos() {
		seleniumUtils.waitForElementToBeClickable(bouletcorpPage.btnApropos);
		seleniumUtils.click(bouletcorpPage.btnApropos);

	}

	@Alors("la page a changé {string}")
	public void laPageAChangé(String string) {
		validations.checkChangedURL(string);
	}

	@Alors("les widgets facebook,twitter et instagram sont affichés")
	public void lesWidgetsFacebookTwitterEtInstagramSontAffichés() {
		validations.isElementDisplayed(bouletcorpPage.btnFacebook);
		validations.isElementDisplayed(bouletcorpPage.btnInstagram);
		validations.isElementDisplayed(bouletcorpPage.btnTwitter);

	}

}
