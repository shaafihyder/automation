/*package com.project.automated.framework.libraries;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class ObjectsLibrary {
	/*
    
    protected WebElement element;
    private WebElement returnTextField_Email, returnTextFiled_Password, returnPushButton_SignIn;

    @FindBy(id = "username") public WebElement objectTextField_Username;    //*** Web elements Declaration
    @FindBy(id = "password") public WebElement objectTextField_Password;
    @FindBy(id = "login") public WebElement objectPushButton_SignIn;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/label/input") public WebElement objectTextField_Search;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[5]/a[2]/i") public WebElement objectPushButton_Delete;
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[2]/a") public WebElement objectPushButton_Dashboard;
    @FindBy(xpath = "/html/body/div[3]/div[2]/a") public WebElement objectPushButton_DeleteOk;
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[7]/a") public WebElement objectPushButton_ManageData;
    @FindBy(id = "addDataButton") public WebElement objectPushButton_Click;
    @FindBy(id = "localInput") public WebElement objectTextField_LocalFile;
    @FindBy(id = "filterDB") public WebElement objectTextField_Database;
    @FindBy(id = "filenameInput") public WebElement objectTextField_NameYourArtifact;
    @FindBy(id = "freeTextSearch") public WebElement objectTextField_FreeTextSearch;
    @FindBy(xpath = ".//*[@id='content']/div[2]/div/div[1]/span/button") public WebElement objectPushButton_Searchbutton;
    @FindBy(id = "searchSettings") public WebElement objectPushButton_Filterbutton;
    @FindBy(id = "filterUser") public WebElement objectDropdownField_ExecutedBy;
    @FindBy(id= "rangeA") public WebElement objectTextField_Executedon;
    @FindBy(id = "filterStatus") public WebElement objectTextField_Status;
    @FindBy(id = "filterType") public WebElement objectTextField_QueryType;
    @FindBy(id = "reset") public WebElement objectPushButton_Resetbutton;
    @FindBy(xpath = ".//*[@id='prev']/a") public WebElement objectPushButton_Previousbutton;
    @FindBy(xpath = ".//*[@id='next']/a") public WebElement objectPushButton_Nextbutton;
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[14]/a") public WebElement objectPushButton_SPARQLQuery;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]") public WebElement objectTextField_SPARQLQuery;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/div/button") public WebElement objectPushButton_New;
    @FindBy(id = "clearBtn") public WebElement objectPushButton_SPARQLQueryClearResults;
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[6]/a") public WebElement objectPushButton_ManageDatabases;
    @FindBy(id = "addDataButton") public WebElement objectPushButton_AddData;
    @FindBy(id = "dbName") public WebElement objectTextField_DatabaseName;
    @FindBy(id = "commentsInput") public WebElement objectTextField_Comments;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/table/tbody/tr/td/label/input") public WebElement objectCheckbox_Database;
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div[9]/div[2]/form/div/div/div/div[2]/div/label/input") public WebElement objectTextField_SearchDatabase;
    @FindBy(id = "addDataToDatabaseAction") public WebElement objectPushButton_Database_Submit;
    @FindBy(id = "applyNewDatabaseButton") public WebElement objectPushButton_ApplyStart;
    @FindBy(id = "applyNewDataAction") public WebElement objectPushButton_ApplyStart_Confirm;
    @FindBy(id = "importDataCancel") public WebElement objectPushButton_ImportData_Cancel;
    @FindBy(id = "dbHeaderButton") public WebElement objectPushButton_DatabaseConnected;
    @FindBy(id = "topDbButton-787456b1-1759-4c33-9978-d79adf774339") public WebElement objectPushButton_DatabaseStop;
    @FindBy(id = "importDataAction") public WebElement objectPushButton_Submit;
    @FindBy(id = "newDatabaseButton") public WebElement objectPushButton_NewDatabase;

    
public void TextField_Username_EnterData (String sUserName){
     System.out.println(".....   @" + this.getClass().getSimpleName() + " :" + new Exception().getStackTrace()[0].getMethodName() + " ()");

     objectTextField_Username.sendKeys(sUserName);
}



    //Urika > Login > Password
    public void TextField_Password_EnterData (String sPassword){
        //System.out.println("@PageObjects_UrikaLoginPage: TextFiled_Password ()");
        objectTextField_Password.sendKeys(sPassword);
    }//method end

    //Urika > Login > SignIn
    public void PushButton_SignIn_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: PushButton_SignIn ()");
        objectPushButton_SignIn.click();
    }//method end

    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Manage Data > Search                                      *
     *                                                                                                *
     **************************************************************************************************/
