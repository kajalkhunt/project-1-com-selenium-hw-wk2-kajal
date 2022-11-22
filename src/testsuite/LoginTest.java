package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = " https://demo.nopcommerce.com/ ";


    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click on login link
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));

        // This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage, actualMessage);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        // Find the email field element and Type email to email field
        sendTextToElement(By.id("Email"),"ABC324@gmail.com");

        // Find the password field element
        sendTextToElement(By.name("Password"),"test123");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        String expectedMessage = "Log out";
        String actualMessage = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
        Assert.assertEquals(" Logout not valid", expectedMessage, actualMessage);
    }

    @Test
    public void verifyErrorMessage(){
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"),"ABC32@gmail.com");
        // Find the password field element
        sendTextToElement(By.name("Password"),"test123");
        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = getTextFromElement(By.xpath("//div[contains(@class,'message-error')]"));
        Assert.assertEquals(" Username not valid", expectedMessage, actualMessage);
    }

    @After
    public void testDown(){
      // closeBrowser();
    }

}
