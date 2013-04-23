package com.project.automated.framework.libraries;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.automated.framework.libraries.GlobalLibrary;
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

public class Superclass implements GlobalLibrary{
    
@BeforeTest
public void BeforeTest (){
    
	WebDriver driver;
	
	
	//FunctionsLibrary.functionLog ("ShaafiHyder", this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("===========================================================", this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()", this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("===========================================================", this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("[" + this.getClass().getSimpleName() + "] " + FunctionsLibrary.functionGetDateTime (), this.getClass().getSimpleName());
	FunctionsLibrary.functionLog ("===========================================================", this.getClass().getSimpleName());
	
    //System.out.println("===========================================================");    	
    	//System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
    	//System.out.println("===========================================================\n");    	
    	//System.out.println("[" + this.getClass().getSimpleName() + "] Date & Time : " + FunctionsLibrary.functionGetDateTime ());
    	//System.out.println("=======================================================================");    	
    	    
    	// BROWSER
    	MethodsLibrary.objectBrowserWebApp_launch (GlobalLibrary.URIKAMACHINE);
    	MethodsLibrary.objectBrowserWebApp_maximize ();
    	     	
    	// LOGIN
    	MethodsLibrary.objectTextfieldLoginUsername_enterdata (GlobalLibrary.USERNAME, lTimeOut);
    	MethodsLibrary.objectTextfieldLoginPassword_enterdata (GlobalLibrary.PASSWORD, lTimeOut);
    	MethodsLibrary.objectPushbuttonLoginSignIn_click (lTimeOut);
    	
    	String sloginPageTitle = MethodsLibrary.methodVerifyLoginWebApp ();
    	if (sloginPageTitle.contains("Graph Analytics Manager") ==  false){
    		System.err.println  ("Login Failed!");
    		//System.
    		FunctionsLibrary.functionLogResult ("[" + this.getClass().getSimpleName() + "] Login Failed!", this.getClass().getSimpleName());
    		
    	} else {
    		//System.out.println  ("Login Succeeded!");
    		FunctionsLibrary.functionLogResult ("[" + this.getClass().getSimpleName() + "] Login Succeeded!", this.getClass().getSimpleName());
    		
    	}
    
}   



@AfterTest
public void AfterTest ()  {
        	System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	       	
        //	MethodsLibrary.methodQuitUrika();        	//MethodsLibrary.methodDisplayTestReports();
        	MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"index.html");
        	MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"emailable-report.html");
        	MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"testng-results.xml");
        	MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"junitreports");
}
}  
	        





	        
	        
	   
   
	        
	   
