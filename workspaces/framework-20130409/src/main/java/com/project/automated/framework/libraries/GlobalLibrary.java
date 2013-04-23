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
	    //static public final String DATALIBRARY = System.getProperty ("user.dir") + SLASH + "src" + SLASH + "main" + SLASH + "java" + SLASH + "com" + SLASH + "project" + SLASH + "automated" + SLASH + "framework" + SLASH + "libraries" + SLASH + "DataLibrary.xml"; 
	    static public final String DATALIBRARY = FunctionsLibrary.functionsGetLibrariesLocation ()+"DataLibrary.xml";
	    //static public final String DATALIBRARY2 = System.getProperty ("user.dir") + SLASH + "src" + SLASH + "main" + SLASH + "java" + SLASH + "com" + SLASH + "project" + SLASH + "automated" + SLASH + "framework" + SLASH + "libraries" + SLASH +  "DataLibrary.properties"; 
	    static public final String SENDREPORTTO = "shyder@cray.com";
	    
	    //MACHINE
	    //static public final String URIKAMACHINE="https://ec2-174-129-39-132.compute-1.amazonaws.com/urika/gam/query-history.jsp";
	    static public final String URIKAMACHINE="http://comet1";
	    //static public final String URIKAMACHINE="http://thor1";
	    
	    static public final String BROWSERTYPE  = "Firefox";
	    static public final String USERNAME  = "admin";
	    static public final String PASSWORD  = "admin";
	    static public final long lTimeOut = 5;
	    //======================================================================================
	    
	    //SUITE: SPARQL QUERY (Pulling test-case date from DataLibrary.xml) 
	    static public final String sQueryPrefix = "PREFIX dc: <http://purl.org/dc/elements/1.1/> " + "\n" +
		       "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + "\n" +
	    	   "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " + "\n" +
	    	   "PREFIX owl: <http://www.w3.org/2002/07/owl#> " + "\n" +
	    	   "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + "\n" +
	    	   "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +"\n\n";
	    		
	    //static public final String sQueryPrefix  = "aa";
	    
	    
	    
	    static public final String sVerifySPARQL1 =  FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL1"); 
	    static public final String sVerifySPARQL2 =  FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL2");
	    static public final String sVerifySPARQL3 =  FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL3");
	    static public final String sVerifySPARQL4 =  FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "sparqlquery.Testcase001SparqlQueryTest.sVerifySPARQL4");
	    
	    static public final String sQuery001 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	        "SELECT *"+"\\n"+
	    	"WHERE {"+"\\n"+
	        "?n0 a ub:GraduateStudent .?n0 ub:takesCourse"+"\\n"+
	    	"<http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
	        "}";
	    
	    static public final String sQuery002 ="PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	    	"SELECT *"+"\\n"+
	    	"WHERE {"+"\\n"+
	    	"?n0 a ub:GraduateStudent ."+"\\n"+
	    	"?n1 a ub:University ."+"\\n"+
	    	"?n2 a ub:Department ."+"\\n"+
	    	"?n0 ub:memberOf ?n2 ."+"\\n"+
	    	"?n2 ub:subOrganizationOf ?n1 ."+"\\n"+
	    	"?n0 ub:undergraduateDegreeFrom ?n1 ."+"\\n"+
	    	"}";

	   static public final String sQuery003 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	    	"SELECT *"+"\\n"+
	    	"WHERE {"+"\\n"+
	    	"?n0 a ub:Publication ."+"\\n"+
	    	"?n0 ub:publicationAuthor <http://www.Department0.University0.edu/AssistantProfessor0> ."+"\n"+
	    	"}";
	   
	   static public final String sQuery004 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
			"SELECT *"+"\\n"+
			"WHERE {"+"\\n"+
			"?n0 a ub:Professor ."+"\\n"+
			"?n0 ub:worksFor <http://www.Department0.University0.edu> ."+"\\n"+
			"?n0 ub:name ?n1 ."+"\\n"+
			"?n0 ub:emailAddress ?n2 ."+"\\n"+
			"?n0 ub:telephone ?n3 ."+"\\n"+
			"}";
	   
	   static public final String sQuery005 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "?n0 ub:memberOf <http://www.Department0.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery006 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "}";
	   
	   static public final String sQuery007 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n1 a ub:Course ."+"\\n"+
		   "<http://www.Department0.University0.edu/AssociateProfessor0> ub:teacherOf ?n1 ."+"\\n"+
		   "?n0 ub:takesCourse ?n1 ."+"\\n"+
		   "}";
	   
	   static public final String sQuery008 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n1 a ub:Department ."+"\\n"+
		   "?n0 ub:memberOf ?n1 ."+"\\n"+
		   "?n1 ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "?n0 ub:emailAddress ?n2 ."+"\\n"+
		   "}";
	   
	   static public final String sQuery009 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
           "?n0 a ub:Student ."+"\\n"+
           "?n1 a ub:Faculty ."+"\\n"+
           "?n2 a ub:Course ."+"\\n"+
           "?n0 ub:advisor ?n1 ."+"\\n"+
           "?n0 ub:takesCourse ?n2 ."+"\\n"+
           "?n1 ub:teacherOf ?n2 ."+"\\n"+
		   "}";
 
	   static public final String sQuery010 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+ "\\n"+ 
		   "WHERE {"+ "\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n0 ub:takesCourse <http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery011 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:ResearchGroup ;"+"\\n"+
		   "ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery012 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Chair ."+"\\n"+
		   "?n1 a ub:Department ."+"\\n"+
		   "?n0 ub:worksFor ?n1 ."+"\\n"+
		   "?n1 ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery013 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "<http://www.University0.edu> ub:hasAlumnus ?n0"+"\\n"+
		   "}";
	    
	   static public final String sQuery014 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:UndergraduateStudent ."+
		   "}";
	   
	   static public final String sQuery015 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "<http://www.University0.edu> ub:hasAlumnus ?n0"+"\\n"+
		   "}";
	   
	  static public final String sQuery016 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:GraduateStudent .?n0 ub:takesCourse"+"\\n"+
		   "<http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		   "}";
		    
	  static public final String sQuery017 ="PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	    	"SELECT *"+"\\n"+
	    	"WHERE {"+"\\n"+
	    	"?n0 a ub:GraduateStudent ."+"\\n"+
	    	"?n1 a ub:University ."+"\\n"+
	    	"?n2 a ub:Department ."+"\\n"+
	    	"?n0 ub:memberOf ?n2 ."+"\\n"+
	    	"?n2 ub:subOrganizationOf ?n1 ."+"\\n"+
	    	"?n0 ub:undergraduateDegreeFrom ?n1 ."+"\\n"+
	    	"}";

	   static public final String sQuery018 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	    	"SELECT *"+"\\n"+
	    	"WHERE {"+"\\n"+
	    	"?n0 a ub:Publication ."+"\\n"+
	    	"?n0 ub:publicationAuthor <http://www.Department0.University0.edu/AssistantProfessor0> ."+"\n"+
	    	"}";
	   
	   static public final String sQuery019 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
			"SELECT *"+"\\n"+
			"WHERE {"+"\\n"+
			"?n0 a ub:Professor ."+"\\n"+
			"?n0 ub:worksFor <http://www.Department0.University0.edu> ."+"\\n"+
			"?n0 ub:name ?n1 ."+"\\n"+
			"?n0 ub:emailAddress ?n2 ."+"\\n"+
			"?n0 ub:telephone ?n3 ."+"\\n"+
			"}";
	   
	   static public final String sQuery020 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "?n0 ub:memberOf <http://www.Department0.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery021 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "}";
	   
	   static public final String sQuery022 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n1 a ub:Course ."+"\\n"+
		   "<http://www.Department0.University0.edu/AssociateProfessor0> ub:teacherOf ?n1 ."+"\\n"+
		   "?n0 ub:takesCourse ?n1 ."+"\\n"+
		   "}";
	   
	   static public final String sQuery023 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n1 a ub:Department ."+"\\n"+
		   "?n0 ub:memberOf ?n1 ."+"\\n"+
		   "?n1 ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "?n0 ub:emailAddress ?n2 ."+"\\n"+
		   "}";
	   
	   static public final String sQuery024 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
           "?n0 a ub:Student ."+"\\n"+
           "?n1 a ub:Faculty ."+"\\n"+
           "?n2 a ub:Course ."+"\\n"+
           "?n0 ub:advisor ?n1 ."+"\\n"+
           "?n0 ub:takesCourse ?n2 ."+"\\n"+
           "?n1 ub:teacherOf ?n2 ."+"\\n"+
		   "}";

	   static public final String sQuery025 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+ "\\n"+ 
		   "WHERE {"+ "\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n0 ub:takesCourse <http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery026 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:ResearchGroup ;"+"\\n"+
		   "ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery027 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Chair ."+"\\n"+
		   "?n1 a ub:Department ."+"\\n"+
		   "?n0 ub:worksFor ?n1 ."+"\\n"+
		   "?n1 ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery028 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "<http://www.University0.edu> ub:hasAlumnus ?n0"+"\\n"+
		   "}";
	    
	   static public final String sQuery029 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:UndergraduateStudent ."+
		   "}";
	   
	   static public final String sQuery030 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		  "SELECT *"+"\\n"+
		  "WHERE {"+"\\n"+
		  "?n0 a ub:Person ."+"\\n"+
		  "<http://www.University0.edu> ub:hasAlumnus ?n0"+"\\n"+
		  "}";

	  static public final String sQuery031 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		  "SELECT *"+"\\n"+
		  "WHERE {"+"\\n"+
		  "?n0 a ub:GraduateStudent .?n0 ub:takesCourse"+"\\n"+
		  "<http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		  "}";
		    
	  static public final String sQuery032 ="PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	      "SELECT *"+"\\n"+
	      "WHERE {"+"\\n"+
	      "?n0 a ub:GraduateStudent ."+"\\n"+
	      "?n1 a ub:University ."+"\\n"+
	      "?n2 a ub:Department ."+"\\n"+
	      "?n0 ub:memberOf ?n2 ."+"\\n"+
	      "?n2 ub:subOrganizationOf ?n1 ."+"\\n"+
	      "?n0 ub:undergraduateDegreeFrom ?n1 ."+"\\n"+
	      "}";

	   static public final String sQuery033 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	      "SELECT *"+"\\n"+
	      "WHERE {"+"\\n"+
	      "?n0 a ub:Publication ."+"\\n"+
	      "?n0 ub:publicationAuthor <http://www.Department0.University0.edu/AssistantProfessor0> ."+"\n"+
	      "}";
	   
	   static public final String sQuery034 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		  "SELECT *"+"\\n"+
		  "WHERE {"+"\\n"+
		  "?n0 a ub:Professor ."+"\\n"+
		  "?n0 ub:worksFor <http://www.Department0.University0.edu> ."+"\\n"+
		  "?n0 ub:name ?n1 ."+"\\n"+
		  "?n0 ub:emailAddress ?n2 ."+"\\n"+
		  "?n0 ub:telephone ?n3 ."+"\\n"+
		  "}";
	   
	   static public final String sQuery035 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "?n0 ub:memberOf <http://www.Department0.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery036 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "}";
	   
	   static public final String sQuery037 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n1 a ub:Course ."+"\\n"+
		   "<http://www.Department0.University0.edu/AssociateProfessor0> ub:teacherOf ?n1 ."+"\\n"+
		   "?n0 ub:takesCourse ?n1 ."+"\\n"+
		   "}";
	   
	   static public final String sQuery038 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n1 a ub:Department ."+"\\n"+
		   "?n0 ub:memberOf ?n1 ."+"\\n"+
		   "?n1 ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "?n0 ub:emailAddress ?n2 ."+"\\n"+
		   "}";
	   
	   static public final String sQuery039 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
           "?n0 a ub:Student ."+"\\n"+
           "?n1 a ub:Faculty ."+"\\n"+
           "?n2 a ub:Course ."+"\\n"+
           "?n0 ub:advisor ?n1 ."+"\\n"+
           "?n0 ub:takesCourse ?n2 ."+"\\n"+
           "?n1 ub:teacherOf ?n2 ."+"\\n"+
		   "}";

	   static public final String sQuery040 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+ "\\n"+ 
		   "WHERE {"+ "\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "?n0 ub:takesCourse <http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery041 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:ResearchGroup ;"+"\\n"+
		   "ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery042 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Chair ."+"\\n"+
		   "?n1 a ub:Department ."+"\\n"+
		   "?n0 ub:worksFor ?n1 ."+"\\n"+
		   "?n1 ub:subOrganizationOf <http://www.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery043 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "<http://www.University0.edu> ub:hasAlumnus ?n0"+"\\n"+
		   "}";
	    
	   static public final String sQuery044 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:UndergraduateStudent ."+
		   "}";
	   
	  static public final String sQuery045 = "SELECT *"+"\\n"+
		   "WHERE { }";

	  static public final String sQuery046 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:GraduateStudent .?n0 ub:takesCourse"+"\\n"+
		   "<http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		   "}";
		    
	    static public final String sQuery047 ="PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	    	"SELECT *"+"\\n"+
	    	"WHERE {"+"\\n"+
	    	"?n0 a ub:GraduateStudent ."+"\\n"+
	    	"?n1 a ub:University ."+"\\n"+
	    	"?n2 a ub:Department ."+"\\n"+
	    	"?n0 ub:memberOf ?n2 ."+"\\n"+
	    	"?n2 ub:subOrganizationOf ?n1 ."+"\\n"+
	    	"?n0 ub:undergraduateDegreeFrom ?n1 ."+"\\n"+
	    	"}";

	   static public final String sQuery048 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
	    	"SELECT *"+"\\n"+
	    	"WHERE {"+"\\n"+
	    	"?n0 a ub:Publication ."+"\\n"+
	    	"?n0 ub:publicationAuthor <http://www.Department0.University0.edu/AssistantProfessor0> ."+"\n"+
	    	"}";
	   
	   static public final String sQuery049 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
			"SELECT *"+"\\n"+
			"WHERE {"+"\\n"+
			"?n0 a ub:Professor ."+"\\n"+
			"?n0 ub:worksFor <http://www.Department0.University0.edu> ."+"\\n"+
			"?n0 ub:name ?n1 ."+"\\n"+
			"?n0 ub:emailAddress ?n2 ."+"\\n"+
			"?n0 ub:telephone ?n3 ."+"\\n"+
			"}";
	   
	   static public final String sQuery050 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Person ."+"\\n"+
		   "?n0 ub:memberOf <http://www.Department0.University0.edu> ."+"\\n"+
		   "}";
	   
	   static public final String sQuery051 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+ 
		   "WHERE {"+"\\n"+
		   "?n0 a ub:Student ."+"\\n"+
		   "}";
	   
	   static public final String sQuery052 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:GraduateStudent .?n0 ub:takesCourse"+"\\n"+
		   "<http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		   "}";
	   
	    static public final String sQuery053 = "PREFIX ub: <http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#>"+"\\n"+"\\n"+
		   "SELECT *"+"\\n"+
		   "WHERE {"+"\\n"+
		   "?n0 a ub:GraduateStudent .?n0 ub:takesCourse"+"\\n"+
		   "<http://www.Department0.University0.edu/GraduateCourse0> ."+"\\n"+
		   "}";
	 	   
	   
	   
	   
	    //======================================================================================
	    
	    
	    String sFileImport = FunctionsLibrary.functionWhichFileForFileImport ();
	    
	    
	    //SUITE: QUERY HISTORY (Pulling test-case date from DataLibrary.xml) 
	    //static public final String sSearchText = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase001QueryHistoryTest.SearchText");
	    //static public final String sExecutedby = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase002QueryHistoryTest.sExecutedby");
	    //static public final String sExecutedon1 = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase003QueryHistoryTest.sExecutedon1");
	    //static public final String sDatabaseid = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase004QueryHistory.sDatabaseid");
	    //static public final String sStatus = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase005QueryHistoryTest.sStatus");
	    //static public final String sQueryType = FunctionsLibrary.functionReadDataLibraryXML (DATALIBRARY, "queryhistory.Testcase006QueryHistoryTest.sQueryType");
	   //======================================================================================
	    
	    
	    static public final String sArtifact = "AUTOMATION-Artifact-lubm0"; 
	    static public final String sDatabase = "AUTOMATION-Database";
	    static public final String sSearchArtifact = "AUTOMATION";
	    
    	
 
}