package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class BouletcorpPage {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'à propos')]")
	public static WebElement btnApropos;
	
	@FindBy(how = How.XPATH, using = "//img[@src='/buttons/masto.png']")
	public static WebElement btnFacebook;
	
	@FindBy(how = How.XPATH, using = "//img[@src='/buttons/insta.png']")
	public static WebElement btnInstagram;
	
	@FindBy(how = How.XPATH, using = "//img[@src='/buttons/twitch.png']")
	public static WebElement btnTwitter;

	public BouletcorpPage() {
		PageFactory.initElements(Setup.driver, this);
	}

}
