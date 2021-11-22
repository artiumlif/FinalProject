package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Click on element")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("Update text element")
    public static void updateText(WebElement elem,String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }
    @Step("Update text element as human")
    public static void updateTextHuman(WebElement elem,String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch : text.toCharArray())
        {
            Uninterruptibles.sleepUninterruptibly(200, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch + "");
        }
    }
    @Step("Update drop down element")
    public static void updateDropDown(WebElement elem,String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
//        dropDown.selectByVisibleText(text);
    }

    @Step("Update text element")
    public static void mouseHover(WebElement elem1,WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step("Update text element")
    public static void mouseHover(WebElement elem1)
    {
        action.moveToElement(elem1).click().build().perform();
    }

    @Step("Double click on element")
    public static void doubleClick(WebElement elem)
    {
        action.doubleClick(elem).build().perform();
    }

    @Step("Insert key")
    public static void insertkey(WebElement elem,Keys value)
    {
        elem.sendKeys(value);
    }

}
