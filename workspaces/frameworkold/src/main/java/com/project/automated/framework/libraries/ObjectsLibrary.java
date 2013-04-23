package com.project.automated.framework.libraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;


/****************************
 * User: Shaafi Hyder
 * Date: 8/09/2012 @7:45 AM
 ***************************/

public class ObjectsLibrary {

    protected WebElement element;
    private WebElement returnTextField_Email, returnTextFiled_Password, returnPushButton_SignIn;

    /*************************************************************************************************
    *                                                                                                *
    *                                      Urika > Login                                             *
    *                                                                                                *
    **************************************************************************************************/

    //Urika > Login > Username
    @FindBy(id = "username")    //*** Web elements Declaration
    public WebElement objectTextField_Username;
    public void TextField_Username_EnterData (String sUserName){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
        objectTextField_Username.sendKeys(sUserName);
    }//method end

    //Urika > Login > Password
    @FindBy(id = "password")
    public WebElement objectTextField_Password;
    public void TextField_Password_EnterData (String sPassword){
        //System.out.println("@PageObjects_UrikaLoginPage: TextFiled_Password ()");
        objectTextField_Password.sendKeys(sPassword);
    }//method end

    //Urika > Login > SignIn
    @FindBy(id = "login")
    public WebElement objectPushButton_SignIn;
    public void PushButton_SignIn_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: PushButton_SignIn ()");
        objectPushButton_SignIn.click();
    }//method end

    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Manage Data > Search                                      *
     *                                                                                                *
     **************************************************************************************************/

    //Urika > Manage Data > Search
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/label/input")    //*** Web elements Declaration
    public WebElement objectTextField_Search;
    public void TextField_Search_EnterData (String sImportedFileName){
        //System.out.println("@PageObjects_Urika: objectTextField_Search ()");
        objectTextField_Search.sendKeys(sImportedFileName);
    }//method end


    //Urika > Manage Data > Delete
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[5]/a[2]/i")    //*** Web elements Declaration
    public WebElement objectPushButton_Delete;
    public void PushButton_Delete_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Delete_Click ()");
        objectPushButton_Delete.click();
    }//method end



    //Urika > Manage Data > Delete > Ok
    @FindBy(xpath = "/html/body/div[3]/div[2]/a")    //*** Web elements Declaration
    public WebElement objectPushButton_DeleteOk;
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



    //Urika > Dashboard
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[2]/a")    //*** Web elements Declaration
    public WebElement objectPushButton_Dashboard;
    public void PushButton_Dashboard_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Dashboard_Click ()");
        objectPushButton_Dashboard.click();
    }//method end


    //Urika > Manage Data
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[7]/a")    //*** Web elements Declaration
    public WebElement objectPushButton_ManageData;
    public void PushButton_ManageData_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_ManageData_Click ()");
        objectPushButton_ManageData.click();
    }//method end



























    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Manage Data > Add File                                    *
     *                                                                                                *
     **************************************************************************************************/


    //Urika > Manage Data > Add File
    @FindBy(id = "addDataButton")    //*** Web elements Declaration
    public WebElement objectPushButton_Click;
    public void PushButton_AddData_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_AddData_Click ()");
        objectPushButton_Click.click();
    }//method end


    //Urika > Manage Data > Add File > Local Input
    @FindBy(id = "localInput")    //*** Web elements Declaration
    public WebElement objectTextField_LocalFile;
    public void TextField_LocalFile_EnterData (String sLocalFilePath){
        //System.out.println("@PageObjects_Urika: TextField_LocalFile_EnterData ()");
        objectTextField_LocalFile.sendKeys(sLocalFilePath);
    }//method end

    //Urika > Manage Data > Add File > Name your artifact
    @FindBy(id = "filenameInput")
    public WebElement objectTextField_NameYourArtifact;
    public void TextField_NameYourArtifact_EnterData (String sNameYourArtifact){
        //System.out.println("@PageObjects_Urika: TextField_NameYourArtifact_EnterData ()");
        objectTextField_NameYourArtifact.sendKeys(sNameYourArtifact);
    }//method end

    //Urika > Manage Data > Add File > Comments
    @FindBy(id = "commentsInput")
    public WebElement objectTextField_Comments;
    public void TextField_Comments_EnterData (String sComment){
        //System.out.println("@PageObjects_Urika: TextField_Comments_EnterData ()");
        objectTextField_Comments.sendKeys(sComment);
        //objectPushButton_SignIn.click();
    }//method end

    //Urika > Manage Data > Add File > Submit
    @FindBy(id = "importDataAction")
    public WebElement objectPushButton_Submit;
    public void PushButton_Submit_Click (){
        //System.out.println("@PageObjects_Urika: PushButton_Submit_Click ()");
        objectPushButton_Submit.click();
    }//method end
    
    
    
    
    
    
    
    

    /**************************************************************************************************
     *                                                                                                *
     *                              Urika > Query History > Search with filters                       *
     *                                                                                                *
     **************************************************************************************************/

    //Urika > Query History > Search
    @FindBy(id = "freeTextSearch")    //*** Web elements Declaration
    public WebElement objectTextField_FreeTextSearch;
    public void TextField_Freetext_Search (String sSearchText){
        objectTextField_FreeTextSearch.sendKeys(sSearchText);
    }//method end


    //Urika > Query History > Search button
    @FindBy(xpath = ".//*[@id='content']/div[2]/div/div[1]/span/button")    //*** Web elements Declaration
    public WebElement objectPushButton_Searchbutton;
    public void PushButton_Search_Click (){
        objectPushButton_Searchbutton.click();
    }//method end

    //Urika > Query History > Search Filter button
    @FindBy(id = "searchSettings")    //*** Web elements Declaration
    public WebElement objectPushButton_Filterbutton;
    public void PushButton_Filter_Click (){
        objectPushButton_Filterbutton.click();
    }//method end

    //Urika > Query History > Filter Button > Executed By
    @FindBy(id = "filterUser")    //*** Web elements Declaration
    public WebElement objectDropdownField_ExecutedBy;
    public void DropdownField_Filter_Executedby (String sExecutedby){
    	objectDropdownField_ExecutedBy.sendKeys(sExecutedby);
    }//method end	

    //Urika > Query History > Filter Button > Executed Date
    //@FindBy(xpath = ".//*[@id='rangeA']")    //*** Web elements Declaration
      @FindBy(id= "rangeA")    //*** Web elements Declaration
    	  
    public WebElement objectTextField_Executedon;
    public void TextField_Filter_Executedon (String sExecutedon1){
        objectTextField_Executedon.sendKeys(sExecutedon1);
    }//method end


    //Urika > Query History > Filter Button > Database
    @FindBy(id = "filterDB")    //*** Web elements Declaration
    public WebElement objectTextField_Database;
    public void DropdownField_Filter_Database (String sDatabaseid){
        objectTextField_Database.sendKeys(sDatabaseid);
    }//method end	

    //Urika > Query History > Filter Button > Status
    @FindBy(id = "filterStatus")    //*** Web elements Declaration
    public WebElement objectTextField_Status;
    public void DropdownField_Filter_Status (String sStatus){
        objectTextField_Status.sendKeys(sStatus);
    }//method end	

    //Urika > Query History > Filter Button > Query Type
    @FindBy(id = "filterType")    //*** Web elements Declaration
    public WebElement objectTextField_QueryType;
    public void DropdownField_Filter_QueryType (String sQueryType){
        objectTextField_QueryType.sendKeys(sQueryType);
    }//method end	

    //Urika > Query History > Search Filter button
    @FindBy(id = "reset")    //*** Web elements Declaration
    public WebElement objectPushButton_Resetbutton;
    public void PushButton_Reset_Click (){
        objectPushButton_Resetbutton.click();
    }//method end


    @FindBy(xpath = ".//*[@id='prev']/a")    //*** Web elements Declaration
    public WebElement objectPushButton_Previousbutton;
    public void PushButton_Previousbutton_Click (){
        objectPushButton_Previousbutton.click();
    }//method end

    @FindBy(xpath = ".//*[@id='next']/a")    //*** Web elements Declaration
    public WebElement objectPushButton_Nextbutton;
    public void PushButton_Nextbutton_Click (){
    	objectPushButton_Nextbutton.click();
    }//method end
   
    
    
    //SPARQL QUERY
  //Urika > Sparql Query > Sparql Query push-button
    @FindBy(xpath = "/html/body/div/div[3]/div/div/ul/li[14]/a")    //*** Web elements Declaration
    public WebElement objectPushButton_SPARQLQuery;
    public void objectPushButton_SPARQLQuery_Click (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectPushButton_SPARQLQuery.click();
    }//method end
    
    
    //Urika > SPARQL Query > Query Text field
    
    
    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]")    //*** Web elements Declaration
    public WebElement objectTextField_SPARQLQuery;
    public void objectTextField_SPARQLQuery_ClearText (){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectTextField_SPARQLQuery.clear();
    }//method end
    
    public void objectTextField_SPARQLQuery_EnterText (String sQuery){
        //System.out.println("@PageObjects_UrikaLoginPage: TextField_Username ()");
    	objectTextField_SPARQLQuery.sendKeys(sQuery);
    }//method end
    
    


}//class end