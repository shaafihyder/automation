package com.project.automated.framework.sparqlquery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.project.automated.framework.libraries.GlobalLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty7.util.resource.Resource;
import org.testng.annotations.Test;

public class Testcase001SparqlQueryTest implements GlobalLibrary{
	
	   @Test(groups = {"sparqlquery"})
	    public void Test ()  {
	    	
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
	    	
	    	System.out.println ("@Testcase @Test sQuery001   : " + GlobalLibrary.sQuery001);
	    	
	    	
	    	//MethodsLibrary.methodLaunchBrowser(GlobalLibrary.BROWSERTYPE); //c=chrome, e=explorer, f=firefox, h=htmlunit, s=safari
	       	//MethodsLibrary.methodMaximizeBrowser (GlobalLibrary.BROWSERTYPE);
	       	//MethodsLibrary.methodLaunchUrika(GlobalLibrary.URIKAMACHINE);
	        //MethodsLibrary.methodLoginUrika(GlobalLibrary.USERNAME, GlobalLibrary.PASSWORD);
	        
	        
	         
	    	

	          
	    }

	        
}  
	        
	        
	   
