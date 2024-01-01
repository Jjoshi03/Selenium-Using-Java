package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch ele= new ElementFetch();
	
	public void verifyIfLoginPageIsLoaded()
	{
		//Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element not found-------");
		if(ele.getWebElement("XPATH",LoginPageElements.loginText).isDisplayed())
		{
			System.out.print("Page Found");
		}
	}
	
	public void enterCredentials()
	{
		//ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("jankijoshi310@gmail.com");
		//ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("12345");
		//ele.getWebElement("XPATH", LoginPageElements.loginText).click();
		
		WebElement emailField = ele.getWebElement("XPATH", LoginPageElements.emailAddress);
        WebElement passwordField = ele.getWebElement("XPATH", LoginPageElements.passwordField);
        WebElement loginButton = ele.getWebElement("XPATH", LoginPageElements.loginText);
        
        emailField.sendKeys("jankijoshi310@gmail.com");
        passwordField.sendKeys("12345");
        loginButton.click();

	}
}
