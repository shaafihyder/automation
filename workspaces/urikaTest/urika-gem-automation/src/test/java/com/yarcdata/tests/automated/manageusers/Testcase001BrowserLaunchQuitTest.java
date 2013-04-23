package com.yarcdata.tests.automated.manageusers;

import com.yarcdata.tests.automated.libraries.MethodsLibrary;
import com.yarcdata.tests.automated.libraries.FunctionsLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcase001BrowserLaunchQuitTest {
    //Connect to related files...
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    MethodsLibrary MethodsLibrary = new MethodsLibrary ();
    
    WebDriver driver;
    String sOS = FunctionsLibrary.functionWhatOS();
    String sDirSeparator = FunctionsLibrary.functionGetDirSeprator ();
    
    //Read externally stored data - Pick DataLibrary.properties location from pom.xml
    String sPOMXML = System.getProperty ("user.dir") + sDirSeparator +"pom.xml";
    String sDataFile = FunctionsLibrary.functionReadXMLData(sPOMXML, "project.datalibrary"); 
    //String sDataFile = "C:\\automation\\workspaces\\urikaTest\\automated\\src\\main\\java\\com\\yarcdata\\tests\\automated\\libraries\\DataLibrary.properties";
    String sBrowserType = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"Global.sBrowserType");
    String sTestcaseName = this.getClass().getSimpleName();
    
    @Test(groups = {"Smoke"})
    public void Test () {
    	    	
    	System.out.println("\n@TestcaseBrowserLaunchQuitTest @Test");
        MethodsLibrary.methodLaunchBrowser(sBrowserType); //c=chrome, e=explorer, f=firefox, h=htmlunit, s=safari
        MethodsLibrary.methodMaximizeBrowser (sBrowserType);
        FunctionsLibrary.functionCaptureStoreScreenshot (sTestcaseName);
        MethodsLibrary.methodQuitUrika();
        System.out.println("@TestcaseBrowserLaunchQuitTest: Successfully completed!\n");
    }   
}