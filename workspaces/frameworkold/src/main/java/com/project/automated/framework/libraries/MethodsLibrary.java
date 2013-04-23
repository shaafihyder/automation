
package com.project.automated.framework.libraries;

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
    

// This method is used to do search using search text

public WebDriver methodFreeTextSearch (String sSearchText)
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    ObjectsLibrary.TextField_Freetext_Search(sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);
    
    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}//End Method

//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Executed by
public WebDriver methodFreeTextSearch_ExecutedBy (String sSearchText, String sExecutedby)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Executedby(sExecutedby);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Executed date
public WebDriver methodFreeTextSearch_Executedon (String sSearchText, String sExecutedon1)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.TextField_Filter_Executedon(sExecutedon1);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Database
public WebDriver methodFreeTextSearch_database (String sSearchText, String sDatabaseid)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Database(sDatabaseid);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Status
public WebDriver methodFreeTextSearch_Status (String sSearchText, String sStatus)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Status(sStatus);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Status
public WebDriver methodFreeTextSearch_QueryType (String sSearchText, String sQueryType)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_QueryType(sQueryType);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************    
// This method is used to do search using search text in combination of Executedby, Executedon, Status, databaseid, querytype
public WebDriver methodFreeTextSearch_Complete_Filter (String sSearchText, String sExecutedby, String sExecutedon1, String sDatabaseid, String sStatus, String sQueryType)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search(sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Executedby(sExecutedby);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.TextField_Filter_Executedon(sExecutedon1);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Database(sDatabaseid);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Status(sStatus);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_QueryType(sQueryType);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
    
//************************************************************************************************************************************************
    // This method is used to check the reset button works
    public WebDriver methodFreeTextSearch_reset_Filter (String sSearchText, String sExecutedby, String sExecutedon1, String sDatabaseid, String sStatus, String sQueryType)
    {
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
       
        FunctionsLibrary.functionWaitForAnObject (2);

        ObjectsLibrary.TextField_Freetext_Search(sSearchText);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.PushButton_Filter_Click ();
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_Executedby(sExecutedby);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_Filter_Executedon(sExecutedon1);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_Database(sDatabaseid);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_Status(sStatus);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_QueryType(sQueryType);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.PushButton_Reset_Click();
        FunctionsLibrary.functionWaitForAnObject (5);
        
        return driver;
    }
//************************************************************************************************************************************************
    
public WebDriver methodSelectTabSPARQLQuery (){



	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabSPARQLQuery ()");
        
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_SPARQLQuery_Click ();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}
//********************************************************************************************************************



public WebDriver methodSPARQLEnterQuery (String sQuery)
{
    System.out.println("@MethodsLibrary: methodLoginUrika ()");
   
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

    
    ObjectsLibrary.objectTextField_SPARQLQuery_EnterText(sQuery);
    FunctionsLibrary.functionWaitForAnObject (5);

    
    return driver;

}//End Method
//********************************************************************************************************************







}//End Class