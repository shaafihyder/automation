package com.yarcdata.tests.automated.general;

import com.yarcdata.tests.automated.libraries.MethodsLibrary;
import com.yarcdata.tests.automated.libraries.FunctionsLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestcaseGetEnvDetailsTest {
	//Connect to related files...
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    MethodsLibrary MethodsLibrary = new MethodsLibrary ();
    
    WebDriver driver;
    String sOS = FunctionsLibrary.functionWhatOS();
    String sDirSeparator = FunctionsLibrary.functionGetDirSeprator ();
        
    //Read externally stored data - Pick DataLibrary.properties location from pom.xml
    String sPOMXML = System.getProperty ("user.dir") + sDirSeparator + "pom.xml";
    ///Users/shyder/Desktop/automation/workspaces/urikaTest/urika-gem-automation pom.xml
    String sDataFile = FunctionsLibrary.functionReadXMLData(sPOMXML, "project.datalibrary"); //String sDataFile = "C:\\automation\\workspaces\\urikaTest\\automated\\src\\main\\java\\com\\yarcdata\\tests\\automated\\libraries\\DataLibrary.properties";
    String sTestcaseName = this.getClass().getSimpleName();
          
    @Test(groups = {"Smoke"})
    public void Test () {
    	
    	String sStoreScreenshotAt = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseGetEnvDetailsTest.sStoreScreenshotAt");
    	System.out.println("\n@TestcaseGetEnvDetailsTest @Test");
    	FunctionsLibrary.functionWaitForAnObject(7);
        FunctionsLibrary.functionEnvDetails ();
    	
        System.out.println("@TestcaseGetEnvDetailsTest: Successfully completed!\n");
    }

}
   