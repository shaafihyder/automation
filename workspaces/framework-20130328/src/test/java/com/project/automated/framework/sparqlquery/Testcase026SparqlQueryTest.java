package com.project.automated.framework.sparqlquery;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.w3c.dom.Document;

import com.project.automated.framework.libraries.GlobalLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;


public class Testcase026SparqlQueryTest implements GlobalLibrary{
	
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
	       	
	       	MethodsLibrary.objectPushbuttonSparqlQueryAllResults_click ();
	       	MethodsLibrary.objectComboSparqlQueryOutputFormat_click ();
	       	MethodsLibrary.objectComboSparqlQueryOutputFormatXML_click ();
	       	MethodsLibrary.objectPushbuttonSparqlQueryExecute_click ();
	       
	       	//C:\Users\shyder\Downloads\all.xml
	       	
	       	try 
	        { 
	        //Process p=Runtime.getRuntime().exec("cmd /c dir"); 
	        String sBaseline = "C:\\automation\\workspaces\\framework\\src\\test\\resources\\baseline\\Testcase017SparqlQueryTest.xml";
	        String sTestResult = "C:\\Users\\shyder\\Downloads\\all";
	        Process p=Runtime.getRuntime().exec("cmd fc sBaseline sTestResult > log.txt");
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
	    	
	    }
}  
	        
	        
	   
