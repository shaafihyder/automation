package com.yarcdata.tests.automated.managedata;

import com.yarcdata.tests.automated.launchloginquit.TestcaseBrowserLaunchQuitTest;
import com.yarcdata.tests.automated.libraries.FunctionsLibrary;
import com.yarcdata.tests.automated.libraries.MethodsLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Testcase065AddDataVerifyTextTest {
	//Connect to related files...
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    MethodsLibrary MethodsLibrary = new MethodsLibrary ();
    
    WebDriver driver;
    String sOS = FunctionsLibrary.functionWhatOS();
    String sDirSeparator = FunctionsLibrary.functionGetDirSeprator ();
    
    //Read externally stored data - Pick DataLibrary.properties location from pom.xml
    String sPOMXML = System.getProperty ("user.dir") + sDirSeparator + "pom.xml";
    String sDataFile = FunctionsLibrary.functionReadXMLData(sPOMXML, "project.datalibrary"); //String sDataFile = "C:\\automation\\workspaces\\urikaTest\\automated\\src\\main\\java\\com\\yarcdata\\tests\\automated\\libraries\\DataLibrary.properties";
    String sBrowserType = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"Global.sBrowserType");
	String sUrikaMachine = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"Global.sUrikaMachine");
	String sUsername = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"Global.sUsername");
	String sPassword = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"Global.sPassword");
	String sSearchString = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseSearchDataFileTest.sSearchString");
    String sFileImport = FunctionsLibrary.functionWhichFileForFileImport ();
    String sTestcaseName = this.getClass().getSimpleName();
    
    @Test(groups = {"Smoke"})
    public void Test () {
    	
    	//String sFileImport = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseAddLocalDataFileTest.sFileImport"); 
    	
        System.out.println("\n@Testcase_AddLocalDataFileTest @Test");
        MethodsLibrary.methodLaunchBrowser(sBrowserType); //c=chrome, e=explorer, f=firefox, h=htmlunit, s=safari
        MethodsLibrary.methodMaximizeBrowser (sBrowserType);
        MethodsLibrary.methodLaunchUrika(sUrikaMachine);
        MethodsLibrary.methodLoginUrika(sUsername, sPassword);
        MethodsLibrary.methodSelectTabDashboard ();
        MethodsLibrary.methodSelectTabManageData();
        MethodsLibrary.methodSearchDataFile (sSearchString);
        MethodsLibrary.methodAddLocalDataFile(sFileImport);
        FunctionsLibrary.functionCaptureStoreScreenshot (sTestcaseName);
        MethodsLibrary.methodQuitUrika();
    	System.out.println("@TestcaseAddLocalDataFileTest: Successfully completed!\n");
    	
    
    }
 }