
package com.yarcdata.tests.automated.libraries;

//import com.yarcdata.tests.automated.libraries.ObjectsLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MethodsLibrary
{
    private WebDriver driver;
    private WebDriverWait wait;
    
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    

public WebDriver methodLaunchBrowserChar (char sBrowserType){
        System.out.println("@MethodsLibrary: methodLaunchBrowser ()");

        //driver = new FirefoxDriver();

        switch (sBrowserType){

            case 'C':
            case 'c':
                driver = new ChromeDriver(); break;

            case 'E':
            case 'e':

                DesiredCapabilities browserCapability = DesiredCapabilities.internetExplorer();
                browserCapability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

                driver = new InternetExplorerDriver(browserCapability);
                break;

            case 'F':
            case 'f':
                driver = new FirefoxDriver(); break;

            case 'H':
            case 'h':
                driver = new HtmlUnitDriver(); break;

            case 'S':
            case 's':
                driver = new SafariDriver(); break;

        }



        wait = new WebDriverWait(driver, 2);

        FunctionsLibrary.functionWaitForAnObject (2);

        driver.manage().window().maximize(); //6/17

        FunctionsLibrary.functionWaitForAnObject (2);
  

        return driver;
    }//End Method
//********************************************************************************************************************

public WebDriver methodLaunchBrowser (String sBrowserType){
        /*
        sBrowserType = sBrowserType.toLowerCase();
        System.out.println(sBrowserType);
        if (sBrowserType.equals ("chrome")==true){
        	driver = new ChromeDriver(); 
        	
        } 
        else if (sBrowserType.equals ("firefox")==true){
        	System.out.println("@Methods_Urika : methodLaunchBrowser ()");
        	driver = new FirefoxDriver(); 
        	
        	
        } 
        else if (sBrowserType.equals ("safari")==true){
        	driver = new SafariDriver(); 
        	
        }
        else if (sBrowserType.equals ("exlorer")==true){
        	DesiredCapabilities browserCapability = DesiredCapabilities.internetExplorer();
            browserCapability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

            driver = new InternetExplorerDriver(browserCapability);
           
        }
        else if (sBrowserType.equals ("htmlunit")==true){
        	driver = new HtmlUnitDriver(); 
        	
        }
        else {
        	System.out.println("@Methods_Urika : methodLaunchBrowser () Browser type is wrong");
        	
        }
        
        */
    	System.out.println("@MethodsLibrary: methodLaunchBrowser ()");
    	driver = new FirefoxDriver(); 
    	
        wait = new WebDriverWait(driver, 2);

        FunctionsLibrary.functionWaitForAnObject (2);

        driver.manage().window().maximize(); //6/17

        FunctionsLibrary.functionWaitForAnObject (2);
  

        return driver;
    }//End Method
//********************************************************************************************************************


public WebDriver methodMaximizeBrowser (String sBrowserType){
       
	    System.out.println("@MethodsLibrary: methodMaximizeBrowser ()");
    	
        FunctionsLibrary.functionWaitForAnObject (2);

        driver.manage().window().maximize(); //6/17

        FunctionsLibrary.functionWaitForAnObject (2);
  

        return driver;
    }//End Method
//********************************************************************************************************************
    
    
public WebDriver methodLaunchUrika (String sURL){
        System.out.println("@MethodsLibrary: methodLaunchUrika ()");
      
        driver.get(sURL);
        //driver.manage().window().maximize(); //6/17
        FunctionsLibrary.functionWaitForAnObject (2);
     
        return driver;
    }//End Method
//********************************************************************************************************************

public WebDriver methodLoginUrika (String sUsername, String sPassword)
    {
        System.out.println("@MethodsLibrary: methodLoginUrika ()");
       
        FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

        ObjectsLibrary.TextField_Username_EnterData(sUsername);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_Password_EnterData(sPassword);
        FunctionsLibrary.functionWaitForAnObject (2);

        ObjectsLibrary.PushButton_SignIn_Click();
        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;

    }//End Method
//********************************************************************************************************************
  
public WebDriver methodSelectTabManageData ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
            
        FunctionsLibrary.functionWaitForAnObject (2);
        ObjectsLibrary.PushButton_ManageData_Click ();

        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }
