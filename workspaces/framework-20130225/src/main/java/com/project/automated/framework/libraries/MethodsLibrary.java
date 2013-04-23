
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
import org.openqa.selenium.JavascriptExecutor;
//
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;



public class MethodsLibrary
{
	public WebDriver driver;
    private WebDriverWait wait;
    
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    
    //protected WebElement element;
    private WebElement returnTextField_Email, returnTextFiled_Password, returnPushButton_SignIn;
    
    // LOGIN
    @FindBy(id = "username") public WebElement objectTextfieldLoginUsername;    //*** Web elements Declaration
    @FindBy(id = "password") public WebElement objectTextfieldLoginPassword;
    @FindBy(id = "login") public WebElement objectPushbuttonLoginSignIn;
    
    // TAB 
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[2]/a") public WebElement objectPushbuttonTabDashboard;
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[7]/a") public WebElement objectPushbuttonTabManageData;
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[6]/a") public WebElement objectPushButtonTabManageDatabase;
    
    // IMPORT
    @FindBy(id = "addDataButton") public WebElement objectPushbuttonImportAddData;
    @FindBy(id = "localInput") public WebElement objectTextfieldImportArtifact;
    @FindBy(id = "filenameInput") public WebElement objectTextfieldImportNameYourArtifact;
    @FindBy(id = "commentsInput") public WebElement objectTextfieldImportComment;
    @FindBy(id = "importDataCancel") public WebElement objectPushButtonImportDataCancel;
    
    // NEW DATABASE
    @FindBy(id = "newDatabaseButton") public WebElement objectPushbuttonNewDatabase;
    @FindBy(id = "dbName") public WebElement objectTextfieldNewDatabaseName;
    @FindBy(id = "addDataButton") public WebElement objectPushbuttonNewDatabaseAddData;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/div/div[2]/div/label/input") public WebElement objectTextfieldNewDatabaseSearch;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/table/tbody/tr/td/label/input") public WebElement objectCheckboxNewDatabase;
    @FindBy(id = "addDataToDatabaseAction") public WebElement objectPushbuttonNewDatabaseSubmit;
    @FindBy(id = "applyNewDatabaseButton") public WebElement objectPushbuttonNewDatabaseApplyStart;
    @FindBy(id = "applyNewDataAction") public WebElement objectPushbuttonNewDatabaseApplyStartConfirm;
    @FindBy(id = "importDataAction") public WebElement objectPushbuttonNewDatabaseApplyStartSubmit;//
    
    // DATABASE STOP
    @FindBy(id = "topDbButton-787456b1-1759-4c33-9978-d79adf774339") public WebElement objectPushButton_DatabaseStop;
    
    
    
    @FindBy(id = "filterDB") public WebElement objectTextField_Database;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/label/input") public WebElement objectTextField_Search;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[5]/a[2]/i") public WebElement objectPushButton_Delete;
    @FindBy(xpath = "/html/body/div[3]/div[2]/a") public WebElement objectPushButton_DeleteOk;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/div/button") public WebElement objectPushButton_New;
    
    // SPARQL QUERY
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[14]/a") public WebElement objectPushbuttonSparqlQuery;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]") public WebElement objectTextfieldSparqlQueryNew;
    @FindBy(id = "clearBtn") public WebElement objectPushbuttonSparqlQueryClear;
    @FindBy(id = "dbHeaderButton") public WebElement objectPushButton_DatabaseConnected;
    @FindBy(id = "optionsRadios3") public WebElement objectPushbuttonSparqlQueryAllResults;
    @FindBy(id = "outputFormat") public WebElement objectComboSparqlQueryOutputFormat;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/select/option[2]") public WebElement objectComboSparqlQueryOutputFormatXML;
    @FindBy(id = "executeQuery") public WebElement objectPushbuttonSparqlQueryExecute;
    

    
    
    
    // QUERY HISTORY
    @FindBy(xpath = ".//*[@id='content']/div[2]/div/div[1]/span/button") public WebElement objectPushButton_Searchbutton;
    @FindBy(id = "searchSettings") public WebElement objectPushButton_Filterbutton;
    @FindBy(id = "filterUser") public WebElement objectDropdownField_ExecutedBy;
    @FindBy(id= "rangeA") public WebElement objectTextField_Executedon;
    @FindBy(id = "filterStatus") public WebElement objectTextField_Status;
    @FindBy(id = "filterType") public WebElement objectTextField_QueryType;
    @FindBy(id = "reset") public WebElement objectPushButton_Resetbutton;
    @FindBy(xpath = ".//*[@id='prev']/a") public WebElement objectPushButton_Previousbutton;
    @FindBy(xpath = ".//*[@id='next']/a") public WebElement objectPushButton_Nextbutton;
    @FindBy(id = "freeTextSearch") public WebElement objectTextField_FreeTextSearch;
    
    
    
