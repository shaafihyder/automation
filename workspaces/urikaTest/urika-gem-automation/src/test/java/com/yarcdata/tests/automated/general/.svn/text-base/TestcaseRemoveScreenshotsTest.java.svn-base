package com.yarcdata.tests.automated.general;

import com.yarcdata.tests.automated.libraries.MethodsLibrary;
import com.yarcdata.tests.automated.libraries.FunctionsLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestcaseRemoveScreenshotsTest {
	//Connect to related files...
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    MethodsLibrary MethodsLibrary = new MethodsLibrary ();
        
	String sFolderToBeClean = FunctionsLibrary.functionFolderToBeClean (); 
	    
	    
	    @Test(groups = {"Smoke"})
	    public void Test () {
	    	
	    	FunctionsLibrary.functionDeleteAllFilesOfFolder (sFolderToBeClean);
	    	
	    	System.out.println("@TestcaseRemoveScreenshotsTest: All existing Screenshots have been removed.");
	    	System.out.println("@TestcaseRemoveScreenshotsTest: Successfully completed!\n");
		
	    }
    
}