package com.project.automated.framework.sparqlquery;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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


public class Testcase011SparqlQueryTest implements GlobalLibrary{
	    
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
		    System.out.println("[" + this.getClass().getSimpleName() + "] Testcase Data   : " + GlobalLibrary.DATALIBRARY);  
		    //***************************************************************************************//
}
	
@Test(groups = {"SPARQLQuery"})
public void Test (){
			System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	    	
			// BROWSER
			MethodsLibrary.objectBrowserWebApp_launch (GlobalLibrary.URIKAMACHINE); //c=chrome, e=explorer, f=firefox, h=htmlunit, s=safari
	       	MethodsLibrary.objectBrowserWebApp_maximize ();
	       	
	       	// LOGIN
	       	MethodsLibrary.objectTextfieldLoginUsername_enterdata (GlobalLibrary.USERNAME, lTimeOut);
	       	MethodsLibrary.objectTextfieldLoginPassword_enterdata (GlobalLibrary.PASSWORD, lTimeOut);
	       	MethodsLibrary.objectPushbuttonLoginSignIn_click (lTimeOut);
	       	
	       	// IMPORT DATA
	       	MethodsLibrary.objectPushbuttonTabDashboard_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonTabManageData_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonImportAddData_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldImportNameYourArtifact_enterdata ("AUTOMATION-Artifact-lubm0", lTimeOut);
	       	MethodsLibrary.objectTextfieldImportComment_enterdata ("AUTOMATION-Artifact-lubm0", lTimeOut);
	       	MethodsLibrary.objectPushButtonImportDataCancel_click (lTimeOut);
	       	
	       	// NEW DATABASE
	       	MethodsLibrary.objectPushButtonTabManageDatabase_click (lTimeOut);
	        MethodsLibrary.objectPushbuttonNewDatabase_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldNewDatabaseName_enterdata ("AUTOMATION-Database", lTimeOut);
	       	MethodsLibrary.objectPushbuttonNewDatabaseAddData_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldNewDatabaseSearch_enterdata("AUTOMATION", lTimeOut);
	       	MethodsLibrary.objectCheckboxNewDatabase_check (lTimeOut);
	       	MethodsLibrary.objectPushbuttonNewDatabaseSubmit_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonNewDatabaseApplyStart_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonNewDatabaseApplyStartConfirm_click (lTimeOut);
	       	
	       	// SPARQL
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery001, lTimeOut);
	       	
			System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	        // RESULTS IN BROWSER
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (lTimeOut);
	       	//MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	//MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (lTimeOut*lTimeOut);
	       	
	       	//MethodsLibrary.objectComboSparqlQueryRecordsPerPage_click (lTimeOut);	
	       	//MethodsLibrary.objectComboSparqlQueryRecordsPerPage100_click (lTimeOut);
	       	//MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	
	       	
	       	
	    
	    
	       	// ALL RESULTS - XML
	       	MethodsLibrary.objectPushbuttonSparqlQueryAllResultsRadio3_click (lTimeOut);
	       	MethodsLibrary.objectComboSparqlQueryOutputFormat_click (lTimeOut);
	       	MethodsLibrary.objectComboSparqlQueryOutputFormatXML_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	
	       	try 
	        { 
	        //Process p=Runtime.getRuntime().exec("cmd /c dir"); 
	        String sBaselinexml = "C:\\automation\\workspaces\\framework\\src\\test\\resources\\baseline\\Testcase017SparqlQueryTest.xml";
	        String sTestResult = "C:\\Users\\shyder\\Downloads\\all";
	        Process p=Runtime.getRuntime().exec("cmd fc sBaselinexml sTestResult > log.txt");
	        p.waitFor(); 
	        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
	        String line=reader.readLine(); 
	        while(line!=null) 
	        { 
	        System.out.println(line); 
	        line=reader.readLine(); 
	        } 
	        } 
	        catch(IOException e1) {} 
	        catch(InterruptedException e2) {} 

	        System.out.println("Done"); 

}
@AfterTest
public void AfterTest ()  {
        	System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	    	//MethodsLibrary.methodQuitUrika();
}
}  
	        
	        
	   