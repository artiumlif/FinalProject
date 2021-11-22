package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.parabank.*;
import pageObjects.mortgage.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base
{
    //General
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static  String platform;

    //Web
    protected static WebDriver driver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //Mobile
    protected static AppiumDriver mobileDriver;

    //Rest API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;

    //Database
    protected static Connection con;
    protected static Statement stat;
    protected static ResultSet rs;


    //Page Objects - Web
    protected static LoginPage parabankLogin;
    protected static AccountsOverviewPage parabankAccountsOverview;
    protected static BottomLeftMenuPage parabankBottomLeftMenu;
    protected static UpdateContactInfoPage parabankUpdateContactInfo;
    protected static ProfileUpdatedPage parabankProfileUpdated;
    protected static HeaderPanelPage parabankHeaderPanel;
    protected static FindTransactionsPage parabankFindTransactions;
    protected static TransactionResultsPage parabankTransactionResults;

    //Page Objects - Mobile
    protected static MainPage mortgageMain;

    //Page Objects - Electron
    protected static pageObjects.todo.MainPage todoMain;

    //Page Objects - Desktop
    protected static pageObjects.calculator.MainPage calcMain;

}
