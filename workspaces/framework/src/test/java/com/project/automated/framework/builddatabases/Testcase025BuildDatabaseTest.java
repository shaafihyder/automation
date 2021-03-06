/**********************************************
 * 
 * @author SHAAFI HYDER
 * @email  ShaafiHyder@gmail.com
 * @skype  ShaafiHyder
 * @phone  +1 925-9843999
 * @date   April 20th, 2013
 * 
 ***********************************************/


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
import com.project.automated.framework.superclasses.SuperclassLaunchLogin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;

public class Testcase025BuildDatabaseTest extends SuperclassLaunchLogin implements GlobalsLibrary{

@Test(groups = {"BuildDatabases"})
public void Test (){
	       	
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
	       	MethodsLibrary.objectPushbuttonSparqlQuery_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryClear_click (TIME_OUT);
	       	MethodsLibrary.objectTextfieldSparqlQueryNew_click ("Test Suite: Build database...", TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (TIME_OUT);
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click (TIME_OUT);
	       	MethodsLibrary.objectPanelSparqlQueryBrowserResults_exists (TIME_OUT*TIME_OUT);
	       	MethodsLibrary.objectComboSparqlQueryRecordsPerPage_click (TIME_OUT);	
	       	MethodsLibrary.objectComboSparqlQueryRecordsPerPage100_click (TIME_OUT);
	       	

        	} 
}
	        
	        
