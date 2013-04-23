package com.project.automated.framework.sparqlquery;

import com.project.automated.framework.libraries.GlobalLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;

//import com.yarcdata.tests.automated.launchloginquit.TestcaseBrowserLaunchQuitTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Testcase018SparqlQueryTest implements GlobalLibrary{
	
	   @Test(groups = {"sparqlquery"})
	    public void Test () {
	    	
	    	WebDriver driver;
	    	
	    	System.out.println("\n@Testcase "+ this.getClass().getSimpleName());    	
	    	System.out.println("================================================\n");    	
	    	
	    	System.out.println("@Testcase @Test Host-OS         : " + System.getProperty("os.name"));  
	    	System.out.println("@Testcase @Test OS-Architecture : " + System.getProperty("os.arch"));    
	    	System.out.println("@Testcase @Test Username        : " + System.getProperty("user.name"));    	
	    	System.out.println("@Testcase @Test User-Directory  : " + System.getProperty ("user.dir")); 
	    	System.out.println("@Testcase @Test Java-Home       : " + System.getProperty ("java.home"));  
	    	System.out.println("@Testcase @Test Testcase Data   : " + GlobalLibrary.DATALIBRARY);  
	    	//***************************************************************************************//
	    	
	    	MethodsLibrary.methodLaunchBrowser(GlobalLibrary.BROWSERTYPE); //c=chrome, e=explorer, f=firefox, h=htmlunit, s=safari
	       	MethodsLibrary.methodMaximizeBrowser (GlobalLibrary.BROWSERTYPE);
	       	MethodsLibrary.methodLaunchUrika(GlobalLibrary.URIKAMACHINE);
	        MethodsLibrary.methodLoginUrika(GlobalLibrary.USERNAME, GlobalLibrary.PASSWORD);
	        
	        MethodsLibrary.methodFreeTextSearch (GlobalLibrary.sSearchText);
	         
	        MethodsLibrary.methodQuitUrika();
	        System.out.println("@Testcase @Test : "+ this.getClass().getSimpleName() +" Successfully Completed!\n");
	        

	    }

}