//********************************************************************************************************************

public WebDriver methodSelectTabDashboard ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSelectTabDashboard ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        ObjectsLibrary.PushButton_Dashboard_Click ();
        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }
//********************************************************************************************************************

public WebDriver methodSearchDataFile (String sImportedFileName)
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSearchDataFile ()");
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_Search_EnterData (sImportedFileName);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return driver;

    }//End Method
//********************************************************************************************************************

public WebDriver methodDeleteDataFile ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodDeleteDataFile ()");
        ObjectsLibrary.PushButton_Delete_Click();
        FunctionsLibrary.functionWaitForAnObject (2);

        ObjectsLibrary.PushButton_DeleteOk_Click();
        FunctionsLibrary.functionWaitForAnObject (2);

        return driver;

    }//End Method
//********************************************************************************************************************

public WebDriver methodAddLocalDataFile (String sFileLocation)
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodAddLocalDataFile ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        ObjectsLibrary.PushButton_AddData_Click();
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_LocalFile_EnterData(sFileLocation);
        FunctionsLibrary.functionWaitForAnObject (5);


        Date date = new Date();
        Format formatter;
        formatter = new SimpleDateFormat("_yyyyMMMdd_HHmm");
        String s = formatter.format(date);
        String sSmokeTest_DateTime = "SmokeTest"+s;
        ObjectsLibrary.TextField_NameYourArtifact_EnterData(sSmokeTest_DateTime);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_Comments_EnterData("Smoke Test!");
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.PushButton_Submit_Click();
        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;

    }//End Method
//********************************************************************************************************************

public WebDriver methodQuitUrika (){
        System.out.println("@MethodsLibrary: methodQuitUrika ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        driver.quit();

        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }//End Method
//********************************************************************************************************************    

public WebDriver methodManageDatabaseLinkExists (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodManageDatabaseLinkValidation (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodClickManageDatabaseLink (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodClickManageDatabaseLinkValidation (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodCreateNewDatabase (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodCreateNewDatabaseValidation (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodSelectTabManageDatabases (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodCreateNewDatabaseAddData (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseAddDataValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseNoFiles (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseNoFilesValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabase20Files (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabase20FilesValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabase20FilesSubmit (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabase20FilesSubmitValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmit (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitPopup (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitPopupValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitPrevious (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitPreviousValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitSearch (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitSearchValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitCancel (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitCancelValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitLuster (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitLusterValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitRDF (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitRDFValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodCreateNewDatabaseMultipleFilesSubmitURL (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitURLValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitNewRules (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitNewRulesValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method




public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRules (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method




public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesNext (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method




public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesNextValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesPrevious (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method




public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesPreviousValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesNextCancel (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesNextCancelValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesNextX (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodCreateNewDatabaseMultipleFilesSubmitAddRulesNextXValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method




public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesLimitQueryCorrectResultsOtherUserValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesLimitQueryCorrectResults (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryCorrectResultsValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryCorrectResultsOtherUser (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryIncorrectQuery (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryIncorrectQueryValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQuerySwitchingBetweenTabs (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQuerySwitchingBetweenTabsValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryResultsReturned (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryResultsReturnedValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQuery (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesLimitQueryValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesShowResultsValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesShowResults (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChanges (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate21Validate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate21 (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate20Validate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method



public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate20 (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate19Validate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate19 (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate18Validate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate18 (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate17Validate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method

public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdate17 (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


public WebDriver methodNewUIChangesLimitQueryCorrectResultsUpdateValidate (){
    System.out.println("@MethodsLibrary: methodQuitUrika ()");
    FunctionsLibrary.functionWaitForAnObject (5);
    driver.quit();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}//End Method


}//End Class