public WebDriver objectBrowserWebApp_launch (String sURL){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   /*  
	    String sBrowserType = null;
	    sBrowserType = sBrowserType.toLowerCase();
        System.out.println(sBrowserType);
        if (sBrowserType.equals ("chrome")==true){
        	driver = new ChromeDriver(); 
        } else if (sBrowserType.equals ("firefox")==true){
        	System.out.println("@Methods_Urika : methodLaunchBrowser ()");
        	driver = new FirefoxDriver(); 
        } else if (sBrowserType.equals ("safari")==true){
        	driver = new SafariDriver(); 
        } else if (sBrowserType.equals ("exlorer")==true){
        	DesiredCapabilities browserCapability = DesiredCapabilities.internetExplorer();
            browserCapability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new InternetExplorerDriver(browserCapability);
        } else if (sBrowserType.equals ("htmlunit")==true){
        	driver = new HtmlUnitDriver(); 
        } 
        */
       driver = new FirefoxDriver(); 
       driver.get(sURL);
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectBrowserWebApp_maximize (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   driver.manage().window().maximize(); 
	   FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectBrowserWebApp_quit (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   driver.quit(); 
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectTextfieldLoginUsername_enterdata (String sUserName){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
       objectTextfieldLoginUsername.sendKeys(sUserName);
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectTextfieldLoginPassword_enterdata (String sPassword){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
       objectTextfieldLoginPassword.sendKeys(sPassword);
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectPushbuttonLoginSignIn_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
       objectPushbuttonLoginSignIn.click();
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectPushbuttonTabDashboard_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
       objectPushbuttonTabDashboard.click();
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectPushbuttonTabManageData_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
       objectPushbuttonTabManageData.click();
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectPushbuttonImportAddData_click (){
		System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		PageFactory.initElements(driver, this);
		FunctionsLibrary.functionWaitForAnObject (2);
        objectPushbuttonImportAddData.click();
        FunctionsLibrary.functionWaitForAnObject (2);
        return driver;
}
public WebDriver objectTextfieldImportNameYourArtifact_enterdata (String sNameYourArtifact){
    	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
    	PageFactory.initElements(driver, this);
    	FunctionsLibrary.functionWaitForAnObject (2);
    	objectTextfieldImportNameYourArtifact.sendKeys(sNameYourArtifact);
    	FunctionsLibrary.functionWaitForAnObject (2);
    	return driver;
}
public WebDriver objectTextfieldImportArtifact_enterdata (String sArtifactName){
    	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
    	PageFactory.initElements(driver, this);
    	FunctionsLibrary.functionWaitForAnObject (2);
    	objectTextfieldImportArtifact.sendKeys(sArtifactName);
    	FunctionsLibrary.functionWaitForAnObject (2);
    	return driver;
}
public WebDriver objectTextfieldImportComment_enterdata (String sComment){
		System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		PageFactory.initElements(driver, this);
		FunctionsLibrary.functionWaitForAnObject (2);
	    objectTextfieldImportComment.sendKeys(sComment);
	    FunctionsLibrary.functionWaitForAnObject (2);
	    return driver;
}
public WebDriver objectPushButtonImportDataCancel_click (){
		System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		PageFactory.initElements(driver, this);
		FunctionsLibrary.functionWaitForAnObject (2);
		objectPushButtonImportDataCancel.click();
		FunctionsLibrary.functionWaitForAnObject (2);
		return driver;
}
public WebDriver objectPushButtonTabManageDatabase_click (){
	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	PageFactory.initElements(driver, this);
	FunctionsLibrary.functionWaitForAnObject (2);
    objectPushButtonTabManageDatabase.click();
	FunctionsLibrary.functionWaitForAnObject (2);
	return driver;
}
public WebDriver objectPushbuttonNewDatabase_click (){	
	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	PageFactory.initElements(driver, this);
	FunctionsLibrary.functionWaitForAnObject (2);
	objectPushbuttonNewDatabase.click();
	FunctionsLibrary.functionWaitForAnObject (2);
	return driver;
}
public WebDriver objectTextfieldNewDatabaseName_enterdata (){	
	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	PageFactory.initElements(driver, this);
	String sDatabaseName = "AUTOMATION-Database"; 
    FunctionsLibrary.functionWaitForAnObject (2);
    objectTextfieldNewDatabaseName.sendKeys (sDatabaseName);
    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}
public WebDriver objectPushbuttonNewDatabaseAddData_click (){	
	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	PageFactory.initElements(driver, this);
	FunctionsLibrary.functionWaitForAnObject (2);
	objectPushbuttonNewDatabaseAddData.click ();
    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}
public WebDriver objectTextfieldNewDatabaseSearch_enterdata (String sDatabaseName){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectTextfieldNewDatabaseSearch.sendKeys (sDatabaseName);
       FunctionsLibrary.functionWaitForAnObject (5);
       return driver;
}
public WebDriver objectCheckboxNewDatabase_check (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectCheckboxNewDatabase.click();
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectPushbuttonNewDatabaseSubmit_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonNewDatabaseSubmit.click();
       FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}
public WebDriver objectPushbuttonNewDatabaseApplyStart_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonNewDatabaseApplyStart.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectPushbuttonNewDatabaseApplyStartConfirm_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonNewDatabaseApplyStartConfirm.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectPushbuttonNewDatabaseApplyStartSubmit_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonNewDatabaseApplyStartSubmit.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectPushbuttonNewDatabaseApplyStartConfirm222_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushButton_DatabaseStop.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectPushbuttonSparqlQuery_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonSparqlQuery.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectPushbuttonSparqlQueryClear_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonSparqlQueryClear.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectPushbuttonSparqlQueryAllResults_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonSparqlQueryAllResults.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
public WebDriver objectComboSparqlQueryOutputFormat_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectComboSparqlQueryOutputFormat.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}

public WebDriver objectComboSparqlQueryOutputFormatXML_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectComboSparqlQueryOutputFormatXML.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}

public WebDriver objectComboSparqlQueryOutputFormat_click2 (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectComboSparqlQueryOutputFormat.click ();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}



public WebDriver objectPushbuttonSparqlQueryExecute_click (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   objectPushbuttonSparqlQueryExecute.click();
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}



public WebDriver objectTextfieldSparqlQueryNew_click (String sQuery){
	   //sQuery = "baba chacha";
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   //objectTextfieldSparqlQueryNew.click();
	   
	   System.out.println ("Sparql Query text-field existing contents: "+ objectTextfieldSparqlQueryNew.getText());
       System.out.println ("Sparql Query text-field number of characters: "+ objectTextfieldSparqlQueryNew.getText().length());
       objectTextfieldSparqlQueryNew.sendKeys("New Sparql Query...");	
     
       //@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]") public WebElement objectTextfieldSparqlQueryNew;
       
       WebElement elementCodeMirrorTextField = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]"));
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", elementCodeMirrorTextField);
       //executor.executeScript("window.editor.setValue(\'Shaafi - This is Sparql Query\');", elementCodeMirrorTextField);
       
       //String sQuery = "Shaafi - This is Sparql Query";
       String sCommandPart1 = "window.editor.setValue(\'";
       //String sQueryy = "Shaafi - This is Sparql Query";
       String sCommandPart2 =  "\');";	   
       String sCommand = sCommandPart1 + sQuery + sCommandPart2;
    		   
       //String sCommand = "window.editor.setValue(\'Shaafi - This is Sparql Query\');";
       executor.executeScript(sCommand, elementCodeMirrorTextField);
       
       
       //System.out.println(executor.executeScript("return document.title"));
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}






public void TextField_Search_EnterData (String sImportedFileName){
        //System.out.println("@PageObjects_Urika: objectTextField_Search ()");
        objectTextField_Search.sendKeys(sImportedFileName);
}//method end


    //Urika > Manage Data > Delete
public void PushButton_Delete_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Delete_Click ()");
        objectPushButton_Delete.click();
}//method end



    //Urika > Manage Data > Delete > Ok
public void PushButton_DeleteOk_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_DeleteOk_Click ()");
        objectPushButton_DeleteOk.click();
}//method end






    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Left hand side tabs                                       *
     *                                                                                                *
     **************************************************************************************************/

    //





    

    
    public void TextField_Freetext_Search (String sSearchText){
        objectTextField_FreeTextSearch.sendKeys(sSearchText);
    }//method end


    //Urika > Query History > Search button
    public void PushButton_Search_Click (){
        objectPushButton_Searchbutton.click();
    }//method end

    public void PushButton_Filter_Click (){
        objectPushButton_Filterbutton.click();
    }//method end

    public void DropdownField_Filter_Executedby (String sExecutedby){
    	objectDropdownField_ExecutedBy.sendKeys(sExecutedby);
    }//method end	

    //Urika > Query History > Filter Button > Executed Date
    //@FindBy(xpath = ".//*[@id='rangeA']")    //*** Web elements Declaration
  
    public void TextField_Filter_Executedon (String sExecutedon1){
        objectTextField_Executedon.sendKeys(sExecutedon1);
    }//method end


    //Urika > Query History > Filter Button > Database
    public void DropdownField_Filter_Database (String sDatabaseid){
        objectTextField_Database.sendKeys(sDatabaseid);
    }//method end	

    //Urika > Query History > Filter Button > Status
    public void DropdownField_Filter_Status (String sStatus){
        objectTextField_Status.sendKeys(sStatus);
    }//method end	

    //Urika > Query History > Filter Button > Query Type
    public void DropdownField_Filter_QueryType (String sQueryType){
        objectTextField_QueryType.sendKeys(sQueryType);
    }//method end	

    //Urika > Query History > Search Filter button
    public void PushButton_Reset_Click (){
        objectPushButton_Resetbutton.click();
    }//method end


    public void PushButton_Previousbutton_Click (){
        objectPushButton_Previousbutton.click();
    }//method end

    public void PushButton_Nextbutton_Click (){
    	objectPushButton_Nextbutton.click();
    }//method end
   
    
  
    
    //SPARQL QUERY
    //Urika > Sparql Query > Sparql Query push-button
    
    
    //Urika > SPARQL Query > Query Text field
    
                     
    
    
    //Button New
                     
    public void objectPushButton_New_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectPushButton_New.click();
    	
    	//objectTextField_SPARQLQuery.sendKeys(sQuery);
    }//method end
    
    
    
    //Urika > Sparql Query > Sparql Query clear-results push-button
    public void objectPushButton_SPARQLQueryClearResults_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	//objectPushButton_SPARQLQueryClearResults.click();
    }//method end
    

    
    
    
   
    
  //Urika > Sparql Query > Sparql Query clear-results push-button
    public void objectPushButton_NewDatabase_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	//objectPushButton_NewDatabase.click();
    }//method end
    
    
    
    
    
    
    
  //Urika > Manage Data > Add File > Comments
    public void objectTextField_SearchDatabase_Enter (String sDatabaseName){
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	//objectTextField_SearchDatabase.sendKeys(sDatabaseName);
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
    
    //Urika > Manage Data > Add File > Comments
    
  //Urika > Manage Data > Add File > Comments
    public void objectPushButton_ApplyStart_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	//objectPushButton_ApplyStart.click();
    	
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
  //Urika > Manage Data > Add File > Comments
    
  
    
    
    //Urika > Manage Data > Add File > Comments
    public void objectPushButton_ImportDataOperation_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	//objectPushButton_ImportData_Cancel.click();
    	
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
    
    
    
  //Urika > Manage Data > Add File > Comments
    public void objectPushButton_DatabaseConnected_YesNo (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	String sDBConnected = objectPushButton_DatabaseConnected.getText();
    	System.out.println ("Database Connected? "+sDBConnected);
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
    
  //Urika > Manage Data > Add File > Comments
    
    
    
    
    
    
    


/*
public WebDriver methodLoginUrika (String sUsername, String sPassword)
    {
        System.out.println("@MethodsLibrary: methodLoginUrika ()");
       
        FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

        ObjectsLibrary.TextField_Username_EnterData(sUsername);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_Password_EnterData(sPassword);
        FunctionsLibrary.functionWaitForAnObject (2);

        ObjectsLibrary.PushButton_SignIn_Click();
        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;

    }//End Method
//********************************************************************************************************************
  */
public WebDriver methodSelectTabManageData ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
            
        FunctionsLibrary.functionWaitForAnObject (2);
        //PushButton_ManageData_Click ();

        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }
//********************************************************************************************************************

public WebDriver methodSelectTabDashboard ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSelectTabDashboard ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        //ObjectsLibrary.PushButton_Dashboard_Click ();
        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }
