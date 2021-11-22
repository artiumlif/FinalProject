package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertTrue;

public class Verifications extends CommonOps
{
    @Step("Verify text in element")
    public static void VerifyTextInElement(WebElement elem, String expected)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals (elem.getText(),expected);
    }

    @Step("Verify number of elements")
    public static void numberOfElements(List<WebElement> elems, int expected)
    {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expected);
    }

    @Step("Verify profile updated")
    public static void varifyProfileUpdated(WebElement elem, String expected)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals (elem.getText(),expected);
    }

    @Step("Verify visibiltiy of element (Soft Assertion)")
    public static void visibiltiyOfElement(List<WebElement> elems)
    {
        for (WebElement elem:elems) {
            softAssert.assertTrue(elem.isDisplayed(),"Sory" + elem.getText() + "not displayed");
        }
        softAssert.assertAll("Some elemants were not displayed");
    }

    @Step("Verify element visually")
    public static void visualElement(String expectedImageName)
    {
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".PNG");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File: " + findFailed);
            fail("Error Comparing Image File: " + findFailed);
        }
    }

    @Step("Verify date displayed")
    public static void existenceOfDate(List<WebElement> elements)
    {
      assertTrue(elements.size() > 0);
    }

    @Step("Verify date not displayed")
    public static void nonExistenceOfDate(List<WebElement> elements)

    {
        assertFalse(elements.size() > 0);
    }

    @Step("Verify text with text")
    public static void verifyText(String actual,String expected){
        assertEquals(actual, expected);
    }

    @Step("Number text with Number")
    public static void verifyNumber(int actual,int expected){
        assertEquals(actual, expected);
    }
}
