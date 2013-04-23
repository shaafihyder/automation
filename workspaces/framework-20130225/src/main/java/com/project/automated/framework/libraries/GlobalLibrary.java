package com.project.automated.framework.libraries;
import java.io.*;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
public interface GlobalLibrary {

	    String shaafiGlobalLibraryTest = "GlobalLibrary successfully connected";
	    
	    //Connect to related files...
	    FunctionsLibrary FunctionsLibrary = new FunctionsLibrary ();
	    MethodsLibrary MethodsLibrary = new MethodsLibrary ();
	    
	    //Global Constant Variable Declaration
	    static public final String SLASH = FunctionsLibrary.functionGetDirSeprator ();
	    //static public final String OS = FunctionsLibrary.functionWhatOS();
	    static public final String DATALIBRARY = System.getProperty ("user.dir") + SLASH + "src" + SLASH + "main" + SLASH + "java" + SLASH + "com" + SLASH + "project" + SLASH + "automated" + SLASH + "framework" + SLASH + "libraries" + SLASH + "DataLibrary.xml"; 
	    static public final String DATALIBRARY2 = System.getProperty ("user.dir") + SLASH + "src" + SLASH + "main" + SLASH + "java" + SLASH + "com" + SLASH + "project" + SLASH + "automated" + SLASH + "framework" + SLASH + "libraries" + SLASH +  "DataLibrary.properties"; 
	    static public final String SENDREPORTTO = "shyder@cray.com";
	    
	    //MACHINE
	    static public final String URIKAMACHINE="https://ec2-174-129-39-132.compute-1.amazonaws.com/urika/gam/query-history.jsp";
	    //static public final String URIKAMACHINE="http://comet1";
	    //static public final String URIKAMACHINE="http://thor1";
	    
	    static public final String BROWSERTYPE  = "Firefox";
	    static public final String USERNAME  = "admin";
	    static public final String PASSWORD  = "admin";
	    //======================================================================================
	    
	    //SUITE: SPARQL QUERY (Pulling test-case date from DataLibrary.xml) 
	    static public final String sQueryPrefix = "PREFIX dc: <http://purl.org/dc/elements/1.1/> " + "\n" +
		       "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + "\n" +
	    	   "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + "\n" +
	    	   "PREFIX owl: <http://www.w3.org/2002/07/owl#> " + "\n" +
	    	   "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + "\n" +
	    	   "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +"\n\n";
	    		
	    //static public final String sQueryPrefix  = "aa";
	    
	    
	    
	    static public final String sQuery001 =  FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sQuery001"); 
	    static public final String sQuery002 =  FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sQuery001"); 
	    static public final String sQuery003 =  FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sQuery001"); 
	    
	    
	    
	    //======================================================================================
	    
	    
	    String sFileImport = FunctionsLibrary.functionWhichFileForFileImport ();
	    
	    
	    //SUITE: QUERY HISTORY (Pulling test-case date from DataLibrary.xml) 
	    static public final String sSearchText = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase001QueryHistoryTest.SearchText");
	    static public final String sExecutedby = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase002QueryHistoryTest.sExecutedby");
	    static public final String sExecutedon1 = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase003QueryHistoryTest.sExecutedon1");
	    static public final String sDatabaseid = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase004QueryHistory.sDatabaseid");
	    static public final String sStatus = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase005QueryHistoryTest.sStatus");
	    static public final String sQueryType = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase006QueryHistoryTest.sQueryType");
	   //======================================================================================
	    
	    
	    
	    
    	
 
}