//********************************************************************************************************************

public WebDriver methodSearchDataFile (String sImportedFileName)
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSearchDataFile ()");
        FunctionsLibrary.functionWaitForAnObject (5);

        //ObjectsLibrary.TextField_Search_EnterData (sImportedFileName);

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
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodDeleteDataFile ()");
        //ObjectsLibrary.PushButton_Delete_Click();
        FunctionsLibrary.functionWaitForAnObject (2);

        //ObjectsLibrary.PushButton_DeleteOk_Click();
        FunctionsLibrary.functionWaitForAnObject (2);

        return driver;

    }//End Method
//********************************************************************************************************************

public WebDriver methodAddLocalDataFile (String sFileLocation)
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodAddLocalDataFile ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        //ObjectsLibrary.PushButton_AddData_Click();
        FunctionsLibrary.functionWaitForAnObject (1);

        //ObjectsLibrary.TextField_LocalFile_EnterData(sFileLocation);
        //FunctionsLibrary.functionWaitForAnObject (5);


        Date date = new Date();
        Format formatter;
        formatter = new SimpleDateFormat("_yyyyMMMdd_HHmm");
        String s = formatter.format(date);
        String sSmokeTest_DateTime = "AUTOMATION-Artifact";
        //ObjectsLibrary.TextField_NameYourArtifact_EnterData(sSmokeTest_DateTime);
        FunctionsLibrary.functionWaitForAnObject (2);

        //ObjectsLibrary.TextField_Comments_EnterData("TEST - Import database file: lubm0");
        

        //ObjectsLibrary.objectPushButton_ImportDataOperation_Click();
        FunctionsLibrary.functionWaitForAnObject (1);
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
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    //ObjectsLibrary.TextField_Freetext_Search(sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);
    
    //ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}//End Method

