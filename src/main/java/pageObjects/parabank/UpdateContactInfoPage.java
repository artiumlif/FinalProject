package pageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdateContactInfoPage {

    @FindBy(how = How.ID, using = "customer.firstName")
    public WebElement txt_firstName;

    @FindBy(how = How.ID, using = "customer.lastName")
    public WebElement txt_lastName;

    @FindBy(how = How.ID, using = "customer.address.street")
    public WebElement txt_address;

    @FindBy(how = How.ID, using = "customer.address.city")
    public WebElement txt_city;

    @FindBy(how = How.ID, using = "customer.address.state")
    public WebElement txt_state;

    @FindBy(how = How.ID, using = "customer.address.zipCode")
    public WebElement txt_zipCode;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    public WebElement btn_updateProfile;

}
