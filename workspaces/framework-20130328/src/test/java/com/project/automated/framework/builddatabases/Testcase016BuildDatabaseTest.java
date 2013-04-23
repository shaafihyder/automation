package com.project.automated.framework.builddatabases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.project.automated.framework.libraries.GlobalLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty7.util.resource.Resource;
import org.testng.annotations.Test;

public class Testcase016BuildDatabaseTest implements GlobalLibrary{
	
	   @Test(groups = {"BuildDatabase"})
	    public void Test ()  {
	    	
	    	WebDriver driver;
	    	
	    	System.out.println("*** " + this.getClass().getSimpleName() + " :" + new Exception().getStackTrace()[0].getMethodName() + " ()");
	    	System.out.println("===============================================================\n\n");    	
	    	
	    	System.out.println("[" + this.getClass().getSimpleName() + "] Host-OS         : " + System.getProperty("os.name"));  
	    	System.out.println("[" + this.getClass().getSimpleName() + "] OS-Architecture : " + System.getProperty("os.arch"));    
	    	System.out.println("[" + this.getClass().getSimpleName() + "] Username        : " + System.getProperty("user.name"));    	
	    	System.out.println("[" + this.getClass().getSimpleName() + "] User-Directory  : " + System.getProperty ("user.dir")); 
	    	System.out.println("[" + this.getClass().getSimpleName() + "] Java-Home       : " + System.getProperty ("java.home"));  
	    	System.out.println("[" + this.getClass().getSimpleName() + "] Testcase Data   : " + GlobalLibrary.DATALIBRARY);  
	    	//***************************************************************************************//
	    	
	    	// BROWSER
	    	MethodsLibrary.objectBrowserWebApp_launch (GlobalLibrary.URIKAMACHINE); //c=chrome, e=explorer, f=firefox, h=htmlunit, s=safari
	       	MethodsLibrary.objectBrowserWebApp_maximize ();
	       	
	       	// LOGIN
	       	MethodsLibrary.objectTextfieldLoginUsername_enterdata (GlobalLibrary.USERNAME);
	       	MethodsLibrary.objectTextfieldLoginPassword_enterdata (GlobalLibrary.PASSWORD);
	       	MethodsLibrary.objectPushbuttonLoginSignIn_click ();
	       	
	       	// IMPORT DATA
	       	MethodsLibrary.objectPushbuttonTabDashboard_click ();
	       	MethodsLibrary.objectPushbuttonTabManageData_click ();
	       	MethodsLibrary.objectPushbuttonImportAddData_click ();
	       	MethodsLibrary.objectTextfieldImportNameYourArtifact_enterdata ("AUTOMATION-Artifact");
	       	MethodsLibrary.objectTextfieldImportComment_enterdata ("AUTOMATION-Artifact");
	       	MethodsLibrary.objectPushButtonImportDataCancel_click ();
	       	
	       	// NEW DATABASE
	       	MethodsLibrary.objectPushButtonTabManageDatabase_click ();
	       	
	       	MethodsLibrary.objectPushbuttonNewDatabase_click ();
	       	MethodsLibrary.objectTextfieldNewDatabaseName_enterdata ();
	       	MethodsLibrary.objectPushbuttonNewDatabaseAddData_click ();
	       	MethodsLibrary.objectTextfieldNewDatabaseSearch_enterdata("AUTOMATION");
	       	MethodsLibrary.objectCheckboxNewDatabase_check ();
	       	MethodsLibrary.objectPushbuttonNewDatabaseSubmit_click ();
	       	MethodsLibrary.objectPushbuttonNewDatabaseApplyStart_click ();
	       	MethodsLibrary.objectPushbuttonNewDatabaseApplyStartConfirm_click ();
     	    }
}  
	        
	        
	   
