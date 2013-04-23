package com.project.automated.framework.managedatabases;

import com.project.automated.framework.libraries.GlobalLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Testcase011ManageDatabasesTest implements GlobalLibrary{
	
    @Test(groups = {"managedatabases"})
    public void Test () {
    	
    	WebDriver driver;
    	
    	System.out.println("\n@Testcase "+ this.getClass().getSimpleName());    	
    	System.out.println("================================================\n");    	
    	
    	System.out.println("@Testcase @Test Host-OS         : " + System.getProperty("os.name"));  
    	System.out.println("@Testcase @Test OS-Architecture : " + System.getProperty("os.arch"));    
    	System.out.println("@Testcase @Test Username        : " + System.getProperty("user.name"));    	
    	System.out.println("@Testcase @Test User-Directory  : " + System.getProperty ("user.dir")); 
    	System.out.println("@Testcase @Test Java-Home       : " + System.getProperty ("java.home"));  
    	System.out.println("@Testcase @Test Testcase Data   : " + GlobalLibrary.DATALIBRARY);  
    	//***************************************************************************************//
        
    	System.out.println("@Testcase @Test shaafi   : " + GlobalLibrary.sSearchText);  
    	
    	
    	System.out.println("@Testcase @Test : "+ this.getClass().getSimpleName() +" Successfully Completed!\n");
        
    }   
}