//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Executed by
public WebDriver methodFreeTextSearch_ExecutedBy (String sSearchText, String sExecutedby)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    //ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.DropdownField_Filter_Executedby(sExecutedby);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Executed date
public WebDriver methodFreeTextSearch_Executedon (String sSearchText, String sExecutedon1)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    //ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.TextField_Filter_Executedon(sExecutedon1);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}}
//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Database
//public WebDriver methodFreeTextSearch_database (String sSearchText, String sDatabaseid)
//{
	//FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    //FunctionsLibrary.functionWaitForAnObject (2);

    //ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    //FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Filter_Click ();
    //FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.DropdownField_Filter_Database(sDatabaseid);
    //FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Search_Click();
    //FunctionsLibrary.functionWaitForAnObject (5);

    //return driver;
//}
//************************************************************************************************************************************************
/*

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

    ObjectsLibrary.objectPushButton_New_Click ();
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectTextField_SPARQLQuery_EnterText(sQuery);
    FunctionsLibrary.functionWaitForAnObject (5);

    
    return driver;

}//End Method
//********************************************************************************************************************

public WebDriver methodSPARQLQueryClearResultClick ()
{
    System.out.println("@MethodsLibrary: methodLoginUrika ()");
   
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

    
    ObjectsLibrary.objectPushButton_SPARQLQueryClearResults.click();
    FunctionsLibrary.functionWaitForAnObject (5);

    
    return driver;

}//End Method
//********************************************************************************************************************



public WebDriver methodSPARQLQueryClearTextBox ()
{
    System.out.println("@MethodsLibrary: methodLoginUrika ()");
   
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

    
    ObjectsLibrary.objectTextField_SPARQLQuery_ClearText();
    FunctionsLibrary.functionWaitForAnObject (5);

    
    return driver;

}//End Method
//********************************************************************************************************************


public WebDriver methodSelectTabManageDatabases ()
   {	
   	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
       ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
       System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
           
       FunctionsLibrary.functionWaitForAnObject (2);
       ObjectsLibrary.PushButton_ManageDatabases_Click ();

       FunctionsLibrary.functionWaitForAnObject (5);
       return driver;
   }
//********************************************************************************************************************



public WebDriver methodClickNewDatabase ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
        
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_NewDatabase_Click ();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}
//********************************************************************************************************************



//********************************************************************************************************************



public WebDriver methodAddDataClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    
    		
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.PushButton_AddDataButton_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************************************************************************************************************



public WebDriver methodSearchDatabaseName ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    String sDatabaseName = "AUTOMATION"; 
    		
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectTextField_SearchDatabase_Enter (sDatabaseName);
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************************************************************************************************************




public WebDriver methodCheckDatabase ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectCheckbox_Database_Check ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************



public WebDriver methodClickPushButtonSubmit ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_Database_Submit ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************





public WebDriver methodPushButtonApplyStartClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_ApplyStart_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************





public WebDriver methodPushButtonApplyStartConfirmClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_ApplyStartConfirm_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************




public WebDriver methodPushButtonImportDataOperationClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (1);
    ObjectsLibrary.objectPushButton_ImportDataOperation_Click () ;
    
    
    return driver;
}
//********************




public WebDriver methodVerifyDatabaseConnected ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_DatabaseConnected_YesNo () ;
    FunctionsLibrary.functionWaitForAnObject (5);
    
    
    return driver;
}
//********************




public WebDriver methodDatabaseStop ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_DatabaseStop_Click () ;
    FunctionsLibrary.functionWaitForAnObject (15);
    
    
    return driver;
}


}//End Class

*/