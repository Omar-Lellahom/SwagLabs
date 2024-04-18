package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LogOutPage {

	private ConfigFileReader configFileReader;

	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement btnBurger;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement btnLogOut;

	@FindBy(how = How.ID, using = "about_sidebar_link")
	public static WebElement btnAbout;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Swag Labs')]")
	public static WebElement authentificationMessage;

	public LogOutPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	public void clickOnBouttonBurger() {

		btnBurger.click();
	}

	public void clickOnBtnLogout() throws InterruptedException {
		 //Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		WebElement btnLogOut;
		btnLogOut = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		btnLogOut.click();
	}

	public void clickOnBtnAbout() throws InterruptedException {

		// Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		WebElement btnAbout;
		btnAbout = wait.until(ExpectedConditions.elementToBeClickable(By.id("about_sidebar_link")));
		btnAbout.click();
	}
}
