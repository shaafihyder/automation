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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.util.Properties;
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
        	System.out.println ("@FunctionsLibrary: functionReadDataLibraryProperties () - Unable to read DataLibrary.properties");
        }
        return sValue;
    }
//********************************************************************************************************************
    
public static void functionWaitForAnObject (int iTimeOutInSeconds){

        int iSeconds = (iTimeOutInSeconds * 1000);
        try {
            Thread.sleep(iSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
//********************************************************************************************************************

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
            System.err.println("Error: " + e.getMessage());
        }
        return sReturn;

    }//End Method
//********************************************************************************************************************

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

            System.out.println("@FunctionsLibrary: functionFileCopy - File is copied successfully!");

        }catch(IOException e){
            e.printStackTrace();
        }
    }//End Method
//********************************************************************************************************************

public static void functionEnvDetails ()  {

            System.out.println ("@FunctionsLibrary: functionEnvDetails - MACHINE DETAILS:");
            System.out.println("@FunctionsLibrary: functionEnvDetails - User's account name: "+ System.getProperty ("user.name"));
            System.out.println ("@FunctionsLibrary: functionEnvDetails - OS Name: "+ System.getProperty("os.name"));
            System.out.println ("@FunctionsLibrary: functionEnvDetails - OS Architecture: "+ System.getProperty("os.arch"));
            System.out.println("@FunctionsLibrary: functionEnvDetails - User's current working directory: "+ System.getProperty ("user.dir"));
            System.out.println ("\n\n@FunctionsLibrary: functionEnvDetails -JAVA DETAILS:");
            System.out.println ("@FunctionsLibrary: functionEnvDetails - Java Version: "+ System.getProperty("java.version"));
            System.out.println ("@FunctionsLibrary: functionEnvDetails - Java Installation directory: "+ System.getProperty("java.home"));
            System.out.println ("@FunctionsLibrary: functionEnvDetails - Java Classpath: "+ System.getProperty("java.class.path"));
            System.out.println ("@FunctionsLibrary: functionEnvDetails - List of paths to search when loading libraries: "+ System.getProperty("java.library.path"));
            System.out.println ("@FunctionsLibrary: functionEnvDetails - Default temp file path: "+ System.getProperty("java.io.tmpdir"));
            System.out.println ("@FunctionsLibrary: functionEnvDetails - Path of extension directory or directories: "+ System.getProperty("java.ext.dirs"));
            System.out.println("@FunctionsLibrary: functionEnvDetails - System environmental variables: "+System.getenv().get("Path"));
            String envVar =  System.getenv().get("Path");
            System.out.println("\n\n@FunctionsLibrary: functionEnvDetails - ENVIRONMENTAL DETAILS:");
            Map map = System.getenv();
            Set keys = map.keySet();
            Iterator iterator = keys.iterator();

            while (iterator.hasNext()){
                String key = (String) iterator.next();
                String value = (String) map.get(key);
                System.out.println(key + " " + value);
            }
    }
//********************************************************************************************************************

public static String functionWhatOS ()  {

        String sOS = System.getProperty("os.name");
        //System.out.println ("OS Name: "+ System.getProperty("os.name"));
        	if (sOS.contains("Windows 7"))
        		System.out.println("@FunctionsLibrary: functionWhatOS () - Windows 7");
        	else if (sOS.contains("Windows XP"))
        		System.out.println("@FunctionsLibrary: functionWhatOS () - Windows XP");
        	else if (sOS.contains("Linux"))
        		System.out.println("@FunctionsLibrary: functionWhatOS () - Linux");
        	else if (sOS.contains("Mac"))
        		System.out.println("@FunctionsLibrary: functionWhatOS () - Macintosh OS X");
        	else 
        		System.out.println("@FunctionsLibrary: functionWhatOS () - Unable to detect OS type");
	    
        return sOS;

        }
//********************************************************************************************************************    
    
public static String functionWhichFileForFileImport (){
        System.out.println("@FunctionsLibrary: functionWhichFileForFileImport ()");
        
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
		System.out.println("@FunctionsLibrary: functionWhichFileForFileImport () - Unable to detect OS type");}
        
       return sFileImport;
	}
//********************************************************************************************************************    
    
public static String functionFolderToBeClean (){
        System.out.println("@FunctionsLibrary: functionFolderToBeClean ()");
        
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
		System.out.println("@FunctionsLibrary: functionFolderToBeClean () - Unable to detect OS type");}
        
       System.out.println("@FunctionsLibrary: functionFolderToBeClean () "+sFolderToBeClean);
       return sFolderToBeClean;
    }
//********************************************************************************************************************
  
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
//********************************************************************************************************************

public static String functionGetDirSeprator ()  {
    	String sDirSeparator = null;
    	String sWinDirSeparator = "\\";
        String sLinuxDirSeparator = "/";
        
        String sOS = System.getProperty("os.name");
        //System.out.println ("OS Name: "+ System.getProperty("os.name"));
        	if (sOS.contains("7")){
        		sDirSeparator = sWinDirSeparator;
        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Windows 7 & Directory separator is:"+ sDirSeparator);}
        	else if (sOS.contains("XP")){
        		sDirSeparator = sWinDirSeparator;
        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Windows XP & Directory separator is:"+ sDirSeparator);}
        	else if (sOS.contains("nix")){
        		sDirSeparator = sLinuxDirSeparator;
        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Linux & Directory separator is:"+ sDirSeparator);}
        	else if (sOS.contains("Mac")){
        		sDirSeparator = sLinuxDirSeparator;
        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - OS type Macintosh & Directory separator is:"+ sDirSeparator);}
        	else 
        		System.out.println("@FunctionsLibrary: functionGetDirSeprator - Unable to detect OS type & Directory separator type :(");
	    
        return sDirSeparator;

        }
//********************************************************************************************************************
 
public static void functionDeleteAllFilesOfFolder (String sFolderName){

        File directory = new File (sFolderName);

        //Get all files in folder
        File[] files = directory.listFiles();
        for (File file : files){
            //Delete each file
        	if (!file.isDirectory()){
        		if (!file.delete()){
        			System.out.println ("@FunctionsLibrary: functionDeleteAllFilesOfFolder () - Failed to delete "+file);
        		}
            }
        }

    }
//********************************************************************************************************************
/*
public static void functionSendEmail (String sTo){
	    
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

}//End Class