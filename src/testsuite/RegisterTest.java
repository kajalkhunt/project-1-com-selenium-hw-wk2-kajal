package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = " https://demo.nopcommerce.com/ ";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on Register link
        clickOnElement(By.linkText("Register"));
        // This is from requirement
        String expectedMessage = "Register";
        //Verify the text Register
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
        // Validate actual and expected message
        Assert.assertEquals("Register ",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Click on Register link
        clickOnElement(By.linkText("Register"));
        clickOnElement(By.xpath("//input[@type='radio' and @value='M']"));
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"Ankur");
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Shah");
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[@value='1']"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']/option[@value='12']"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthYear']/option[@value='1978']"));
        sendTextToElement(By.xpath("//input[@id='Email']"),"A.Shah3@gmail.com");
        sendTextToElement(By.xpath("//input[@id='Password']"),"AS1234");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"AS1234");
        clickOnElement(By.xpath("//button[@id='register-button']"));
        String expectedMessage = "Your registration completed";
        //Verify the text Register
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals("Your registration is not completed ",expectedMessage, actualMessage);
    }
    @After
    public void testDown(){
        // closeBrowser();
    }

}
