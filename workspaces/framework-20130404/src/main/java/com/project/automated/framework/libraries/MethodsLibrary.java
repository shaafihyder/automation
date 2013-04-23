
package com.project.automated.framework.libraries;

//import com.yarcdata.tests.automated.libraries.ObjectsLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Robot;
import java.awt.Window;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
//
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

//http://inside.us.cray.com/depts/IT/Lists/BYOD/AllItems.aspx

public class MethodsLibrary
{
	public WebDriver driver;
    private WebDriverWait wait;
    
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    
    //protected WebElement element;
    //private WebElement returnTextField_Email, returnTextFiled_Password, returnPushButton_SignIn;
    
    
  
    
    
    // SPARQL QUERY
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/select/option[2]") public WebElement objectComboSparqlQueryOutputFormatXML;
    
    

/**************************************************************************************************
*                                         BROWSER                                               *
**************************************************************************************************/

    @FindBy(xpath="/html/body/span/table/tbody/tr[55]/td/b") public WebElement objectTestFindCordinatesOfElement;	
public WebDriver objectTestFindCordinatesOfElement_findxy (){
	PageFactory.initElements(driver, this);
	   
	   
    	try {
    	     Thread.sleep(2000);} 
       catch (InterruptedException e) {
    	           e.printStackTrace();  
        }
    	
    		driver = new FirefoxDriver(); 
        driver.get("http://tennisamerica.tripod.com/phones/index.htm");
        driver.manage().window().maximize();
    	         
        try {
     	     Thread.sleep(2000);} 
        catch (InterruptedException e) {
     	           e.printStackTrace();  
         }
        
        long lTimeOutSeconds = 5;
        long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
        long lStartTime = System.currentTimeMillis();
 	   long lTimeTakenToDisplayobject;
 	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
 	   
 	   while (System.currentTimeMillis() < lEndTime) {
 		  objectTestFindCordinatesOfElement = driver.findElement(By.xpath ("/html/body/span/table/tbody/tr[55]/td/b"));
     	   if (objectTestFindCordinatesOfElement.isDisplayed()) {
     		   System.out.println ("woooohoooo found element");
     		   
     		   //shaafi start
     		    //Locatable hoverItem = (Locatable) driver.findElement(By.xpath("/html/body/span/table/tbody/tr[55]/td/b"));
     	        //int x = hoverItem.getCoordinates().getLocationOnScreen().getX();
     	        //int y = hoverItem.getCoordinates().getLocationOnScreen().getY();
    	        
     	        Point sLocationXY = objectTestFindCordinatesOfElement.getLocation();
     	        ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
     	        ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
    	       
     	       objectTestFindCordinatesOfElement.sendKeys(Keys.ENTER);
     	      
     	     //Point coordinates = driver.findElement(By.id("ctl00_portalmaster_txtUserName")).getLocation();
     	    //Robot robot = new Robot();
     	    //robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
    		    
     		   //FirefoxProfile profile = new FirefoxProfile();
              //profile.setPreference("dom.disable_window_flip",false);
     	      	//driver = new FirefoxDriver(profile);
     	      	//augmentedDriver = new Augmenter().augment(driver);
          //((JavascriptExecutor)driver).executeScript("window.focus()");
     		   
     		   //shaafi end
     		   //objectTestFindCordinatesOfElement.sendKeys("o");
     		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
     		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected!");
     		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
              
     		   try {
     	           Thread.sleep(2000);} 
     		   catch (InterruptedException e) {
     	           e.printStackTrace();  
     	       }
     	break;
            }
    	    }
        
 	   //System.out.println ("oooops unable to find");
        
      //  objectTextfieldLoginUsername = driver.findElement(By.xpath ("/html/body/span/table/tbody/tr[55]/td/b"));
  	  // if (objectTestFindCordinatesOfElement.isDisplayed()) {
  		  
 	//  objectTestFindCordinatesOfElement.sendKeys(Keys.ENTER);
	 /*   
    		Locatable hoverItem = (Locatable) driver.findElement(By.xpath("/html/body/span/table/tbody/tr[55]/td/b"));
        int y = hoverItem.getCoordinates().getLocationOnScreen().getY();
        int x = hoverItem.getCoordinates().getLocationOnScreen().getX();
        
        System.out.println ("y location1: "+ y+" and x is:"+ x);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+y+");");
        //System.out.println ("y location2: "+ y);
        objectTestFindCordinatesOfElement.sendKeys(Keys.ENTER);
    	    //System.out.println ("2nd: "+s);
    	*/
    return driver;
    }

public WebDriver objectBrowserWebApp_launch (String sURL){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   /*  
	    String sBrowserType = null;
	    sBrowserType = sBrowserType.toLowerCase();
        System.out.println(sBrowserType);
        if (sBrowserType.equals ("chrome")==true){
        	driver = new ChromeDriver(); 
        } else if (sBrowserType.equals ("firefox")==true){
        	System.out.println("@Methods_Urika : methodLaunchBrowser ()");
        	driver = new FirefoxDriver(); 
        } else if (sBrowserType.equals ("safari")==true){
        	driver = new SafariDriver(); 
        } else if (sBrowserType.equals ("exlorer")==true){
        	DesiredCapabilities browserCapability = DesiredCapabilities.internetExplorer();
            browserCapability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new InternetExplorerDriver(browserCapability);
        } else if (sBrowserType.equals ("htmlunit")==true){
        	driver = new HtmlUnitDriver(); 
        } 
        */
       driver = new FirefoxDriver(); 
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get(sURL);
      
	         
       try {
    	     Thread.sleep(2000);} 
       catch (InterruptedException e) {
    	           e.printStackTrace();  
        }
	   
return driver;

}
public WebDriver objectBrowserWebApp_maximize (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   driver.manage().window().maximize(); 
	   
       try {
  	         Thread.sleep(2000);} 
       catch (InterruptedException e) {
  	         e.printStackTrace();  
       }
return driver;
}
public WebDriver objectBrowserWebApp_quit (){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   driver.quit(); 
       try {
  	     Thread.sleep(2000);} 
       catch (InterruptedException e) {
  	           e.printStackTrace();  
        }
return driver;
}


/**************************************************************************************************
*                                         LOGIN                                                 *
**************************************************************************************************/
@FindBy(id = "username") public WebElement objectTextfieldLoginUsername;
public WebDriver objectTextfieldLoginUsername_enterdata (String sUserName, long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
    	   		 objectTextfieldLoginUsername = driver.findElement(By.id("username"));
    	     	 Point sLocationXY = objectTextfieldLoginUsername.getLocation();
     	     ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
     	     ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
    	   		 if (objectTextfieldLoginUsername.isDisplayed()) {
    	   			 objectTextfieldLoginUsername.sendKeys(sUserName);
    	   			 lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    	   			 System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
    	   			 System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    	   			 try {
    	   				 Thread.sleep(2000);} 
    	   			 catch (InterruptedException e) {
    	   				 e.printStackTrace();  
    	   			 }
    	break;
           }
   	    }
	   
return driver;
}

