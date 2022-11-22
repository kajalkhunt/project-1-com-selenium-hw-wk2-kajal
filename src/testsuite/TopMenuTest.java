package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = " https://demo.nopcommerce.com/ ";


    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
@Test
    public void userShouldNavigateToComputerPageSuccessfully(){
    //Click on Computer link
    clickOnElement(By.linkText("Computers"));
    // This is from requirement
    String expectedMessage = "Computers";
    //Verify the text Computers
    String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));
    // Validate actual and expected message
    Assert.assertEquals("Not verifying Text ",expectedMessage, actualMessage);
}
@Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
    //Click on Electronics link
    clickOnElement(By.linkText("Electronics"));
    // This is from requirement
    String expectedMessage = "Electronics";
    //Verify the text Electronics
    String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));
    // Validate actual and expected message
    Assert.assertEquals("Not verifying Text ",expectedMessage, actualMessage);

}
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Click on Apparel link
        clickOnElement(By.linkText("Apparel"));
        // This is from requirement
        String expectedMessage = "Apparel";
        //Verify the text Electronics
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not verifying Text ",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        //Click on DigitalDownloads link
        clickOnElement(By.linkText("Digital downloads"));
        // This is from requirement
        String expectedMessage = "Digital downloads";
        //Verify the text DigitalDownloads
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not verifying Text ",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully (){
        //Click on Books link
        clickOnElement(By.linkText("Books"));
        // This is from requirement
        String expectedMessage = "Books";
        //Verify the text Books
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not verifying Text ",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully (){
        //Click on Jewelry link
        clickOnElement(By.linkText("Jewelry"));
        // This is from requirement
        String expectedMessage = "Jewelry";
        //Verify the text Jewelry
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not verifying Text ",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully () {
        //Click on Gift Cards link
        clickOnElement(By.linkText("Gift Cards"));
        // This is from requirement
        String expectedMessage = "Gift Cards";
        //Verify the text Gift Cards
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not verifying Text ",expectedMessage, actualMessage);
    }
    @After
    public void closeBrowser(){

        closeBrowser();
    }
    }

