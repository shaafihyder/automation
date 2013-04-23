package com.project.automated.framework.sparqlquery;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.automated.framework.libraries.GlobalsLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;
import com.project.automated.framework.libraries.Superclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;


public class Testcase035SparqlQueryTest extends Superclass implements GlobalsLibrary{


@Test(groups = {"SPARQLQuery"})
public void Test (){
			System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	       	
		    String sQuery035 = FunctionsLibrary.functionReadDataLibraryProperties (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sQuery");
		    String sVerifySPARQL1 =  FunctionsLibrary.functionReadDataLibraryProperties (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL1"); 
		    String sVerifySPARQL2 =  FunctionsLibrary.functionReadDataLibraryProperties (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL2");
		    String sVerifySPARQL3 =  FunctionsLibrary.functionReadDataLibraryProperties (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL3");
		    String sVerifySPARQL4 =  FunctionsLibrary.functionReadDataLibraryProperties (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL4");
			
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
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery002, lTimeOut);
	       	
			// RESULTS IN BROWSER
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (lTimeOut*lTimeOut);
	       	
	       	// VALIDATION 1
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 1: Verify browser results...", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery002, lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (lTimeOut*lTimeOut);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL1, lTimeOut);
	       	
	       	// VALIDATION 2
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 2: Verify browser results...", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery002, lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (lTimeOut*lTimeOut);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL2, lTimeOut);
	       	
	       	// VALIDATION 3
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 3: Verify browser results...", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery002, lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (lTimeOut*lTimeOut);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL3, lTimeOut);
	       	
	       	// VALIDATION 4
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 4: Verify browser results...", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", lTimeOut);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery002, lTimeOut);
	      	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (lTimeOut);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (lTimeOut);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL4, lTimeOut);

}

}	        
	   
