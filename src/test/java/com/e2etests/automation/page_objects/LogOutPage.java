package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import com.e2etests.automation.utils.Setup;

public class LogOutPage {



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
		
	}

}
