package com.project.automated.framework.builddatabases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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

public class Testcase008BuildDatabaseTest implements GlobalsLibrary{
	    
@BeforeTest
public void BeforeTest (){
            WebDriver driver;
            System.out.println("*** " + this.getClass().getSimpleName() + " :" + new Exception().getStackTrace()[0].getMethodName() + " ()");
		    System.out.println("===============================================================\n\n");    	
		    System.out.println("[" + this.getClass().getSimpleName() + "] Host-OS         : " + System.getProperty("os.name"));  
		    System.out.println("[" + this.getClass().getSimpleName() + "] OS-Architecture : " + System.getProperty("os.arch"));    
		    System.out.println("[" + this.getClass().getSimpleName() + "] Username        : " + System.getProperty("user.name"));    	
		    System.out.println("[" + this.getClass().getSimpleName() + "] User-Directory  : " + System.getProperty ("user.dir")); 
		    System.out.println("[" + this.getClass().getSimpleName() + "] Java-Home       : " + System.getProperty ("java.home"));  
		    System.out.println("[" + this.getClass().getSimpleName() + "] Testcase Data   : " + GlobalsLibrary.DATALIBRARY);  
		    //***************************************************************************************//
}


@Test(groups = {"SPARQLQuery"})
public void Test (){
			System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	    	
			// BROWSER
			MethodsLibrary.objectBrowserWebApp_launch (GlobalsLibrary.URIKA_MACHINE); //c=chrome, e=explorer, f=firefox, h=htmlunit, s=safari
	       	MethodsLibrary.objectBrowserWebApp_maximize ();
	       	
	       	// LOGIN
	       	MethodsLibrary.objectTextfieldLoginUsername_enterdata (GlobalsLibrary.USERNAME, lTimeOut);
	       	MethodsLibrary.objectTextfieldLoginPassword_enterdata (GlobalsLibrary.PASSWORD, lTimeOut);
	       	MethodsLibrary.objectPushbuttonLoginSignIn_click (lTimeOut);
	       	
	       	// IMPORT DATA
	       	MethodsLibrary.objectPushbuttonTabDashboard_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonTabManageData_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonImportAddData_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldImportNameYourArtifact_enterdata ("AUTOMATION-Artifact-lubm0", lTimeOut);
	       	MethodsLibrary.objectTextfieldImportComment_enterdata ("AUTOMATION-Artifact-lubm0", lTimeOut);
	        	System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
        	
        	MethodsLibrary.methodQuitUrika();
        	MethodsLibrary.methodDisplayTestReports();
	} 
}
	        
	        
