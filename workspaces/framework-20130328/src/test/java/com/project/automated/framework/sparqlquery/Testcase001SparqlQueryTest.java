package com.project.automated.framework.sparqlquery;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import com.project.automated.framework.libraries.GlobalLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;


public class Testcase001SparqlQueryTest implements GlobalLibrary{
	
	    WebDriver driver;
	
	    @Test(groups = {"SPARQLQuery"})
	    public void Test ()  {

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
	       	//MethodsLibrary.objectPushbuttonTabDashboard_click ();
	       	//MethodsLibrary.objectPushbuttonTabManageData_click ();
	       	//MethodsLibrary.objectPushbuttonImportAddData_click ();
	       	//MethodsLibrary.objectTextfieldImportNameYourArtifact_enterdata ("AUTOMATION-Artifact");
	       	//MethodsLibrary.objectTextfieldImportComment_enterdata ("AUTOMATION-Artifact");
	       	//MethodsLibrary.objectPushButtonImportDataCancel_click ();
	       	
	       	// NEW DATABASE
	       	//MethodsLibrary.objectPushButtonTabManageDatabase_click ();
	       	
	       	//MethodsLibrary.objectPushbuttonNewDatabase_click ();
	       	//MethodsLibrary.objectTextfieldNewDatabaseName_enterdata ();
	       	//MethodsLibrary.objectPushbuttonNewDatabaseAddData_click ();
	       	//MethodsLibrary.objectTextfieldNewDatabaseSearch_enterdata("AUTOMATION");
	       	//MethodsLibrary.objectCheckboxNewDatabase_check ();
	       	//MethodsLibrary.objectPushbuttonNewDatabaseSubmit_click ();
	       	//MethodsLibrary.objectPushbuttonNewDatabaseApplyStart_click ();
	       	//MethodsLibrary.objectPushbuttonNewDatabaseApplyStartConfirm_click ();
	       	
	       	// SPARQL
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click ();
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click ();
	       	//MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query");
	       	
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery001);
	       	
	       	// ALL RESULTS - XML
	       	/*
	       	MethodsLibrary.objectPushbuttonSparqlQueryAllResults_click ();
	       	MethodsLibrary.objectComboSparqlQueryOutputFormat_click ();
	       	MethodsLibrary.objectComboSparqlQueryOutputFormatXML_click ();
	       	MethodsLibrary.objectComboSparqlQueryOutputFormat_click2 ();
	       */
	       	
	     // ALL RESULTS - IN BROWSER
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowser_click ();
	       	
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click ();
	       	MethodsLibrary.objectComboSparqlQueryRecordsPerPage_click ();	
	       	MethodsLibrary.objectComboSparqlQueryRecordsPerPage100_click ();
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click ();
	       	
	       	
	       	
    	    }
	    
	    @AfterTest 
	    public void AfterTest ()  {
    
	    	System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	    	
	    	String sBaseline = "<http://www.Department0.University0.edu/GraduateStudent124>" + "\n" +
	    		               "<http://www.Department0.University0.edu/GraduateStudent142>" + "\n" +
	    			           "<http://www.Department0.University0.edu/GraduateStudent44>" + "\n" +
	    			           "<http://www.Department0.University0.edu/GraduateStudent101>";
	    	
	    	   
	    	String sTestResults = MethodsLibrary.objectPanelSparqlQueryExecuteResults.getText();
	    	
	    	System.out.println("\n[" + this.getClass().getSimpleName() + "] BASELINE DATA:");
	    	System.out.println("========================================================");
	    	System.out.println(sBaseline);
	    	System.out.println("\n[" + this.getClass().getSimpleName() + "] TEST RESULTS:");
	    	System.out.println("========================================================");
	    	System.out.println(sTestResults);
	    	System.out.println("\n");
	    	
	    	if (sBaseline.equals(sTestResults) == true){
	    		System.out.println("[" + this.getClass().getSimpleName() + "] " + "Testcase Paased!");
		    }else {
	    		System.out.println("[" + this.getClass().getSimpleName() + "] " + "Testcase Failed");
	    		
	    		
		    	
	    	}


	    	
	    		   

	    	
	    	//MethodsLibrary.objectBrowserWebApp_quit();
		    System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
			  
	    
	    }
}  
	        
	        
	   