@FindBy(id = "password") public WebElement objectTextfieldLoginPassword;
public WebDriver objectTextfieldLoginPassword_enterdata (String sPassword, long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		     objectTextfieldLoginPassword = driver.findElement(By.id("password"));
		     if (objectTextfieldLoginPassword.isDisplayed()) {
		    	 	 Point sLocationXY = objectTextfieldLoginPassword.getLocation();
	     	     ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	     ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		 
		    	 	 objectTextfieldLoginPassword.sendKeys(sPassword);
		    	 	 lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
		    		 System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
		    	   	 System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   
return driver;
}

@FindBy(id = "login") public WebElement objectPushbuttonLoginSignIn;
public WebDriver objectPushbuttonLoginSignIn_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   	 objectPushbuttonLoginSignIn = driver.findElement(By.id("login"));
    	   		 if (objectPushbuttonLoginSignIn.isDisplayed()) {
    	   			 Point sLocationXY = objectPushbuttonLoginSignIn.getLocation();
	     	     ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	     ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		 
	     	     objectPushbuttonLoginSignIn.click ();
	     	     lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
	     	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	    	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
	    	   	     try {
	    	   	    	 	Thread.sleep(2000);} 
	    	   	     catch (InterruptedException e) {
	    	   	    	 	e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   
return driver;
}



/**************************************************************************************************
*                                         TABS                                                  *
**************************************************************************************************/
@FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[2]/a") public WebElement objectPushbuttonTabDashboard;
public WebDriver objectPushbuttonTabDashboard_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		    objectPushbuttonTabDashboard = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/ul/li[2]/a"));
    	   		if (objectPushbuttonTabDashboard.isDisplayed()) {
    	   			Point sLocationXY = objectPushbuttonTabDashboard.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    	   			objectPushbuttonTabDashboard.click ();
    	   			lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    	   			System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	    	   	    System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    	   			try {
    	   				Thread.sleep(2000);} 
    	   			catch (InterruptedException e) {
    	   				e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   
	   
	   //FunctionsLibrary.functionWaitForAnObject (2);
       //objectPushbuttonTabDashboard.click();
       //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[7]/a") public WebElement objectPushbuttonTabManageData;
public WebDriver objectPushbuttonTabManageData_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		    objectPushbuttonTabManageData = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/ul/li[7]/a"));
    	   		if (objectPushbuttonTabManageData.isDisplayed()) {
    	   			Point sLocationXY = objectPushbuttonTabManageData.getLocation();
    	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
    	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
    	    	   		
    	   			objectPushbuttonTabManageData.click ();
    	   			lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    	   			System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	    	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    	   			try {
    	   				Thread.sleep(2000);} 
    	   			catch (InterruptedException e) {
    	   				e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   
	   //FunctionsLibrary.functionWaitForAnObject (2);
       //objectPushbuttonTabManageData.click();
       //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}



/**************************************************************************************************
*                                         IMPORT-DATA                                               *
**************************************************************************************************/
@FindBy(id = "addDataButton") public WebElement objectPushbuttonImportAddData;
public WebDriver objectPushbuttonImportAddData_click (long lTimeOutSeconds){
		System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		PageFactory.initElements(driver, this);
		
		   
		   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
	       long lStartTime = System.currentTimeMillis();
		   long lTimeTakenToDisplayobject;
		   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
		   
		   while (System.currentTimeMillis() < lEndTime) {
			   objectPushbuttonImportAddData = driver.findElement(By.id("addDataButton"));
	    	   if (objectPushbuttonImportAddData.isDisplayed()) {
	    		   Point sLocationXY = objectPushbuttonImportAddData.getLocation();
   	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
   	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
   	    	   		
	    		   objectPushbuttonImportAddData.click ();
	    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
	    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	    	   	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
	             
	    		   try {
	    	           Thread.sleep(2000);} 
	    		   catch (InterruptedException e) {
	    	           e.printStackTrace();  
	    	       }
	    	break;
	           }
	   	    }
		   

		
		//FunctionsLibrary.functionWaitForAnObject (2);
		
		  //String sTag = objectPushbuttonImportAddData.getTagName();
		   
		   //System.out.println ("sTag " + sTag);
        //objectPushbuttonImportAddData.click();
        //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "filenameInput") public WebElement objectTextfieldImportNameYourArtifact;
public WebDriver objectTextfieldImportNameYourArtifact_enterdata (String sNameYourArtifact, long lTimeOutSeconds){
    	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
    	PageFactory.initElements(driver, this);
    	
 	   
 	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
        long lStartTime = System.currentTimeMillis();
 	   long lTimeTakenToDisplayobject;
 	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
 	   
 	   while (System.currentTimeMillis() < lEndTime) {
 		  objectTextfieldImportNameYourArtifact = driver.findElement(By.id("filenameInput"));
     	   if (objectTextfieldImportNameYourArtifact.isDisplayed()) {
     		  Point sLocationXY = objectTextfieldImportNameYourArtifact.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
     		   objectTextfieldImportNameYourArtifact.sendKeys(sNameYourArtifact);
     		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
     		  System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
 	   	      System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
              
     		   try {
     	           Thread.sleep(2000);} 
     		   catch (InterruptedException e) {
     	           e.printStackTrace();  
     	       }
     	break;
            }
    	    }
 	   

    	//FunctionsLibrary.functionWaitForAnObject (2);
    	//objectTextfieldImportNameYourArtifact.sendKeys(sNameYourArtifact);
    	//FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "localInput") public WebElement objectTextfieldImportArtifact;
public WebDriver objectTextfieldImportArtifact_enterdata (String sArtifactName, long lTimeOutSeconds){
    	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
    	PageFactory.initElements(driver, this);
    	
 	   
 	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
        long lStartTime = System.currentTimeMillis();
 	   long lTimeTakenToDisplayobject;
 	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
 	   
 	   while (System.currentTimeMillis() < lEndTime) {
 		  objectTextfieldImportArtifact = driver.findElement(By.id("localInput"));
     	   if (objectTextfieldImportArtifact.isDisplayed()) {
     		  Point sLocationXY = objectTextfieldImportArtifact.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
     		   objectTextfieldImportArtifact.sendKeys(sArtifactName);
     		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
     		  System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
 	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
              
     		   try {
     	           Thread.sleep(2000);} 
     		   catch (InterruptedException e) {
     	           e.printStackTrace();  
     	       }
     	break;
            }
    	    }
 	   

    	//FunctionsLibrary.functionWaitForAnObject (2);
    	//objectTextfieldImportArtifact.sendKeys(sArtifactName);
    	//FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "commentsInput") public WebElement objectTextfieldImportComment;
public WebDriver objectTextfieldImportComment_enterdata (String sComment, long lTimeOutSeconds){
		System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		PageFactory.initElements(driver, this);
		
		   
		   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
	       long lStartTime = System.currentTimeMillis();
		   long lTimeTakenToDisplayobject;
		   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
		   
		   while (System.currentTimeMillis() < lEndTime) {
			   objectTextfieldImportComment = driver.findElement(By.id("commentsInput"));
	    	   if (objectTextfieldImportComment.isDisplayed()) {
	    		   Point sLocationXY = objectTextfieldImportComment.getLocation();
   	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
   	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
   	    	   		
	    		   objectTextfieldImportComment.sendKeys(sComment);
	    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
	    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	    	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
	             
	    		   try {
	    	           Thread.sleep(2000);} 
	    		   catch (InterruptedException e) {
	    	           e.printStackTrace();  
	    	       }
	    	break;
	           }
	   	    }
		   

		//FunctionsLibrary.functionWaitForAnObject (2);
	    //objectTextfieldImportComment.sendKeys(sComment);
	    //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "importDataCancel") public WebElement objectPushButtonImportDataCancel;
public WebDriver objectPushButtonImportDataCancel_click (long lTimeOutSeconds){
		System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		PageFactory.initElements(driver, this);
		
		   
		   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
	       long lStartTime = System.currentTimeMillis();
		   long lTimeTakenToDisplayobject;
		   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
		   
		   while (System.currentTimeMillis() < lEndTime) {
			   objectPushButtonImportDataCancel = driver.findElement(By.id("importDataCancel"));
	    	   if (objectPushButtonImportDataCancel.isDisplayed()) {
	    		   Point sLocationXY = objectPushButtonImportDataCancel.getLocation();
   	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
   	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
   	    	   		
	    		   objectPushButtonImportDataCancel.click ();
	    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
	    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	    	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
	             
	    		   try {
	    	           Thread.sleep(2000);} 
	    		   catch (InterruptedException e) {
	    	           e.printStackTrace();  
	    	       }
	    	break;
	           }
	   	    }
		   

		//FunctionsLibrary.functionWaitForAnObject (2);
		//objectPushButtonImportDataCancel.click();
		//FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}




/**************************************************************************************************
*                                         NEW DATABASE                                               *
**************************************************************************************************/

@FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[6]/a") public WebElement objectPushButtonTabManageDatabase;
public WebDriver objectPushButtonTabManageDatabase_click (long lTimeOutSeconds){
		System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
		PageFactory.initElements(driver, this);
	
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
	   long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushButtonTabManageDatabase = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/ul/li[6]/a"));
 	   if (objectPushButtonTabManageDatabase.isDisplayed()) {
 		  Point sLocationXY = objectPushButtonTabManageDatabase.getLocation();
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
  	   		
 		   objectPushButtonTabManageDatabase.click ();
 		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
 		  System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
          
 		   try {
 	           Thread.sleep(2000);} 
 		   catch (InterruptedException e) {
 	           e.printStackTrace();  
 	       }
 	break;
        }
	    }
	   

	//FunctionsLibrary.functionWaitForAnObject (2);
    //objectPushButtonTabManageDatabase.click();
	//FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "newDatabaseButton") public WebElement objectPushbuttonNewDatabase;
public WebDriver objectPushbuttonNewDatabase_click (long lTimeOutSeconds){	
	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	PageFactory.initElements(driver, this);
	
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
    long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonNewDatabase = driver.findElement(By.id("newDatabaseButton"));
 	   if (objectPushbuttonNewDatabase.isDisplayed()) {
 		  Point sLocationXY = objectPushbuttonNewDatabase.getLocation();
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
  	   		
 		   objectPushbuttonNewDatabase.click ();
 		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
 		  System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
          
 		   try {
 	           Thread.sleep(2000);} 
 		   catch (InterruptedException e) {
 	           e.printStackTrace();  
 	       }
 	break;
        }
	    }
	   
/*
	driver.getCurrentUrl();
	System.out.println("[" + this.getClass().getSimpleName() + "] URL: " + driver.getCurrentUrl());
	boolean bIsEnabled_objectPushbuttonNewDatabase; 
	boolean bIsDisplayed_objectPushbuttonNewDatabase; 
	
	
	FunctionsLibrary.functionWaitForAnObject (2);
	
	
	if (driver.getPageSource().contains("New Database")){
		System.out.println ("WebElement objectPushbuttonNewDatabase exists? " + driver.getPageSource().contains("New Database"));
		objectPushbuttonNewDatabase.click();
		FunctionsLibrary.functionWaitForAnObject (5);
    }else{
		System.out.println ("WebElement objectPushbuttonNewDatabase exists? " + driver.getPageSource().contains("New Database"));
    }
	
	if (driver.getPageSource().contains("New Database")){
		System.out.println ("WebElement objectPushbuttonNewDatabase exists? " + driver.getPageSource().contains("New Database"));
		objectPushbuttonNewDatabase.click();
		FunctionsLibrary.functionWaitForAnObject (5);
    }else{
		System.out.println ("WebElement objectPushbuttonNewDatabase exists? " + driver.getPageSource().contains("New Database"));
	}
	
	if (driver.getPageSource().contains("New Database")){
		System.out.println ("WebElement objectPushbuttonNewDatabase exists? " + driver.getPageSource().contains("New Database"));
		objectPushbuttonNewDatabase.click();
		FunctionsLibrary.functionWaitForAnObject (5);
    }else{
		System.out.println ("WebElement objectPushbuttonNewDatabase exists? " + driver.getPageSource().contains("New Database"));
	}
	*/
return driver;
}

@FindBy(id = "dbName") public WebElement objectTextfieldNewDatabaseName;
public WebDriver objectTextfieldNewDatabaseName_enterdata (String sDatabaseName, long lTimeOutSeconds){	
	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	PageFactory.initElements(driver, this);
	
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
    long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectTextfieldNewDatabaseName = driver.findElement(By.id("dbName"));
 	   if (objectTextfieldNewDatabaseName.isDisplayed()) {
 		  Point sLocationXY = objectTextfieldNewDatabaseName.getLocation();
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
  	   		
 		   objectTextfieldNewDatabaseName.sendKeys (sDatabaseName);
 		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
 		  System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
          
 		   try {
 	           Thread.sleep(2000);} 
 		   catch (InterruptedException e) {
 	           e.printStackTrace();  
 	       }
 	break;
        }
	    }
	   

	//String sDatabaseName = "AUTOMATION-Database"; 
    //FunctionsLibrary.functionWaitForAnObject (2);
    //objectTextfieldNewDatabaseName.sendKeys (sDatabaseName);
    //FunctionsLibrary.functionWaitForAnObject (5);
return driver;
}

@FindBy(id = "addDataButton") public WebElement objectPushbuttonNewDatabaseAddData;
public WebDriver objectPushbuttonNewDatabaseAddData_click (long lTimeOutSeconds){	
	System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	PageFactory.initElements(driver, this);
	
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
    long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonNewDatabaseAddData = driver.findElement(By.id("addDataButton"));
 	   if (objectPushbuttonNewDatabaseAddData.isDisplayed()) {
 		  Point sLocationXY = objectPushbuttonNewDatabaseAddData.getLocation();
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
   	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
  	   		
 		   objectPushbuttonNewDatabaseAddData.click ();
 		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
 		  System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
          
 		   try {
 	           Thread.sleep(2000);} 
 		   catch (InterruptedException e) {
 	           e.printStackTrace();  
 	       }
 	break;
        }
	    }
	   

	//FunctionsLibrary.functionWaitForAnObject (2);
	//objectPushbuttonNewDatabaseAddData.click ();
    //FunctionsLibrary.functionWaitForAnObject (5);
return driver;
}

@FindBy(xpath = "/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/div/div[2]/div/label/input") public WebElement objectTextfieldNewDatabaseSearch;
public WebDriver objectTextfieldNewDatabaseSearch_enterdata (String sDatabaseName, long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectTextfieldNewDatabaseSearch = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/div/div[2]/div/label/input"));
    	   if (objectTextfieldNewDatabaseSearch.isDisplayed()) {
    		   Point sLocationXY = objectTextfieldNewDatabaseSearch.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectTextfieldNewDatabaseSearch.sendKeys (sDatabaseName);
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectTextfieldNewDatabaseSearch.sendKeys (sDatabaseName);
       //FunctionsLibrary.functionWaitForAnObject (5);
return driver;
}

@FindBy(xpath = "/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/table/tbody/tr/td/label/input") public WebElement objectCheckboxNewDatabase;
public WebDriver objectCheckboxNewDatabase_check (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectCheckboxNewDatabase = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/table/tbody/tr/td/label/input"));
    	   if (objectCheckboxNewDatabase.isDisplayed()) {
    		   Point sLocationXY = objectCheckboxNewDatabase.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectCheckboxNewDatabase.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectCheckboxNewDatabase.click();
       //FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}

@FindBy(id = "addDataToDatabaseAction") public WebElement objectPushbuttonNewDatabaseSubmit;
public WebDriver objectPushbuttonNewDatabaseSubmit_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonNewDatabaseSubmit = driver.findElement(By.id("addDataToDatabaseAction"));
    	   if (objectPushbuttonNewDatabaseSubmit.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonNewDatabaseSubmit.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonNewDatabaseSubmit.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonNewDatabaseSubmit.click();
       //FunctionsLibrary.functionWaitForAnObject (2);
       return driver;
}

@FindBy(id = "applyNewDatabaseButton") public WebElement objectPushbuttonNewDatabaseApplyStart;
public WebDriver objectPushbuttonNewDatabaseApplyStart_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonNewDatabaseApplyStart = driver.findElement(By.id("applyNewDatabaseButton"));
    	   if (objectPushbuttonNewDatabaseApplyStart.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonNewDatabaseApplyStart.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonNewDatabaseApplyStart.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonNewDatabaseApplyStart.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "applyNewDataAction") public WebElement objectPushbuttonNewDatabaseApplyStartConfirm;
public WebDriver objectPushbuttonNewDatabaseApplyStartConfirm_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonNewDatabaseApplyStartConfirm = driver.findElement(By.id("applyNewDataAction"));
    	   if (objectPushbuttonNewDatabaseApplyStartConfirm.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonNewDatabaseApplyStartConfirm.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonNewDatabaseApplyStartConfirm.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonNewDatabaseApplyStartConfirm.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}




/**************************************************************************************************
*                                         DATABASE START/STOP                                      *
**************************************************************************************************/

@FindBy(id = "importDataAction") public WebElement objectPushbuttonNewDatabaseApplyStartSubmit;//
public WebDriver objectPushbuttonNewDatabaseApplyStartSubmit_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonNewDatabaseApplyStartSubmit = driver.findElement(By.id("importDataAction"));
    	   if (objectPushbuttonNewDatabaseApplyStartSubmit.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonNewDatabaseApplyStartSubmit.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonNewDatabaseApplyStartSubmit.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonNewDatabaseApplyStartSubmit.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "topDbButton-787456b1-1759-4c33-9978-d79adf774339") public WebElement objectPushButton_DatabaseStop;
public WebDriver objectPushbuttonNewDatabaseApplyStartConfirm222_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushButton_DatabaseStop = driver.findElement(By.xpath("topDbButton-787456b1-1759-4c33-9978-d79adf774339"));
    	   if (objectPushButton_DatabaseStop.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonTabManageData.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushButton_DatabaseStop.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushButton_DatabaseStop.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}
@FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[14]/a") public WebElement objectPushbuttonSparqlQuery;




/**************************************************************************************************
*                                         SPARQL QUERY                                            *
**************************************************************************************************/

public WebDriver objectPushbuttonSparqlQuery_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonSparqlQuery = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/ul/li[14]/a"));
    	   if (objectPushbuttonSparqlQuery.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonSparqlQuery.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonSparqlQuery.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonSparqlQuery.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "clearBtn") public WebElement objectPushbuttonSparqlQueryClear;
public WebDriver objectPushbuttonSparqlQueryClear_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonSparqlQueryClear = driver.findElement(By.id("clearBtn"));
    	   if (objectPushbuttonSparqlQueryClear.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonTabManageData.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonSparqlQueryClear.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonSparqlQueryClear.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "optionsRadios1") public WebElement objectPushbuttonSparqlQueryResultsInBrowserRadio1;
public WebDriver objectPushbuttonSparqlQueryResultsInBrowserRadio1_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonSparqlQueryResultsInBrowserRadio1 = driver.findElement(By.id("optionsRadios1"));
    	   if (objectPushbuttonSparqlQueryResultsInBrowserRadio1.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonSparqlQueryResultsInBrowserRadio1.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonSparqlQueryResultsInBrowserRadio1.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonSparqlQueryResultsInBrowserRadio1.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "optionsRadios3") public WebElement objectPushbuttonSparqlQueryAllResultsRadio3;
public WebDriver objectPushbuttonSparqlQueryAllResultsRadio3_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonSparqlQueryAllResultsRadio3 = driver.findElement(By.id("optionsRadios3"));
    	   if (objectPushbuttonSparqlQueryAllResultsRadio3.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonTabManageData.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonSparqlQueryAllResultsRadio3.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   
	   //objectPushbuttonSparqlQueryAllResultsRadio3.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(id = "outputFormat") public WebElement objectComboSparqlQueryOutputFormat;
public WebDriver objectComboSparqlQueryOutputFormat_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectComboSparqlQueryOutputFormat = driver.findElement(By.id("outputFormat"));
    	   if (objectComboSparqlQueryOutputFormat.isDisplayed()) {
    		   Point sLocationXY = objectComboSparqlQueryOutputFormat.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectComboSparqlQueryOutputFormat.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectComboSparqlQueryOutputFormat.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

public WebDriver objectComboSparqlQueryOutputFormatXML_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonTabDashboard = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/ul/li[2]/a"));
    	   if (objectPushbuttonTabDashboard.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonTabManageData.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonTabDashboard.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   FunctionsLibrary.functionWaitForAnObject (2);
	   
	   //objectComboSparqlQueryOutputFormatXML.clear ();
	   //objectComboSparqlQueryOutputFormatXML.sendKeys("XML");
	   
	   //objectComboSparqlQueryOutputFormat.clear();
	   //objectComboSparqlQueryOutputFormat.sendKeys("XML");
	   
	   //Selecting entry "XML" in combo by using arrow keys
	   objectComboSparqlQueryOutputFormat.sendKeys(Keys.ARROW_DOWN);
	   objectComboSparqlQueryOutputFormat.sendKeys(Keys.ENTER);
	   FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}

@FindBy(id = "executeQuery") public WebElement objectPushbuttonSparqlQueryExecute;
public WebDriver objectPushbuttonSparqlQueryExecute_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPushbuttonSparqlQueryExecute = driver.findElement(By.id("executeQuery"));
    	   if (objectPushbuttonSparqlQueryExecute.isDisplayed()) {
    		   Point sLocationXY = objectPushbuttonSparqlQueryExecute.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectPushbuttonSparqlQueryExecute.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectPushbuttonSparqlQueryExecute.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}

@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]") public WebElement objectTextfieldSparqlQueryNew;
public WebDriver objectTextfieldSparqlQueryNew_click (String sQuery, long lTimeOutSeconds){
	   //sQuery = "baba chacha";
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   String sCommandPart1 = "window.editor.setValue(\'";
       String sCommandPart2 =  "\');";	   
       String sCommand = sCommandPart1 + sQuery + sCommandPart2;
    	
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectTextfieldSparqlQueryNew = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]"));
    	   if (objectTextfieldSparqlQueryNew.isDisplayed()) {
    		   Point sLocationXY = objectTextfieldSparqlQueryNew.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   //Textfield is developed using CodeMirror so you can enter data only by using Javascript Executor
    		   
    		   WebElement elementCodeMirrorTextField = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]"));
    	       JavascriptExecutor executor = (JavascriptExecutor)driver;
    	       executor.executeScript("arguments[0].click();", elementCodeMirrorTextField);
    	       //executor.executeScript("window.editor.setValue(\'Shaafi - This is Sparql Query\');", elementCodeMirrorTextField);
    	       executor.executeScript(sCommand, elementCodeMirrorTextField);
    	       
    	       
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   
/*
	   FunctionsLibrary.functionWaitForAnObject (2);
	   //objectTextfieldSparqlQueryNew.click();
	   
	   System.out.println ("Sparql Query text-field existing contents: "+ objectTextfieldSparqlQueryNew.getText());
       System.out.println ("Sparql Query text-field number of characters: "+ objectTextfieldSparqlQueryNew.getText().length());
       objectTextfieldSparqlQueryNew.sendKeys("New Sparql Query...");	
     
       //@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]") public WebElement objectTextfieldSparqlQueryNew;
       
       WebElement elementCodeMirrorTextField = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]"));
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", elementCodeMirrorTextField);
       //executor.executeScript("window.editor.setValue(\'Shaafi - This is Sparql Query\');", elementCodeMirrorTextField);
       
       //String sQuery = "Shaafi - This is Sparql Query";
       String sCommandPart1 = "window.editor.setValue(\'";
       //String sQueryy = "Shaafi - This is Sparql Query";
       String sCommandPart2 =  "\');";	   
       String sCommand = sCommandPart1 + sQuery + sCommandPart2;
    		   
       //String sCommand = "window.editor.setValue(\'Shaafi - This is Sparql Query\');";
       executor.executeScript(sCommand, elementCodeMirrorTextField);
       
       
       //System.out.println(executor.executeScript("return document.title"));
	   FunctionsLibrary.functionWaitForAnObject (2);
	   */
	   return driver;
}

@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/label/select/option[4]") public WebElement objectComboSparqlQueryRecordsPerPage100;
public WebDriver objectComboSparqlQueryRecordsPerPage100_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectComboSparqlQueryRecordsPerPage100 = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/label/select/option[4]"));
    	   if (objectComboSparqlQueryRecordsPerPage100.isDisplayed()) {
    		   Point sLocationXY = objectComboSparqlQueryRecordsPerPage100.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectComboSparqlQueryRecordsPerPage100.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //objectComboSparqlQueryRecordsPerPage100.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
	   return driver;
}

@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/label/select") public WebElement objectComboSparqlQueryRecordsPerPage;
public WebDriver objectComboSparqlQueryRecordsPerPage_click (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectComboSparqlQueryRecordsPerPage = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/label/select"));
    	   if (objectComboSparqlQueryRecordsPerPage.isDisplayed()) {
    		   Point sLocationXY = objectComboSparqlQueryRecordsPerPage.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
    		   objectComboSparqlQueryRecordsPerPage.click ();
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //boolean bIsDisplayed = objectComboSparqlQueryRecordsPerPage.findElement(null).isDisplayed();
	   //String sTag = objectComboSparqlQueryRecordsPerPage.getTagName();
	   
	   //System.out.println ("sTag " + sTag);
	   
	   
	   //System.out.println ("[" + this.getClass().getSimpleName() + "] objectComboSparqlQueryRecordsPerPage Tag? "+sTag);
	   //objectComboSparqlQueryRecordsPerPage.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}



@FindBy(id = "result") public WebElement objectPanelSparqlQueryBrowserResults;
public WebDriver objectPanelSparqlQueryBrowserResults_exists (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPanelSparqlQueryBrowserResults = driver.findElement(By.id("result"));
    	   if (objectPanelSparqlQueryBrowserResults.isDisplayed()) {
    		   Point sLocationXY = objectPanelSparqlQueryBrowserResults.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
	     	   objectPanelSparqlQueryBrowserResults.getText();
	     		System.out.println("\n[" + this.getClass().getSimpleName() + "] TEST RESULTS:");
		    	System.out.println("========================================================");
		    String sTestResults = objectPanelSparqlQueryBrowserResults.getText();
		    System.out.println(sTestResults);
 		   
		    
	             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //boolean bIsDisplayed = objectComboSparqlQueryRecordsPerPage.findElement(null).isDisplayed();
	   //String sTag = objectComboSparqlQueryRecordsPerPage.getTagName();
	   
	   //System.out.println ("sTag " + sTag);
	   
	   
	   //System.out.println ("[" + this.getClass().getSimpleName() + "] objectComboSparqlQueryRecordsPerPage Tag? "+sTag);
	   //objectComboSparqlQueryRecordsPerPage.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}





/**************************************************************************************************
*                                         TESTCASE VALIDATIONS                                    *
**************************************************************************************************/


public WebDriver methodVerify_Testcase001SparqlQueryTest_browserresults (long lTimeOutSeconds){
	   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	   PageFactory.initElements(driver, this);
	   
	   
	   long lEndTime = System.currentTimeMillis() + lTimeOutSeconds;
       long lStartTime = System.currentTimeMillis();
	   long lTimeTakenToDisplayobject;
	   lTimeOutSeconds = lTimeOutSeconds * 1000; //Seconds to Milli Seconds conversion
	   
	   while (System.currentTimeMillis() < lEndTime) {
		   objectPanelSparqlQueryBrowserResults = driver.findElement(By.id("result"));
    	   if (objectPanelSparqlQueryBrowserResults.isDisplayed()) {
    		   Point sLocationXY = objectPanelSparqlQueryBrowserResults.getLocation();
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.focus();");
	     	    ((JavascriptExecutor)driver).executeScript("javascript:window.scrollTo "+sLocationXY);
	    	   		
	     	   objectPanelSparqlQueryBrowserResults.getText();
	     		System.out.println("\n[" + this.getClass().getSimpleName() + "] TEST RESULTS:");
		    	System.out.println("========================================================");
		    String sTestResults = objectPanelSparqlQueryBrowserResults.getText();
		    System.out.println(sTestResults);
 		   
		    
		    if (sTestResults.contains ("SPARQL Query Exception")){
	     	   System.out.println("[" + this.getClass().getSimpleName() + "] SPAQRL Query is taking long time to execute!!!");
		    }
		    
		    System.out.println("\n[" + this.getClass().getSimpleName() + "] BASELINE DATA:");
		    System.out.println("========================================================");
	    		String sBaseline = "<http://www.Department0.University0.edu/GraduateStudent124>" + "\n" +
		               	   "<http://www.Department0.University0.edu/GraduateStudent142>" + "\n" +
			               "<http://www.Department0.University0.edu/GraduateStudent44>" + "\n" +
			               "<http://www.Department0.University0.edu/GraduateStudent101>";
	    		System.out.println(sBaseline);
	    		
	    		String sTestResult1 = "<http://www.Department0.University0.edu/GraduateStudent44>";
	    		String sTestResult2 = "<http://www.Department0.University0.edu/GraduateStudent101>";
	    		String sTestResult3 = "<http://www.Department0.University0.edu/GraduateStudent124>";
	    		String sTestResult4 = "<http://www.Department0.University0.edu/GraduateStudent42>";
	    		
	    		//Validation 1:
	    		if (sTestResults.contains(sTestResult1) == true){System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 1 - Pass");
		    	}else {System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 1 - Fail");}

	    		//Validation 2:
	    		if (sTestResults.contains(sTestResult2) == true){System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 2 - Pass");
		    	}else {System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 2 - Fail");}

	    		//Validation 3:
	    		if (sTestResults.contains(sTestResult3) == true){System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 3 - Pass");
		    	}else {System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 3 - Fail");}

	    		//Validation 4:
	    		if (sTestResults.contains(sTestResult4) == true){System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 4 - Pass");
		    	}else {System.out.println("[" + this.getClass().getSimpleName() + "] " + "VALIDATION: Browser Results 4 - Fail");}

	    	
	    	
    		   lTimeTakenToDisplayobject = System.currentTimeMillis() - lStartTime;
    		   System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - An object found as expected at location: "+sLocationXY);
  	   	     System.out.println("[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " () - Time taken to display an object: " +lTimeTakenToDisplayobject+" Milli-Seconds");
             
    		   try {
    	           Thread.sleep(2000);} 
    		   catch (InterruptedException e) {
    	           e.printStackTrace();  
    	       }
    	break;
           }
   	    }
	   

	   //FunctionsLibrary.functionWaitForAnObject (2);
	   //boolean bIsDisplayed = objectComboSparqlQueryRecordsPerPage.findElement(null).isDisplayed();
	   //String sTag = objectComboSparqlQueryRecordsPerPage.getTagName();
	   
	   //System.out.println ("sTag " + sTag);
	   
	   
	   //System.out.println ("[" + this.getClass().getSimpleName() + "] objectComboSparqlQueryRecordsPerPage Tag? "+sTag);
	   //objectComboSparqlQueryRecordsPerPage.click();
	   //FunctionsLibrary.functionWaitForAnObject (2);
return driver;
}



/**************************************************************************************************
*                                         QUERY HISTORY                                            *
**************************************************************************************************/

@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/label/input") public WebElement objectTextField_Search;
public void TextField_Search_EnterData (String sImportedFileName){
        //System.out.println("@PageObjects_Urika: objectTextField_Search ()");
        objectTextField_Search.sendKeys(sImportedFileName);
}//method end

@FindBy(id = "filterDB") public WebElement objectTextField_Database;
public void DropdownField_Filter_Database (String sDatabaseid){
    objectTextField_Database.sendKeys(sDatabaseid);
}//method end	

@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[5]/a[2]/i") public WebElement objectPushButton_Delete;
public void PushButton_Delete_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Delete_Click ()");
        objectPushButton_Delete.click();
}//method end

@FindBy(xpath = "/html/body/div[3]/div[2]/a") public WebElement objectPushButton_DeleteOk;
public void PushButton_DeleteOk_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_DeleteOk_Click ()");
        objectPushButton_DeleteOk.click();
}//method end

@FindBy(id = "freeTextSearch") public WebElement objectTextField_FreeTextSearch;  
public void TextField_Freetext_Search (String sSearchText){
        objectTextField_FreeTextSearch.sendKeys(sSearchText);
}//method end

@FindBy(xpath = ".//*[@id='content']/div[2]/div/div[1]/span/button") public WebElement objectPushButton_Searchbutton;
public void PushButton_Search_Click (){
        objectPushButton_Searchbutton.click();
}//method end

@FindBy(id = "searchSettings") public WebElement objectPushButton_Filterbutton;
public void PushButton_Filter_Click (){
        objectPushButton_Filterbutton.click();
}//method end

@FindBy(id = "filterUser") public WebElement objectDropdownField_ExecutedBy;
public void DropdownField_Filter_Executedby (String sExecutedby){
    	objectDropdownField_ExecutedBy.sendKeys(sExecutedby);
}//method end	

@FindBy(id= "rangeA") public WebElement objectTextField_Executedon;
public void TextField_Filter_Executedon (String sExecutedon1){
        objectTextField_Executedon.sendKeys(sExecutedon1);
    }//method end

@FindBy(id = "filterStatus") public WebElement objectTextField_Status;
public void DropdownField_Filter_Status (String sStatus){
        objectTextField_Status.sendKeys(sStatus);
}//method end	

@FindBy(id = "filterType") public WebElement objectTextField_QueryType;
public void DropdownField_Filter_QueryType (String sQueryType){
        objectTextField_QueryType.sendKeys(sQueryType);
}//method end	

@FindBy(id = "reset") public WebElement objectPushButton_Resetbutton;
public void PushButton_Reset_Click (){
        objectPushButton_Resetbutton.click();
}//method end

@FindBy(xpath = ".//*[@id='prev']/a") public WebElement objectPushButton_Previousbutton;
public void PushButton_Previousbutton_Click (){
        objectPushButton_Previousbutton.click();
    }//method end

@FindBy(xpath = ".//*[@id='next']/a") public WebElement objectPushButton_Nextbutton;
public void PushButton_Nextbutton_Click (){
    	objectPushButton_Nextbutton.click();
}//method end
  
@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/div/button") public WebElement objectPushButton_New;
public void objectPushButton_New_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectPushButton_New.click();
    	
    	//objectTextField_SPARQLQuery.sendKeys(sQuery);
    }//method end
    
public void objectPushButton_SPARQLQueryClearResults_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	//objectPushButton_SPARQLQueryClearResults.click();
    }//method end
    
public void objectPushButton_NewDatabase_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	//objectPushButton_NewDatabase.click();
}//method end
    
public void objectTextField_SearchDatabase_Enter (String sDatabaseName){
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	//objectTextField_SearchDatabase.sendKeys(sDatabaseName);
    	
        //objectPushButton_SignIn.click();
    }//method end
    
public void objectPushButton_ApplyStart_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	//objectPushButton_ApplyStart.click();
    	
    	
        //objectPushButton_SignIn.click();
}//method end

public void objectPushButton_ImportDataOperation_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	//objectPushButton_ImportData_Cancel.click();
    	
    	
        //objectPushButton_SignIn.click();
}//method end
    
@FindBy(id = "dbHeaderButton") public WebElement objectPushButton_DatabaseConnected;
public void objectPushButton_DatabaseConnected_YesNo (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	String sDBConnected = objectPushButton_DatabaseConnected.getText();
    	System.out.println ("Database Connected? "+sDBConnected);
    	
        //objectPushButton_SignIn.click();
    }//method end

/*
public WebDriver methodLoginUrika (String sUsername, String sPassword)
    {
        System.out.println("@MethodsLibrary: methodLoginUrika ()");
       
        FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

        ObjectsLibrary.TextField_Username_EnterData(sUsername);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_Password_EnterData(sPassword);
        FunctionsLibrary.functionWaitForAnObject (2);

        ObjectsLibrary.PushButton_SignIn_Click();
        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;

    }//End Method
//********************************************************************************************************************
  */

public WebDriver methodSelectTabManageData ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
            
        FunctionsLibrary.functionWaitForAnObject (2);
        //PushButton_ManageData_Click ();

        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }

public WebDriver methodSelectTabDashboard ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSelectTabDashboard ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        //ObjectsLibrary.PushButton_Dashboard_Click ();
        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }

public WebDriver methodSearchDataFile (String sImportedFileName)
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodSearchDataFile ()");
        FunctionsLibrary.functionWaitForAnObject (5);

        //ObjectsLibrary.TextField_Search_EnterData (sImportedFileName);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return driver;

    }//End Method

public WebDriver methodDeleteDataFile ()
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodDeleteDataFile ()");
        //ObjectsLibrary.PushButton_Delete_Click();
        FunctionsLibrary.functionWaitForAnObject (2);

        //ObjectsLibrary.PushButton_DeleteOk_Click();
        FunctionsLibrary.functionWaitForAnObject (2);

        return driver;

    }//End Method

public WebDriver methodAddLocalDataFile (String sFileLocation)
    {	
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
        System.out.println("@MethodsLibrary: methodAddLocalDataFile ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        //ObjectsLibrary.PushButton_AddData_Click();
        FunctionsLibrary.functionWaitForAnObject (1);

        //ObjectsLibrary.TextField_LocalFile_EnterData(sFileLocation);
        //FunctionsLibrary.functionWaitForAnObject (5);


        Date date = new Date();
        Format formatter;
        formatter = new SimpleDateFormat("_yyyyMMMdd_HHmm");
        String s = formatter.format(date);
        String sSmokeTest_DateTime = "AUTOMATION-Artifact";
        //ObjectsLibrary.TextField_NameYourArtifact_EnterData(sSmokeTest_DateTime);
        FunctionsLibrary.functionWaitForAnObject (2);

        //ObjectsLibrary.TextField_Comments_EnterData("TEST - Import database file: lubm0");
        

        //ObjectsLibrary.objectPushButton_ImportDataOperation_Click();
        FunctionsLibrary.functionWaitForAnObject (1);
        return driver;

    }//End Method

public WebDriver methodQuitUrika (){
        System.out.println("@MethodsLibrary: methodQuitUrika ()");
        FunctionsLibrary.functionWaitForAnObject (5);
        driver.quit();

        FunctionsLibrary.functionWaitForAnObject (5);
        return driver;
    }//End Method

public WebDriver methodFreeTextSearch (String sSearchText)
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    //ObjectsLibrary.TextField_Freetext_Search(sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);
    
    //ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}//End Method

public WebDriver methodFreeTextSearch_ExecutedBy (String sSearchText, String sExecutedby)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    //ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.DropdownField_Filter_Executedby(sExecutedby);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}

public WebDriver methodFreeTextSearch_Executedon (String sSearchText, String sExecutedon1)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    //ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.TextField_Filter_Executedon(sExecutedon1);
    FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}}

//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Database
//public WebDriver methodFreeTextSearch_database (String sSearchText, String sDatabaseid)
//{
	//FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    //FunctionsLibrary.functionWaitForAnObject (2);

    //ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    //FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Filter_Click ();
    //FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.DropdownField_Filter_Database(sDatabaseid);
    //FunctionsLibrary.functionWaitForAnObject (5);

    //ObjectsLibrary.PushButton_Search_Click();
    //FunctionsLibrary.functionWaitForAnObject (5);

    //return driver;
//}
//************************************************************************************************************************************************
/*

// This method is used to do search using search text in combination of Status
public WebDriver methodFreeTextSearch_Status (String sSearchText, String sStatus)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Status(sStatus);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************
// This method is used to do search using search text in combination of Status
public WebDriver methodFreeTextSearch_QueryType (String sSearchText, String sQueryType)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search (sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_QueryType(sQueryType);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);

    return driver;
}
//************************************************************************************************************************************************    
// This method is used to do search using search text in combination of Executedby, Executedon, Status, databaseid, querytype
public WebDriver methodFreeTextSearch_Complete_Filter (String sSearchText, String sExecutedby, String sExecutedon1, String sDatabaseid, String sStatus, String sQueryType)
{
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
   
    FunctionsLibrary.functionWaitForAnObject (2);

    ObjectsLibrary.TextField_Freetext_Search(sSearchText);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Filter_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Executedby(sExecutedby);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.TextField_Filter_Executedon(sExecutedon1);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Database(sDatabaseid);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_Status(sStatus);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.DropdownField_Filter_QueryType(sQueryType);
    FunctionsLibrary.functionWaitForAnObject (5);

    ObjectsLibrary.PushButton_Search_Click();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
    
//************************************************************************************************************************************************
    // This method is used to check the reset button works
    public WebDriver methodFreeTextSearch_reset_Filter (String sSearchText, String sExecutedby, String sExecutedon1, String sDatabaseid, String sStatus, String sQueryType)
    {
    	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
       
        FunctionsLibrary.functionWaitForAnObject (2);

        ObjectsLibrary.TextField_Freetext_Search(sSearchText);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.PushButton_Filter_Click ();
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_Executedby(sExecutedby);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.TextField_Filter_Executedon(sExecutedon1);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_Database(sDatabaseid);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_Status(sStatus);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.DropdownField_Filter_QueryType(sQueryType);
        FunctionsLibrary.functionWaitForAnObject (5);

        ObjectsLibrary.PushButton_Reset_Click();
        FunctionsLibrary.functionWaitForAnObject (5);
        
        return driver;
    }
//************************************************************************************************************************************************
    
public WebDriver methodSelectTabSPARQLQuery (){



	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabSPARQLQuery ()");
        
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_SPARQLQuery_Click ();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}
//********************************************************************************************************************



public WebDriver methodSPARQLEnterQuery (String sQuery)
{
    System.out.println("@MethodsLibrary: methodLoginUrika ()");
   
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

    ObjectsLibrary.objectPushButton_New_Click ();
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectTextField_SPARQLQuery_EnterText(sQuery);
    FunctionsLibrary.functionWaitForAnObject (5);

    
    return driver;

}//End Method
//********************************************************************************************************************

public WebDriver methodSPARQLQueryClearResultClick ()
{
    System.out.println("@MethodsLibrary: methodLoginUrika ()");
   
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

    
    ObjectsLibrary.objectPushButton_SPARQLQueryClearResults.click();
    FunctionsLibrary.functionWaitForAnObject (5);

    
    return driver;

}//End Method
//********************************************************************************************************************



public WebDriver methodSPARQLQueryClearTextBox ()
{
    System.out.println("@MethodsLibrary: methodLoginUrika ()");
   
    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    //ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);

    
    ObjectsLibrary.objectTextField_SPARQLQuery_ClearText();
    FunctionsLibrary.functionWaitForAnObject (5);

    
    return driver;

}//End Method
//********************************************************************************************************************


public WebDriver methodSelectTabManageDatabases ()
   {	
   	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
       ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
       System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
           
       FunctionsLibrary.functionWaitForAnObject (2);
       ObjectsLibrary.PushButton_ManageDatabases_Click ();

       FunctionsLibrary.functionWaitForAnObject (5);
       return driver;
   }
//********************************************************************************************************************



public WebDriver methodClickNewDatabase ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
        
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_NewDatabase_Click ();

    FunctionsLibrary.functionWaitForAnObject (5);
    return driver;
}
//********************************************************************************************************************



//********************************************************************************************************************



public WebDriver methodAddDataClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    
    		
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.PushButton_AddDataButton_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************************************************************************************************************



public WebDriver methodSearchDatabaseName ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    String sDatabaseName = "AUTOMATION"; 
    		
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectTextField_SearchDatabase_Enter (sDatabaseName);
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************************************************************************************************************




public WebDriver methodCheckDatabase ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectCheckbox_Database_Check ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************



public WebDriver methodClickPushButtonSubmit ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_Database_Submit ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************





public WebDriver methodPushButtonApplyStartClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_ApplyStart_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************





public WebDriver methodPushButtonApplyStartConfirmClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_ApplyStartConfirm_Click ();
    FunctionsLibrary.functionWaitForAnObject (5);
    
    return driver;
}
//********************




public WebDriver methodPushButtonImportDataOperationClick ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (1);
    ObjectsLibrary.objectPushButton_ImportDataOperation_Click () ;
    
    
    return driver;
}
//********************




public WebDriver methodVerifyDatabaseConnected ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_DatabaseConnected_YesNo () ;
    FunctionsLibrary.functionWaitForAnObject (5);
    
    
    return driver;
}
//********************




public WebDriver methodDatabaseStop ()
{	
	FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
    ObjectsLibrary  ObjectsLibrary = PageFactory.initElements(driver, ObjectsLibrary.class);
    System.out.println("@MethodsLibrary: methodSelectTabManageData ()");
    
    
    FunctionsLibrary.functionWaitForAnObject (2);
    ObjectsLibrary.objectPushButton_DatabaseStop_Click () ;
    FunctionsLibrary.functionWaitForAnObject (15);
    
    
    return driver;
}


}//End Class

*/