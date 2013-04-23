package com.yarcdata.tests.automated.report;

import com.yarcdata.tests.automated.libraries.MethodsLibrary;
import com.yarcdata.tests.automated.libraries.FunctionsLibrary;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestcaseSendReportTest {
	
	//Connect to related files...
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    MethodsLibrary MethodsLibrary = new MethodsLibrary ();
    
    WebDriver driver;
    String sOS = FunctionsLibrary.functionWhatOS();
    String sDirSeparator = FunctionsLibrary.functionGetDirSeprator ();
    
    //Read externally stored data - Pick DataLibrary.properties location from pom.xml
    String sPOMXML = System.getProperty ("user.dir") + sDirSeparator +"pom.xml";
    String sDataFile = FunctionsLibrary.functionReadXMLData(sPOMXML, "project.datalibrary"); //String sDataFile = "C:\\automation\\workspaces\\urikaTest\\automated\\src\\main\\java\\com\\yarcdata\\tests\\automated\\libraries\\DataLibrary.properties";
    String sBrowserType = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"Global.sBrowserType");
    String sTestcaseName = this.getClass().getSimpleName();
      
	String sSendReportTo = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"Global.sSendReportTo");
	    	    
	    @Test(groups = {"Smoke"})
	    public void Test () {
	    	
	    	String sOS = System.getProperty("os.name");
	        	//System.out.println ("OS Name: "+ System.getProperty("os.name"));
	        	if (sOS.contains("Windows 7")){
	        		//FunctionsLibrary.functionSendEmail(sSendReportTo);
	        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Windows 7 & Directory separator is:"+ sDirSeparator);}
	        	else if (sOS.contains("Windows XP")){
	        		
	        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Windows XP & Directory separator is:"+ sDirSeparator);}
	        	else if (sOS.contains("Linux")){
	        		
	        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Linux & Directory separator is:"+ sDirSeparator);}
	        	else if (sOS.contains("Macintosh")){
	        		
	        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Macintosh & Directory separator is:"+ sDirSeparator);}
	        	else {
	        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - Unable to detect OS type & Directory separator type :(");}
		    
	    	System.out.println("@TestcaseSendReportTest: Successfully completed!\n");
   
	}
}