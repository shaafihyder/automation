/**********************************************
 * 
 * @author SHAAFI HYDER
 * @email  ShaafiHyder@gmail.com
 * @skype  ShaafiHyder
 * @phone  +1 925-9843999
 * @date   April 20th, 2013
 * 
 ***********************************************/


package com.project.automated.framework.sparqlquery;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.automated.framework.libraries.GlobalsLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;
import com.project.automated.framework.superclasses.SuperclassLaunchLoginBuildDatabase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;


public class Testcase011SparqlQueryTest extends SuperclassLaunchLoginBuildDatabase implements GlobalsLibrary{


@Test(groups = {"SPARQLQuery"})
public void Test (){
			System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	       	
		    String sQuery011 = FunctionsLibrary.functionReadDataLibraryProperties (HOME_SPARQLQUERY_PROPS, "sparqlquery.Testcase001SparqlQueryTest.sQuery");
		    String sVerifySPARQL1 =  FunctionsLibrary.functionReadDataLibraryProperties (HOME_SPARQLQUERY_PROPS, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL1"); 
		    String sVerifySPARQL2 =  FunctionsLibrary.functionReadDataLibraryProperties (HOME_SPARQLQUERY_PROPS, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL2");
		    String sVerifySPARQL3 =  FunctionsLibrary.functionReadDataLibraryProperties (HOME_SPARQLQUERY_PROPS, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL3");
		    String sVerifySPARQL4 =  FunctionsLibrary.functionReadDataLibraryProperties (HOME_SPARQLQUERY_PROPS, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL4");
			
	       	
	       	// SPARQL
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery011, TIME_OUT);
	       	
			// RESULTS IN BROWSER
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (TIME_OUT);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (TIME_OUT*TIME_OUT);
	       	
	       	// VALIDATION 1
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 1: Verify browser results...", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery011, TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (TIME_OUT);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (TIME_OUT*TIME_OUT);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL1, TIME_OUT);
	       	
	       	// VALIDATION 2
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 2: Verify browser results...", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery011, TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (TIME_OUT);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (TIME_OUT*TIME_OUT);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL2, TIME_OUT);
	       	
	       	// VALIDATION 3
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 3: Verify browser results...", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery011, TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (TIME_OUT);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (TIME_OUT*TIME_OUT);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL3, TIME_OUT);
	       	
	       	// VALIDATION 4
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("VALIDATION 4: Verify browser results...", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("You are about to see Sparql query", TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click (sQuery011, TIME_OUT);
	      	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (TIME_OUT);
	       	MethodsLibrary.methodVerify_BrowserResultsValidation (sVerifySPARQL4, TIME_OUT);

}

}	        
	   
