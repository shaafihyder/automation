/**********************************************
 * 
 * @author SHAAFI HYDER
 * @email  ShaafiHyder@gmail.com
 * @skype  ShaafiHyder
 * @phone  +1 925-9843999
 * @date   April 20th, 2013
 * 
 ***********************************************/

package com.project.automated.framework.superclasses;
import com.project.automated.framework.libraries.GlobalsLibrary;
import com.project.automated.framework.libraries.MethodsLibrary;
import com.project.automated.framework.libraries.FunctionsLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SuperclassLaunchLogin implements GlobalsLibrary{
    
@BeforeTest
public void BeforeTest (){
    
		WebDriver driver;
		
		System.out.println  ("===========================================================");
		System.out.println ("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		System.out.println ("===========================================================");
		System.out.println ("[" + this.getClass().getSimpleName() + "] " + FunctionsLibrary.functionGetDateTime ());
		System.out.println ("===========================================================");
	
		System.out.println ("OS_NAME : " + GlobalsLibrary.OS_NAME);
		System.out.println ("FILE_SEPARATOR : " + GlobalsLibrary.FILE_SEPARATOR);
		System.out.println ("OS_ARCHITECTURE : " + GlobalsLibrary.OS_ARCHITECTURE);
		System.out.println ("USER_NAME : " + GlobalsLibrary.USER_NAME);
		System.out.println ("HOME_JAVA : " + GlobalsLibrary.HOME_JAVA);
		System.out.println ("JAVA_VERSION : " + GlobalsLibrary.JAVA_VERSION);
		System.out.println ("HOME_JAVA_CLASSPATH : " + GlobalsLibrary.HOME_JAVA_CLASSPATH);
		System.out.println ("HOME_USER_DIR : " + GlobalsLibrary.HOME_USER_DIR);
		System.out.println ("HOME_LIBRARIES : " + GlobalsLibrary.HOME_LIBRARIES);
		System.out.println ("HOME_SUPERCLASSES : " + GlobalsLibrary.HOME_SUPERCLASSES);
		System.out.println ("HOME_TEST_SUITE : " + GlobalsLibrary.HOME_TEST_SUITE);
		System.out.println ("HOME_RESOURCES : " + GlobalsLibrary.HOME_RESOURCES);
		System.out.println ("HOME_GLOBALSCONSTANTS : " + GlobalsLibrary.HOME_GLOBALSCONSTANTS);
		System.out.println ("HOME_LOGS_DIR : " + GlobalsLibrary.HOME_LOGS_DIR);
	
	    
    	// BROWSER LAUNCH
    	MethodsLibrary.objectBrowserWebApp_launch (GlobalsLibrary.URIKA_MACHINE);
    	MethodsLibrary.objectBrowserWebApp_maximize ();
    	     	
    	// LOGIN WEB-APP
    	MethodsLibrary.objectTextfieldLoginUsername_enterdata (GlobalsLibrary.APP_USERNAME, TIME_OUT);
    	MethodsLibrary.objectTextfieldLoginPassword_enterdata (GlobalsLibrary.APP_PASSWORD, TIME_OUT);
    	MethodsLibrary.objectPushbuttonLoginSignIn_click (TIME_OUT);
    	
    	// VERIFY LOGIN WEB-APP
    	String sloginPageTitle = MethodsLibrary.methodVerifyLoginWebApp ();
    	if (sloginPageTitle.contains("Graph Analytics Manager") ==  false){
    		System.err.println  ("[" + this.getClass().getSimpleName() + "] Login Failed!");
    		
    	} else {
    		System.out.println ("[" + this.getClass().getSimpleName() + "] Login Succeeded!");}
}   



@AfterTest
public void AfterTest ()  {
        	System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	       	
        MethodsLibrary.methodQuitUrika();        	
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"index.html");
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"emailable-report.html");
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"testng-results.xml");
        	//MethodsLibrary.methodDisplayTestReport (sPathTestOutputReports+"junitreports");
}
}  
	        





	        
	        
	   
   
	        
	   
