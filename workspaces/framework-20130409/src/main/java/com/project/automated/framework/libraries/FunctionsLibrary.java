package com.project.automated.framework.libraries;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.io.*;
import javax.imageio.ImageIO;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.InvalidPropertiesFormatException;
import java.util.Properties;


public class FunctionsLibrary
{
    // Uncomment main and call a function to test it's working
    // public static void main(String[] args){

        //DeleteAllFilesOfFolder ("C:/temp/");
        //WaitForAnObject (19);
    //}

    // Here are list of functions which can be called anywhere. How? See below
    // In class first of all import FunctionsLibrary.Functions_Urika;
    // FunctionsLibrary.Functions_Urika FunctionsLibrary = new Functions_Urika();
    // FunctionsLibrary.DeleteAllFilesOfFolder ("C:/temp/");

//********************************************************************************************************************	
public static String functionReadDataLibraryXML (String sFile, String sKey){
	
	
	System.out.println ("shaafi functionreaddatalibraryxml "+sFile);

	
	
	
	String sReturn = null;
	java.util.Properties prop = new Properties();
	try {
		prop.loadFromXML(new FileInputStream(sFile));
	//} catch (InvalidPropertiesFormatException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	sReturn = prop.getProperty(sKey);
		
	
	return sReturn;
	
}
public static String functionReadDataLibraryProperties (String sFile, String sVariable){
    	String sValue=null;
    	Properties prop = new Properties();
        try {
                prop.load(new FileInputStream(sFile));
                sValue = prop.getProperty(sVariable);
                //sValue = prop.
                //System.out.println("@functionReadDataLibraryProperties " + sVariable +" = "+ sValue);
        } catch (Exception e) {
        	//System.out.println ("@FunctionsLibrary: functionReadDataLibraryProperties () - Unable to read DataLibrary.properties");
        }
        return sValue;
    }
public static void functionWaitForAnObject (int iTimeOutInSeconds){

        int iSeconds = (iTimeOutInSeconds * 1000);
        try {
            Thread.sleep(iSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
public static String functionReadXMLData (String sReport, String sNodeString){

        String sReturn = "Invalid";
        try{
            FileInputStream fstream = new FileInputStream(sReport);
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                //System.out.println (strLine);

                if (strLine.contains(sNodeString)){
                    //String sWithoutWhiteSpaces = strLine.trim();
                    //System.out.println (strLine);
                    int position = strLine.indexOf (">");
                    //System.out.println ("position:  "+position);
                    String temp = strLine.substring(position+1, strLine.length());
                    //System.out.println ("***  "+temp);
                    position = temp.indexOf ("</");
                    temp = temp.substring(0, position);
                    return temp;
                }
            }
            in.close();
        }
        catch (Exception e){//Catch exception if any
            //System.err.println("Error: " + e.getMessage());
        }
        return sReturn;

    }//End Method
public static void functionFileCopy (String sSource, String sDest) {
        InputStream inStream = null;
        OutputStream outStream = null;

        try{

            File afile = new File(sSource);
            File bfile = new File(sDest);

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0){

                outStream.write(buffer, 0, length);
            }

            inStream.close();
            outStream.close();

            //System.out.println("@FunctionsLibrary: functionFileCopy - File is copied successfully!");

        }catch(IOException e){
            e.printStackTrace();
        }
    }//End Method
public static void functionEnvDetails ()  {
			System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - MACHINE DETAILS:");
            
            System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () -  User's account name: "+ System.getProperty ("user.name"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - OS Name: "+ System.getProperty("os.name"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - OS Architecture: "+ System.getProperty("os.arch"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Users current working directory: "+ System.getProperty ("user.dir"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - JAVA DETAILS:");
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Java Version: "+ System.getProperty("java.version"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Java Installation directory: "+ System.getProperty("java.home"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Java Classpath: "+ System.getProperty("java.class.path"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - List of paths to search when loading libraries: "+ System.getProperty("java.library.path"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Default temp file path: "+ System.getProperty("java.io.tmpdir"));
            System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Path of extension directory or directories: "+ System.getProperty("java.ext.dirs"));
            System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - System environmental variables: "+System.getenv().get("Path"));
            String envVar =  System.getenv().get("Path");
            System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - ENVIRONMENTAL DETAILS:");
            Map map = System.getenv();
            Set keys = map.keySet();
            Iterator iterator = keys.iterator();

            while (iterator.hasNext()){
                String key = (String) iterator.next();
                String value = (String) map.get(key);
                System.out.println(key + " " + value);
            }
    }
public static String functionWhatOS ()  {

        String sOS = System.getProperty("os.name");
        //System.out.println ("OS Name: "+ System.getProperty("os.name"));
        	if (sOS.contains("Windows 7"))
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () -  Windows 7");
        	else if (sOS.contains("Windows XP"))
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Windows XP");
        	else if (sOS.contains("Linux"))
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Linux");
        	else if (sOS.contains("Mac"))
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Macintosh OS X");
        	else 
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Unable to detect OS type");
	    
        return sOS;

        }
public static String functionWhichFileForFileImport (){
        System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () ");
        
        //Connect to related files...
        FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        MethodsLibrary MethodsLibrary = new MethodsLibrary ();
                
        WebDriver driver;
        String sOS = FunctionsLibrary.functionWhatOS();
        String sDirSeparator = FunctionsLibrary.functionGetDirSeprator ();
        
        //Read externally stored data - Pick DataLibrary.properties location from pom.xml
        String sPOMXML = System.getProperty ("user.dir") + sDirSeparator + "pom.xml";
        String sDataFile = FunctionsLibrary.functionReadXMLData(sPOMXML, "project.datalibrary"); //String sDataFile = "C:\\automation\\workspaces\\urikaTest\\automated\\src\\main\\java\\com\\yarcdata\\tests\\automated\\libraries\\DataLibrary.properties";
        String sFileImport = null;
        
        if (sOS.contains("Win")){
        	sFileImport = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseAddLocalDataFileTest.sWindowsFileImport");
        	//MethodsLibrary.methodAddLocalDataFile(sFileImport);
        	}
       else if (sOS.contains("inux")){
			sFileImport = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseAddLocalDataFileTest.sLinuxFileImport");
			//MethodsLibrary.methodAddLocalDataFile(sFileImport);
			}
       else if (sOS.contains("OS X")){
    	    sFileImport = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseAddLocalDataFileTest.sLinuxFileImport");
    	    //MethodsLibrary.methodAddLocalDataFile(sFileImport);
    	    }
	   else {
		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Unable to detect OS type");}
        
       return sFileImport;
	}
public static String functionFolderToBeClean (){
        System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
        
        //Connect to related files...
        FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
        MethodsLibrary MethodsLibrary = new MethodsLibrary ();
                
        WebDriver driver;
        String sOS = FunctionsLibrary.functionWhatOS();
        String sDirSeparator = FunctionsLibrary.functionGetDirSeprator ();
        
        //Read externally stored data - Pick DataLibrary.properties location from pom.xml
        String sPOMXML = System.getProperty ("user.dir") + sDirSeparator + "pom.xml";
        String sDataFile = FunctionsLibrary.functionReadXMLData(sPOMXML, "project.datalibrary"); //String sDataFile = "C:\\automation\\workspaces\\urikaTest\\automated\\src\\main\\java\\com\\yarcdata\\tests\\automated\\libraries\\DataLibrary.properties";
        String sFolderToBeClean = null;
        
        if (sOS.contains("Win")){
        	sFolderToBeClean = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseRemoveScreenshotsTest.sWindowsFolderToBeClean");
        	//MethodsLibrary.methodAddLocalDataFile(sFileImport);
        	}
       else if (sOS.contains("inux")){
    	   sFolderToBeClean = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseRemoveScreenshotsTest.sLinuxFolderToBeClean");
			//MethodsLibrary.methodAddLocalDataFile(sFileImport);
			}
       else if (sOS.contains("OS X")){
    	   sFolderToBeClean = FunctionsLibrary.functionReadDataLibraryProperties (sDataFile,"TestcaseRemoveScreenshotsTest.sLinuxFolderToBeClean");
    	    //MethodsLibrary.methodAddLocalDataFile(sFileImport);
    	    }
	   else {
		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Unable to detect OS type");}
        
       System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - "+sFolderToBeClean);
       return sFolderToBeClean;
    }
public static void functionCaptureStoreScreenshot (String sTestcaseName)  {
    	
        String sOS = System.getProperty("os.name");
        String sDirSeparator = FunctionsLibrary.functionGetDirSeprator ();
        String sJPGname = sTestcaseName + ".jpg";
        //String sPOMXML = System.getProperty ("user.dir") + sDirSeparator +"pom.xml";
        String sStoreScreenshotAt = System.getProperty ("user.dir") + sDirSeparator + "src" + sDirSeparator + "test" + sDirSeparator + "resources" + sDirSeparator + "Screenshots" + sDirSeparator + sJPGname; // src\\test\\resources\\Screenshots
        
        try {
            Robot robot = new Robot();

            // Capture the screen shot of the area of the screen defined by the rectangle
            BufferedImage bi=robot.createScreenCapture(new Rectangle(1690, 1060));
            ImageIO.write(bi, "jpg", new File(sStoreScreenshotAt));  //"C:/Reports/Screenshots/1.jpg"

        } catch (AWTException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
      //Log path of screenshot to the report
        Reporter.log("<img src=\"file:///" + sStoreScreenshotAt + "\" alt=\"\"/><br />");
        Reporter.log("Screenshot captured while executing testcase...", 1);
        
        
        
}
public static String functionGetDirSeprator ()  {
    	String sDirSeparator = null;
    	String sWinDirSeparator = "\\";
        String sLinuxDirSeparator = "/";
        
        String sOS = System.getProperty("os.name");
        //System.out.println ("OS Name: "+ System.getProperty("os.name"));
        	if (sOS.contains("7")){
        		sDirSeparator = sWinDirSeparator;
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - OS type Windows 7 & Directory separator is:"+ sDirSeparator);}
        	else if (sOS.contains("XP")){
        		sDirSeparator = sWinDirSeparator;
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - OS type Windows XP & Directory separator is:"+ sDirSeparator);}
        	else if (sOS.contains("nix")){
        		sDirSeparator = sLinuxDirSeparator;
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - OS type Linux & Directory separator is:"+ sDirSeparator);}
        	else if (sOS.contains("Mac")){
        		sDirSeparator = sLinuxDirSeparator;
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - OS type Macintosh & Directory separator is:"+ sDirSeparator);}
        	else 
        		System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Unable to detect OS type & Directory separator type :(");
	    
        return sDirSeparator;

        }
public static void functionDeleteAllFilesOfFolder (String sFolderName){

        File directory = new File (sFolderName);

        //Get all files in folder
        File[] files = directory.listFiles();
        for (File file : files){
            //Delete each file
        	if (!file.isDirectory()){
        		if (!file.delete()){
        			System.out.println ("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - Failed to delete "+file);
        		}
            }
        }

    }
public static void functionRunDOSCommand (){
	
try {
	Process p=Runtime.getRuntime().exec("cmd /C file:///C://automation//workspaces//framework//test-output//report.bat");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
}
public static void functionSendEmail (String sTo){
	    /*
	    System.out.println ("@FunctionsLibrary: functionSendEmail ()");
    	final String username = "AutomationTestReports@gmail.com";
        final String password = "crayadmin";

        Properties props = new Properties();
        //actual
        //props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");
        
        //new
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");//"587""465");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress ("uRiKA_Test_Automation"));//("from-email@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse (sTo));//("xmt_bat@cray.com"));//("to-email@gmail.com"));
            message.setSubject("Test Automation => URIKA Smoke Test Report");
            //message.setText("\n Latest Smoke Test Report:  file://///automationserver/C$/automation/workspaces/urikaTest/urika-gem-automation/target/surefire-reports/emailable-report.html");
            message.setText("\n Smoke Test Report - Win-7:  http://automationserver:8080/job/urika-gem-automation/ws/target/surefire-reports/emailable-report.html" //);
            		+ "\n       Smoke Test Report - Linux:  http://batmobile:8080/jenkins/view/All/job/urika-gem-automation/ws/target/surefire-reports/emailable-report.html");
                    //+ "\n Host OS: Windows 7"
                    //+ "\n Browser: Firefox 14"// Chrome 21"//Chrome 21" //Firefox 14"
                    //+ "\n Machine: Comet1"
                    //+ "\n\n Report:  file://///JQ7GMS1/C$/Reports/Latest/emailable-report.html"
                    //+ "\n Archive: file://///JQ7GMS1/C$/Reports/Archive/");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    */
//********************************************************************************************************************

}
public static void functionCompareTwoXMLFiles (){
	try 
    { 
		
		
		
    //Process p=Runtime.getRuntime().exec("cmd /c dir"); 
    //String sBaselinexml = "C:\\automation\\workspaces\\framework\\src\\test\\resources\\baseline\\Testcase017SparqlQueryTest.xml";
	//String sBaselinexml = "C:\\Users\\shyder\\Downloads\\all-TESTRESULT.xml";
	//String sTestResult = "C:\\Users\\shyder\\Downloads\\all-BASELINE.xml";
    Process p=Runtime.getRuntime().exec("cmd /c C:\\Users\\shyder\\Downloads\\XMLFileCompare.bat");
    
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

public static void functionReadTextFile (){
	System.out.println("[FunctionsLibrary] " + new Exception().getStackTrace()[0].getMethodName() + " () - File Contents");
	System.out.println("==================================================================");
	
	try{
		  // Open the file that is the first 
		  // command line parameter
		  FileInputStream fstream = new FileInputStream("C:\\Users\\shyder\\Downloads\\AUTOMATION-GAAS-SPARQL-VALIDATION-XML.txt");
		  // Get the object of DataInputStream
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  //Read File Line By Line
		  while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  System.out.println (strLine);
		  }
		  //Close the input stream
		  in.close();
		    }catch (Exception e){//Catch exception if any
		  System.err.println("Error: " + e.getMessage());
		  }
}


public void functionSearchStringInXMLFile (String sFileName, String sSearchString){

	String sFilePath = "C:\\Users\\shyder\\Downloads\\";
	if (System.getProperty("os.name").contains("Win")){
		sFilePath = "C:\\Users\\shyder\\Downloads\\";}
	if (System.getProperty("os.name").contains("Lin")){
		sFilePath = "//users/shyder/downloads/";}
	if (System.getProperty("os.name").contains("Mac")){
		sFilePath = "//users/shyder/downloads/";}

	String sFile = sFilePath + sFileName;
	
	System.out.println (sFile);
	
	System.out.println("\n[" + this.getClass().getSimpleName() + "] " + new Exception().getStackTrace()[0].getMethodName() + " ()");
	
	
	//String sTestResult1 = "GraduateStudent44";
	//String sTestResult2 = "GraduateStudent101";
	//String sTestResult3 = "GraduateStudent124";
	//String sTestResult4 = "GraduateStudent42";
	
		
    try {
    	     Thread.sleep(4000);} 
    catch (InterruptedException e) {
    	           e.printStackTrace();  
    }
	
    boolean bResult = false;
	System.out.println("*** " + this.getClass().getSimpleName() + " :" + new Exception().getStackTrace()[0].getMethodName() + " ()");
    System.out.println("==================================================================");
	
	try{
	
		FileInputStream fstream = new FileInputStream(sFile);  
		DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  //Read File Line By Line
		  while ((strLine = br.readLine()) != null)   {
			  // Print the content on the console
			  System.out.println (strLine);
			  if (strLine.contains(sSearchString)){
				  System.out.println("[" + this.getClass().getSimpleName() + "] VALIDATION - File compare - Pass");
				  bResult = true;
			  }  
			   
		  }
		  //Close the input stream
		  in.close();
		    }catch (Exception e){//Catch exception if any
		  System.err.println("Error: " + e.getMessage());
		  }
	
	if (bResult == false){
		  System.out.println("[" + this.getClass().getSimpleName() + "] VALIDATION - File compare - Fail");
	}
	
   try {
        Thread.sleep(2000);} 
	   catch (InterruptedException e) {
        e.printStackTrace();  	
	   }
	
}

public static String functionsGetLibrariesLocation (){
	// /Users/shyder/Desktop/automation/workspaces/framework/src/main/java/com/project/automated/framework/libraries/DataLibrary.xml

	// UserDir=/Users/shyder/Desktop/automation/workspaces/framework

	String sUserDir = System.getProperty ("user.dir");
	String sWindows = "\\src\\main\\java\\com\\project\\automated\\framework\\libraries";
	String sLinux = "/src/main/java/com/project/automated/framework/libraries/";
	String sLibLocation = null;
	
	//String sFilePath = "C:\\Users\\shyder\\Downloads\\";
	if (System.getProperty("os.name").contains("Win")){
		sLibLocation=sUserDir+sWindows;}
	if (System.getProperty("os.name").contains("Lin")){
		sLibLocation=sUserDir+sLinux;}
	if (System.getProperty("os.name").contains("Mac")){
		sLibLocation=sUserDir+sLinux;}
	System.out.println ("shaafi: "+sLibLocation);
return sLibLocation;
}



}//End Class