/**********************************************
 * 
 * @author SHAAFI HYDER
 * @email  ShaafiHyder@gmail.com
 * @skype  ShaafiHyder
 * @phone  +1 925-9843999
 * @date   April 20th, 2013
 * 
 ***********************************************/



package com.project.automated.framework.libraries;
import java.io.*;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.logging.Logger;
public interface GlobalsLibrary {

	    String shaafiGlobalLibraryTest = "GlobalLibrary successfully connected";
	    
	    //Connect to related files...
	    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
	    MethodsLibrary MethodsLibrary = new MethodsLibrary ();
	    
	    String sFileSeparator = System.getProperty("file.separator");//FunctionsLibrary.functionFileSeparator (); // '/' Linux or '\\' Windows
		String sPathUserDir = System.getProperty ("user.dir"); // /Users/shyder/Desktop/automation/workspaces/framework
		String sPathSrcMainJava = "src" + sFileSeparator + "main" + sFileSeparator + "java";
		String sPathSrcTestJava = "src" + sFileSeparator + "test" + sFileSeparator + "java";
		String sPathPackage = "com" + sFileSeparator + "project" + sFileSeparator + "automated" + sFileSeparator + "framework";
		
		static public final String OS_NAME =  System.getProperty("os.name");
		static public final String FILE_SEPARATOR =  System.getProperty("file.separator");
		static public final String OS_ARCHITECTURE =  System.getProperty("os.arch");
		static public final String USER_NAME =  System.getProperty("user.name");
		static public final String HOME_JAVA = System.getProperty ("java.home");
		static public final String JAVA_VERSION = System.getProperty ("java.version");
		static public final String HOME_JAVA_CLASSPATH = System.getProperty ("java.class.path");
		static public final String HOME_USER_DIR = System.getProperty ("user.dir"); // ... directory where code is been placed in
		static public final String HOME_LIBRARIES = sPathSrcMainJava + sFileSeparator + sPathPackage + sFileSeparator + "libraries";
		static public final String HOME_SUPERCLASSES = sPathSrcMainJava + sFileSeparator + sPathPackage + sFileSeparator + "superclasses";
		static public final String HOME_TEST_SUITE = sPathSrcTestJava + sFileSeparator + sPathPackage;
		static public final String HOME_RESOURCES = "src" + sFileSeparator + "test" + sFileSeparator + "resources";
		static public final String HOME_GLOBALSCONSTANTS = "src" + sFileSeparator + "test" + sFileSeparator + "resources" + sFileSeparator + "GlobalsConstants.xml";
		static public final String HOME_LOGS_DIR = sPathUserDir + sFileSeparator + "logs";
	    static public final String BROWSER_TYPE  = FunctionsLibrary.functionReadDataLibraryXML(HOME_GLOBALSCONSTANTS, "BROWSER_FIREFOX");
	    static public final String APP_USERNAME  = FunctionsLibrary.functionReadDataLibraryXML(HOME_GLOBALSCONSTANTS, "APP_USERNAME");
	    static public final String APP_PASSWORD  = FunctionsLibrary.functionReadDataLibraryXML(HOME_GLOBALSCONSTANTS, "APP_PASSWORD");
	    static public final String EMAIL_SENDTO = FunctionsLibrary.functionReadDataLibraryXML(HOME_GLOBALSCONSTANTS, "EMAIL_SENDTO");
	    static public final String URIKA_MACHINE = "http://comet1";
	    static public final String URIKA_MACHINE_EC2 = "https://ec2-174-129-39-132.compute-1.amazonaws.com/urika/gam";
	    static public final long TIME_OUT = 5;
	    //static public final String SLASH = FunctionsLibrary.functionGetDirSeprator ();
	    
	    //TEST SUITE PROPERTIES DECLARATION
	    static public final String HOME_SPARQLQUERY_PROPS = GlobalsLibrary.HOME_RESOURCES + sFileSeparator + "sparqlquery" + sFileSeparator + "sparqlquery.properties";
	    static public final String HOME_BUILDDATABASE_PROPS = GlobalsLibrary.HOME_RESOURCES + sFileSeparator + "builddatabases" + sFileSeparator + "builddatabases.properties";
		
}