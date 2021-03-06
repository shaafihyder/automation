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
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.automated.framework.libraries.GlobalsLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;


public class Testcase000SparqlQueryTest implements GlobalsLibrary{

@Test(groups = {"SPARQLQuery"})
public void Test (){
	
	FunctionsLibrary.functionStartLogDebug (this.getClass().getSimpleName());
	// /Users/shyder/Desktop/automation/workspaces/framework
	System.out.println("OS_NAME : " + GlobalsLibrary.OS_NAME);
	System.out.println("FILE_SEPARATOR : " + GlobalsLibrary.FILE_SEPARATOR);
	System.out.println("OS_ARCHITECTURE : " + GlobalsLibrary.OS_ARCHITECTURE);
	System.out.println("USER_NAME : " + GlobalsLibrary.USER_NAME);
	System.out.println("HOME_JAVA : " + GlobalsLibrary.HOME_JAVA);
	System.out.println("JAVA_VERSION : " + GlobalsLibrary.JAVA_VERSION);
	System.out.println("HOME_JAVA_CLASSPATH : " + GlobalsLibrary.HOME_JAVA_CLASSPATH);
	System.out.println("HOME_USER_DIR : " + GlobalsLibrary.HOME_USER_DIR);
	System.out.println("HOME_LIBRARIES : " + GlobalsLibrary.HOME_LIBRARIES);
	System.out.println("HOME_SUPERCLASSES : " + GlobalsLibrary.HOME_SUPERCLASSES);
	System.out.println("HOME_TEST_SUITE : " + GlobalsLibrary.HOME_TEST_SUITE);
	System.out.println("HOME_RESOURCES : " + GlobalsLibrary.HOME_RESOURCES);
	System.out.println("HOME_GLOBALSCONSTANTS : " + GlobalsLibrary.HOME_GLOBALSCONSTANTS);
	System.out.println("HOME_LOGS_DIR : " + GlobalsLibrary.HOME_LOGS_DIR);
	
	
	Formatter x = null;
	String sDirSeparator = "/";
	String sClassName = "baba";
	
	String sResultFile = sClassName + ".txt";
		
	boolean bResFileExists = new File (sResultFile).isFile();
	
	if (bResFileExists){
		System.out.println ("*********** 1 file exists!");
		try {
			   x= new Formatter (sResultFile);
			}catch (Exception e){
			   
		   }
		
		x.format("%s", "sLine sline");
		x.close ();
		 
	}
	
	if (!bResFileExists){
		System.out.println ("*********** 1 file not exists!");
		File resFile = new File (sResultFile);
		
		try {
			   x= new Formatter (sResultFile);
			}catch (Exception e){
			   
		   }
		 x.format("%s", "sLine sline");
		 x.close ();
		  
    	
	}
	
	
		
		
	//}
	   
	   
	//System.err.println (sLine);
	

	
	


	
}
}