/*
    public void TextField_Search_EnterData (String sImportedFileName){
        //System.out.println("@PageObjects_Urika: objectTextField_Search ()");
        objectTextField_Search.sendKeys(sImportedFileName);
    }//method end


    //Urika > Manage Data > Delete
    public void PushButton_Delete_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Delete_Click ()");
        objectPushButton_Delete.click();
    }//method end



    //Urika > Manage Data > Delete > Ok
    public void PushButton_DeleteOk_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_DeleteOk_Click ()");
        objectPushButton_DeleteOk.click();
    }//method end






    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Left hand side tabs                                       *
     *                                                                                                *
     **************************************************************************************************/

    //


/*
    //Urika > Dashboard
    public void PushButton_Dashboard_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Dashboard_Click ()");
        objectPushButton_Dashboard.click();
    }//method end


    //Urika > Manage Data
    public void PushButton_ManageData_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_ManageData_Click ()");
        objectPushButton_ManageData.click();
    }//method end






















/*




    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Manage Data > Add File                                    *
     *                                                                                                *
     **************************************************************************************************/
/*

    //Urika > Manage Data > Add File
    public void PushButton_AddData_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_AddData_Click ()");
        objectPushButton_Click.click();
    }//method end


    //Urika > Manage Data > Add File > Local Input
    public void TextField_LocalFile_EnterData (String sLocalFilePath){
        //System.out.println("@PageObjects_Urika: TextField_LocalFile_EnterData ()");
        objectTextField_LocalFile.sendKeys(sLocalFilePath);
    }//method end

    //Urika > Manage Data > Add File > Name your artifact
    public void TextField_NameYourArtifact_EnterData (String sNameYourArtifact){
        //System.out.println("@PageObjects_Urika: TextField_NameYourArtifact_EnterData ()");
        objectTextField_NameYourArtifact.sendKeys(sNameYourArtifact);
    }//method end

    //Urika > Manage Data > Add File > Comments
    public void TextField_Comments_EnterData (String sComment){
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
        objectTextField_Comments.sendKeys(sComment);
        //objectPushButton_SignIn.click();
    }//method end

    //Urika > Manage Data > Add File > Submit
    public void PushButton_Submit_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Submit_Click ()");
        objectPushButton_Submit.click();
    }//method end
    
    
    
    
    
    
    
    

    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Query History > Search with filters                       *
     *                                                                                                *
     **************************************************************************************************/


 /*   

    
    public void TextField_Freetext_Search (String sSearchText){
        objectTextField_FreeTextSearch.sendKeys(sSearchText);
    }//method end


    //Urika > Query History > Search button
    public void PushButton_Search_Click (){
        objectPushButton_Searchbutton.click();
    }//method end

    public void PushButton_Filter_Click (){
        objectPushButton_Filterbutton.click();
    }//method end

    public void DropdownField_Filter_Executedby (String sExecutedby){
    	objectDropdownField_ExecutedBy.sendKeys(sExecutedby);
    }//method end	

    //Urika > Query History > Filter Button > Executed Date
    //@FindBy(xpath = ".//*[@id='rangeA']")    //*** Web elements Declaration
  
    public void TextField_Filter_Executedon (String sExecutedon1){
        objectTextField_Executedon.sendKeys(sExecutedon1);
    }//method end


    //Urika > Query History > Filter Button > Database
    public void DropdownField_Filter_Database (String sDatabaseid){
        objectTextField_Database.sendKeys(sDatabaseid);
    }//method end	

    //Urika > Query History > Filter Button > Status
    public void DropdownField_Filter_Status (String sStatus){
        objectTextField_Status.sendKeys(sStatus);
    }//method end	

    //Urika > Query History > Filter Button > Query Type
    public void DropdownField_Filter_QueryType (String sQueryType){
        objectTextField_QueryType.sendKeys(sQueryType);
    }//method end	

    //Urika > Query History > Search Filter button
    public void PushButton_Reset_Click (){
        objectPushButton_Resetbutton.click();
    }//method end


    public void PushButton_Previousbutton_Click (){
        objectPushButton_Previousbutton.click();
    }//method end

    public void PushButton_Nextbutton_Click (){
    	objectPushButton_Nextbutton.click();
    }//method end
   
    
  
    
    //SPARQL QUERY
    //Urika > Sparql Query > Sparql Query push-button
    public void objectPushButton_SPARQLQuery_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectPushButton_SPARQLQuery.click();
    }//method end
    
    
    //Urika > SPARQL Query > Query Text field
    
                     
    public void objectTextField_SPARQLQuery_EnterText (String sQuery){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	//objectTextField_SPARQLQuery.click();
    	//objectTextField_SPARQLQuery.clear();
    	//objectTextField_SPARQLQuery.clear();
    	String aa = objectTextField_SPARQLQuery.getText();
   // 	System.out.println (objectTextField_SPARQLQuery.getText());
    //	System.out.println (objectTextField_SPARQLQuery.getText().length());
    	
    	
    	//int reasonPriorCount = objectTextField_SPARQLQuery.getText().length();
    	//int i = 0;
    	//objectTextField_SPARQLQuery.click();
    	//while(i < reasonPriorCount)
    	//{
    		//objectTextField_SPARQLQuery.sendKeys("SearchTerm/"+aa); 
    	    objectTextField_SPARQLQuery.click ();
    	    
    	    objectTextField_SPARQLQuery.sendKeys(Keys.END);
    	    objectTextField_SPARQLQuery.sendKeys(Keys.ENTER);
    	    //objectTextField_SPARQLQuery.sendKeys(Keys.CLEAR);
    	    //objectTextField_SPARQLQuery.sendKeys(Keys.ARROW_RIGHT);
    	    
    		//objectTextField_SPARQLQuery.sendKeys(Keys.SHIFT, Keys.ARROW_LEFT); 
    		//objectTextField_SPARQLQuery.sendKeys(Keys.SHIFT, Keys.ARROW_LEFT); 
    		//objectTextField_SPARQLQuery.sendKeys(Keys.SHIFT, Keys.ARROW_RIGHT); 
    		//objectTextField_SPARQLQuery.sendKeys(Keys.DELETE); 
    		
    		
    		
    		//objectTextField_SPARQLQuery.sendKeys(Keys.DELETE); 
    		//objectTextField_SPARQLQuery.clear ();
    		
    	  //i++;
    	//}
    	
    	objectTextField_SPARQLQuery.click();
    	objectTextField_SPARQLQuery.click();
    	objectTextField_SPARQLQuery.sendKeys("dd");
    	//objectTextField_SPARQLQuery.sendKeys(sQuery);
    }//method end
    
    
    //Button New
                     
    public void objectPushButton_New_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectPushButton_New.click();
    	
    	//objectTextField_SPARQLQuery.sendKeys(sQuery);
    }//method end
    
    
    public void objectTextField_SPARQLQuery_ClearText(){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectTextField_SPARQLQuery.clear ();
    }//method end
    
    
    //Urika > Sparql Query > Sparql Query clear-results push-button
    public void objectPushButton_SPARQLQueryClearResults_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectPushButton_SPARQLQueryClearResults.click();
    }//method end
    

    
    
    
    //Urika > Manage Data
    public void PushButton_ManageDatabases_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_ManageData_Click ()");
        objectPushButton_ManageDatabases.click();
    }//method end


    
  //Urika > Sparql Query > Sparql Query clear-results push-button
    public void objectPushButton_NewDatabase_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectPushButton_NewDatabase.click();
    }//method end
    
    
    
    
    
  //Urika > Manage Data > Add File > Comments
    public void TextField_DatabaseName_EnterData (String sDatabaseName){
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	objectTextField_DatabaseName.sendKeys(sDatabaseName);
        //objectPushButton_SignIn.click();
    }//method end
    
  //Urika > Manage Data > Add File > Comments
    public void PushButton_AddDataButton_Click (){
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	objectPushButton_AddData.click ();
    	
        //objectPushButton_SignIn.click();
    }//method end
    
  //Urika > Manage Data > Add File > Comments
    public void objectTextField_SearchDatabase_Enter (String sDatabaseName){
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	objectTextField_SearchDatabase.sendKeys(sDatabaseName);
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
    
    //Urika > Manage Data > Add File > Comments
    public void objectCheckbox_Database_Check (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	objectCheckbox_Database.click();
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    //Urika > Manage Data > Add File > Comments
    public void objectPushButton_Database_Submit (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	objectPushButton_Database_Submit.click();
    	
    	
        //objectPushButton_SignIn.click();
    }//method end
    
  //Urika > Manage Data > Add File > Comments
    public void objectPushButton_ApplyStart_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	objectPushButton_ApplyStart.click();
    	
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
  //Urika > Manage Data > Add File > Comments
    public void objectPushButton_ApplyStartConfirm_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	objectPushButton_ApplyStart_Confirm.click();
    	
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
  
    
    
    //Urika > Manage Data > Add File > Comments
    public void objectPushButton_ImportDataOperation_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	objectPushButton_ImportData_Cancel.click();
    	
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
    
    
    
  //Urika > Manage Data > Add File > Comments
    public void objectPushButton_DatabaseConnected_YesNo (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
    	String sDBConnected = objectPushButton_DatabaseConnected.getText();
    	System.out.println ("Database Connected? "+sDBConnected);
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
    
  //Urika > Manage Data > Add File > Comments
    
    
    
    
    public void objectPushButton_DatabaseStop_Click (){
    	
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
    	
    	
  //  	objectPushButton_DatabaseStop.click();
    	
    	
        //objectPushButton_SignIn.click();
    }//method end
    
    
    
    
    
    
    
   */ 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//}//class end