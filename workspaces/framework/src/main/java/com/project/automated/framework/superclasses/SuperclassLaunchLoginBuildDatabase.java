/**********************************************
 * 
 * @author SHAAFI HYDER
 * @email  ShaafiHyder@gmail.com
 * @skype  ShaafiHyder
 * @phone  +1 925-9843999
 * @date   April 20th, 2013
 * 
 ***********************************************/


package com.project.automated.framework.superclasses;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.automated.framework.libraries.GlobalsLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;

public class SuperclassLaunchLoginBuildDatabase implements GlobalsLibrary{
    
@BeforeTest
public void BeforeTest (){
    
	WebDriver driver;
	
	FunctionsLibrary.functionLogResult ("OS_NAME : " + GlobalsLibrary.OS_NAME, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("FILE_SEPARATOR : " + GlobalsLibrary.FILE_SEPARATOR, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("OS_ARCHITECTURE : " + GlobalsLibrary.OS_ARCHITECTURE, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("USER_NAME : " + GlobalsLibrary.USER_NAME, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_JAVA : " + GlobalsLibrary.HOME_JAVA, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("JAVA_VERSION : " + GlobalsLibrary.JAVA_VERSION, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_JAVA_CLASSPATH : " + GlobalsLibrary.HOME_JAVA_CLASSPATH, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_USER_DIR : " + GlobalsLibrary.HOME_USER_DIR, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_LIBRARIES : " + GlobalsLibrary.HOME_LIBRARIES, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_SUPERCLASSES : " + GlobalsLibrary.HOME_SUPERCLASSES, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_TEST_SUITE : " + GlobalsLibrary.HOME_TEST_SUITE, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_RESOURCES : " + GlobalsLibrary.HOME_RESOURCES, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_GLOBALSCONSTANTS : " + GlobalsLibrary.HOME_GLOBALSCONSTANTS, this.getClass().getSimpleName());
	FunctionsLibrary.functionLogResult ("HOME_LOGS_DIR : " + GlobalsLibrary.HOME_LOGS_DIR, this.getClass().getSimpleName());
	
		
	FunctionsLibrary.functionLog ("===========================================================", this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()", this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("===========================================================", this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("[" + this.getClass().getSimpleName() + "] " + FunctionsLibrary.functionGetDateTime (), this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("===========================================================", this.getClass().getSimpleName());
	    
    	// BROWSER LAUNCH
    	MethodsLibrary.objectBrowserWebApp_launch (GlobalsLibrary.URIKA_MACHINE_EC2);
    	MethodsLibrary.objectBrowserWebApp_maximize ();
    	     	
    	// LOGIN WEB-APP
    	MethodsLibrary.objectTextfieldLoginUsername_enterdata (GlobalsLibrary.APP_USERNAME, TIME_OUT);
    	MethodsLibrary.objectTextfieldLoginPassword_enterdata (GlobalsLibrary.APP_PASSWORD, TIME_OUT);
    	MethodsLibrary.objectPushbuttonLoginSignIn_click (TIME_OUT);
    	
    	// VERIFY LOGIN WEB-APP
    	String sloginPageTitle = MethodsLibrary.methodVerifyLoginWebApp ();
    	if (sloginPageTitle.contains("Graph Analytics Manager") ==  false){
    		System.err.println  ("Login Failed!");
    		FunctionsLibrary.functionLogResult ("[" + this.getClass().getSimpleName() + "] Login Failed!", this.getClass().getSimpleName());
    		
    	} else {
    		FunctionsLibrary.functionLogResult ("[" + this.getClass().getSimpleName() + "] Login Succeeded!", this.getClass().getSimpleName());}

    	
     	    String sArtifact = FunctionsLibrary.functionReadDataLibraryProperties (HOME_BUILDDATABASE_PROPS, "builddatabases.ArtifactName");
			String sDatabase =  FunctionsLibrary.functionReadDataLibraryProperties (HOME_BUILDDATABASE_PROPS, "builddatabases.DatabaseName"); 
			String sSearchArtifact =  FunctionsLibrary.functionReadDataLibraryProperties (HOME_BUILDDATABASE_PROPS, "builddatabases.SearchString");
	       	
	       	// IMPORT DATA
	       	MethodsLibrary.objectPushbuttonTabDashboard_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonTabManageData_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonImportAddData_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldImportNameYourArtifact_enterdata (sArtifact, TIME_OUT);
	       	MethodsLibrary.objectTextfieldImportComment_enterdata (sArtifact, TIME_OUT);
	       	MethodsLibrary.objectPushButtonImportDataCancel_click (TIME_OUT);
	       	
	       	// NEW DATABASE
	       	MethodsLibrary.objectPushButtonTabManageDatabase_click (TIME_OUT);
	        MethodsLibrary.objectPushbuttonNewDatabase_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldNewDatabaseName_enterdata (sDatabase, TIME_OUT);
	       	MethodsLibrary.objectPushbuttonNewDatabaseAddData_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldNewDatabaseSearch_enterdata(sSearchArtifact, TIME_OUT);
	       	MethodsLibrary.objectCheckboxNewDatabase_check (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonNewDatabaseSubmit_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonNewDatabaseApplyStart_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonNewDatabaseApplyStartConfirm_click (TIME_OUT);
	       	MethodsLibrary.objectPushButtonTabManageDatabase_click (TIME_OUT);
}   



@AfterTest
public void AfterTest ()  {
        	System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	       	
        MethodsLibrary.methodQuitUrika();        	
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"index.html");
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"emailable-report.html");
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"testng-results.xml");
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"junitreports");
}
}  
	        





	        
	        
	   
   
	        
	   
