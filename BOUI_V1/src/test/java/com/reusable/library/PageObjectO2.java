
package com.reusable.library;

public class PageObjectO2{
	
	//*************************************Login Page Objects******************************************************************
	//QA - O2 Login
	public String userNametxtbx_xpath = "//input[@id='emailID-inputEl']";
	public String pwdtxtbx_xpath="//input[@id='password-inputEl']";
	public String loginbtn_xpath="//span[@id='loginButton-btnInnerEl']";
	public String clntSlctnO2base_id ="button-1016-btnIconEl";
	public String clntSlctnO2base_xpath ="//span[@id='button-1017-btnIconEl']";
	public String clntSlctnPepsi_xpath="//span[@id='button-1019-btnIconEl']";
	public String clienSlctntHIG_id="button-1017-btnIconEl";
	
	
	public String appLoggedalready_xpath="//div[text()='User already logged. Please close other sessions and try again.']";
	public String oKbtn_alreadylogged_xpath="//span[text()='OK']";
	
	//QC - O2 Login
	public String HIGIconQC_id ="button-1016-btnIconEl";
	
	//************************************End of Login Page Objects*************************************************************
	
	
	//****************************************Global Search Objects***********************************************************
	
	public String globalSearchtxtbx_xpath="//div[@id='elasticSearchText-inputWrap']";
	public String globalSearchicon_xpath="//a[@role='button']/following::span[@id='elasticSearch-btnWrap']";
	public String glblSearchResulst_xpath="//div[text()='Search Results']";
	public String glblExpand_xpath="//div[@class='x-grid-group-title']";
	public String glblEditicon_xpath="//b[starts-with(@onclick,'loadTransDetailPage')]";
	
	
	
	
	
	
	//************************************End of Global Search Objects*************************************************************
	
	
	
	
	
	//***************************************File Definition Creation Objects****************************************************
	//File Definition Creation
	public String fileconfigbtn_id="mltStgConfigButton-btnIconEl";
	public String Oldfiledef_xpathold="//table[@id='treeview-1032-record-42']/tbody/tr/td/div/span[text()='File Definitions']";
	
	public String filedef_xpath ="//span[text()='File Definitions']";
	public String filedefconfirpage_xpath="//span[text()='File Definition Name']";
	
	//Put Applicant
	public String createPutApp_xpath="//div[@data-qtip='Create Put Applicant']";
	public String headerCreationpage_xpath="//div[text()='Enter new file details']";
	
	//Mandatory fields for File Definition Creation
	public String CreateFileName_xpath ="//input[@id='fileName-inputEl']";
	public String FileDescription_xpath = "//input[@id='fileDefnDescr-inputEl']";
	
	public String Fileformatdrop_xpath="//div[@id='fileFormatCombo-trigger-picker']";
	public String Fileformatoptions_xpath="//div[@id='fileFormatCombo-picker']/div/ul/li";
	public String SelectFileformatopt_xpath = "//div[@id='fileFormatCombo-picker']/div/ul/li";

	public String transFileFormat_xpath = "//input[@id='fileFormatCombo-inputEl']";
	public String transFileFormat1_xpath = "//ul[@class='x-list-plain']/li[contains(text(),'Excel File')]";
	
	public String validationmode_xpath="//div[@id='ValModeCombo-trigger-picker']";
	public String validationmodeoptns_xpath="//div[@id='ValModeCombo-picker-listWrap']/ul/li";
	public String validationmodeYes_xpath="//div[@id='ValModeCombo-picker-listWrap']/ul/li[text()='Yes']";
	
	public String transHeaderChbox_xpath = "//input[@id='headerInd-inputEl']";
	public String transHeaderNumberLines_xpath = "//input[@id='headerCount-inputEl']";
	public String fileDefNxtpagebtn_xpath="//div[@id='fileDefNextPageId']";
	
	//Field Required selection Page
	public String headerfieldreqpage_xpath ="//div[text()='Enter details of fields in the new file']";
	public String wholepage_xpath ="//div[@id='finalCardPanel']";
	
	
	public String spreadshtslctn_xpath="//*[text()='SPREADSHEET_KEY']/following::td[4]";
	String countryrefchkbx_xpath="//*[text()='COUNTRY_REFERENCE']/following::td[4]";
	String legalfirstname_xpath="//*[text()='LEGAL_FIRST_NAME']/following::td[4]";
	String legalLastname_xpath="//*[text()='LEGAL_LAST_NAME']/following::td[4]";
	String fieldgrid_xpath = "//table[contains(@id,'gridview')]/tbody/tr/td[2]/div";
	String fieldcontainer_xpath="//div[@class='x-grid-item-container']";
	String rowIDPhone_xpath="//*[text()='ROW_ID_PHONE']/following::td[4]";
	String phnumber_xpath="//*[text()='PHONE_NUMBER']/following::td[4]";
	String phdevicetypid_xpath="//*[text()='PHONE_DEVICE_TYPE_ID']/following::td[4]";
	String primryphone_xpath="//*[text()='PHONE_PRIMARY']/following::td[4]";
	String phtypepref_xpath="//*[text()='PHONE_TYPE_REFERENCE']/following::td[4]";
	
	
	//*[text()='70']/following::td[5]/div/span
	
	//Save button in Required selection Page
	String submitbtn_id="fileDetailsaveButton";
	String dialogboxOk_btn_id="button-1005-btnInnerEl";
	
	String putAppexpander_xpath="//span[text()='Put Applicant']/preceding-sibling::div";
	
	String maincontenregion_xpath="//div[@id='maincontentRegion-bodyWrap']";
	
	String filedeftreetable_xpath ="//div[@id='defnTreePanel-body']";
	String filedefTreepanel_xpath="//div[@id='defnTreePanel-body']/div/div[2]";
	
	//view the created File Definition
	
	String fileruntime = "//*[text()='Put_App_testing.xls']/following::td[3]";
	String filenamerowcunt ="//table/tbody/tr/td/div";
	String filenamespancount = "//table/tbody/tr/td/div/span";
	String headertxtfilepag_xpath = "//span[text()='File Definition Name']";
	
	//Adding Authorized Submitter 
	String addAuthSubmtr_id = "addSubmitterButton-toolEl";
	String internaluserbtn_id="radio-1197-inputEl";
	String FNtxtbox_xpath="//input[@id='fName-inputEl']";
	String lanIDAuthSub="//input[@id='eId-inputEl']";
	String searchbtnAuthsub_xpath="//span[@id='empSearchBtn-btnInnerEl']";
	String headersearchresultAuthsub_xpath="//div[text()='Search Results']";
	
	//***************************************End of File Definition Creation Objects****************************************************
	
	
	//**************************************************File Upload Objects*************************************************************
	public String fileUploadicon_id ="mltFileUploadButton-btnIconEl";
	public String fileUploadbtn_xpath="//span[text()='File Upload']";
	public String Headertxtfileupload_id="fileSelectPanel_header-title-textEl";
	public String FileUploadlink_xpath="//div[@id='fileUploadDragPanel-body']";
	public String ValidationModeConfr_xpath ="//div[text()='Confirmation']";
	public String ValidationModeYes_xpath ="//span[text()='Yes']";
	public String ValidationModeNo_xpath = "//span[text()='No']";
	public String ConfirmInstance_xpath="//div[text()='Confirmation']";
	public String InstanceToTranspage_xpath="//span[text()='Yes']";
	
	
	//**************************************************End of File Upload Objects******************************************************
	
	
	//**************************************************TransList Page Objects*************************************************************
	public String getinstanceid_xpath ="//div[@id='uploadGrid-body']/div/div[2]/table/tbody/tr[1]/td/div/a";
	public String getFileNameRT_xpath="//div[@id='uploadGrid-body']/div/div[2]/table/tbody/tr[1]/td[2]/div";
	
	
	
	public String Transpagehdr_xpath = "//div[text()='List of Transactions']";
	public String RefreshiconTrans_xpath="//div[@id='buttonPanelId-innerCt']/div[1]/div[@aria-label='Refresh button']";
	public String TransInstanceStatus_xpath="//div[@id='summaryGrid-body']/div/div/table/tbody/tr/td[5]/div";
	public String TransEntityStatusRT_xpath ="//div[@id='entityGrid-bodyWrap']/div[2]/div/div[2]/table/tbody/tr/td[1]/div";
	public String TransEditLink_xpath="//a/sup[contains(text(),'Edit')]";
	public String TransListEntityError ="//div[@class='x-grid-item-container']/table/tbody/tr/td/div/form/select/option";
	
	
	public String LoadToWorkdaybtn_xpath ="//span[contains(text(),'Load to Workday')]";
	public String LoadToWorkdayDialogbx_xpath ="//div[contains(text(),'Load To Work Day')]";
	public String LoadToWorkdaydialogYes_xpath ="//span[contains(text(),'Yes')]";
	public String LoadToWorkdaydialogNo_xpath ="//span[contains(text(),'No')]";
	public String DetailsLnkLoadedEntity_xpath="(//td/div[contains(text(),'Loaded')])[2]/following::td/div/a/sup[contains(text(),'Details')]";
	
	////div[@id='entityGrid-bodyWrap']/div[2]/div/div[2]/table/tbody/tr/td[1]/div[contains(text(),'Loaded')]/following::td[1]/div/a/sup[contains(text(),'Details')]
	
	
	//a/sup[contains(text(),'Details')]/ancestor::tr/td/div[contains(text(),'Loaded')]
	
	
	
	//TransList Page 
	
	public String TransListHdr_xpath= "//div[text()='List of Transactions']";
	public String TransListEntityList_xpath="//div[@id='entityGrid-body']";
	public String TransListEntitieListRow_xpath="//div[@id='entityGrid-body']/div/div[2]/table/tbody/tr";
	
	public String PreValidatSuccessfulRow_xpath="//tbody/tr/td/div[text()='Pre-validation Successful']";
	public String PreValidSuccessfulCol_xpath="//div[text()='Pre-validation Successful']";
	public String AnchrSupStatus_xpath="//a[@class='blueanchor']/sup";
	public String EntityStatSupEdit_xpath="//a[@class='blueanchor']/sup[text()='Edit']";
	public String EntityStatSupDetails_xpath="//a[@class='blueanchor']/sup[text()='Details']";
	
	public String PreValidatFailedRow_xpath="//table/tbody/tr/td/div/form/select/option[text()='Pre-validation Failed']";
	
	public String ValidationErrorRow_xpath="//table/tbody/tr/td/div/form/select/option[text()='Validation Error']";
	public String TransactionNum_xpath="//table/tbody/tr/td/div/form/select/option[text()='Validation Error']/following::a/sup[contains(text(),'Edit')]/ancestor::div[@class='x-grid-cell-inner ']";	
	public String TransNum_xpath="//a/sup[contains(text(),'Edit')]/ancestor::div[@class='x-grid-cell-inner ']";
	public String TransListEditLink ="//a/sup[text()='Edit']";
	
	
	
	

	
	//Trans Details page
	public String TransDetailHeadr_xpath="//div[contains(text(),'Trans Details')]";
	public String TransDtlCurrntErrorHdr_xpath ="//span[contains(text(),'Current Errors')]";
	public String TransDtlShowAllChbx_xpath="//input[@id='checkID-inputEl']";
	
	public String TransDetlWID_xpath="//span[contains(text(),'Workday Result WID:')]/following::div/div";
	//full panel =//div[@class='x-panel x-panel-default x-grid']
	public String TransDtlCrntErrorsRow_xpath="//div[@id='rulePanel-body']/div/div[2]/table/tbody/tr";
	public String TransDtlCrntErrorsCol_xpath="//div[@id='rulePanel-body']/div/div[2]/table/tbody/tr/td[2]";
	public String TransDtlCrntErrorMsg_xpath="//div[@id='rulePanel-body']/div/div[2]/table/tbody/tr/td[2]/div";
	public String TransDtlErrormsgCount_xpath="//div[@id='rulePanel-body']/div/div[2]/table";
	public String TransDtlBackBtn_xpath="//span[text()='Back']";
	public String TransDtl_MaxErrorSec_xpath="//div[@aria-label='Error Log']";
	
	//Logout Function Objects
	public String Userprobtn_xpath="//span[@id='userProfileButton-btnIconEl']";
	public String logout_xpath="//span[contains(text(),'Logout')]";
	public String logoutdialogbox_xpath="//div[contains(text(),'Logout?')]";
	public String logoutdialogbxYes_xpath="//span[contains(text(),'Yes')]";
	
	
	//Workday Objects
	public String WDUserNametxtbox_xpath="//div[contains(text(),'Username')]/following-sibling::input";
	public String WDpwdtxbox_xpath="//div[contains(text(),'Password')]/following-sibling::input";
	public String WDSigInbtx_xpath="//button[contains(text(),'Sign In')]";
	public String WDDeviceRembdiabx_xpath="//h1[contains(text(),'Remember Device?')]";
	public String WDDeviceRembSkip_xpath="//button[contains(text(),'Skip')]";
	
	public String WDSearchtxtbx_xpath="//input[@type='search']";
	public String WDResult_xpath="//div[starts-with(@id,'promptOption-gwt-uid')]";
	public String OverallStatuslbl_xpath="//label[contains(text(),'Overall Status')]";
	public String OverallStatvalue_xpath="//div/label[contains(text(),'Overall Status')]/following::div[2]/div/div";
	
	//Process Tab
	String WDProcesstab_xpath="//div[@class='WAP1 WBP1']/div[contains(text(),'Process')]";
	String WDProcessHstrylbl_xpath="//span[contains(text(),'Process History')]";
	String WDProcessTable_xpath="//table[@class='mainTable']";
	String WDProcessTabRow_xpath="//*[@class='mainTable']/tbody/tr";
	String WDProcessTabCol_xpath="//*[@class='mainTable']/tbody/tr/td";
	
	
	
	
	//Logout 
	String WDlogouticon_xpath="//button[@data-automation-id='Current_User']";
	String WDSignoutbtn_xpath="//button[contains(text(),'Sign Out')]";
	
	
	//**************************************************EC Objects*************************************************************
	
	
	public String ECEnterCompanyIdtxtbx_xpath = "//input[@placeholder='Enter Company ID']";
	public String ECCompanyIdSubmitbtn_xpath = "//span[@id='__button0-img']";
	
	public String ECUserNametxt_name = "username";
	public String ECPasswrdtxt_name = "password";
	public String ECLoginbtn_xpath="//button[@id='__button2']";
	
	public String ECSearchtxtbx_xpath="//input[@type='search']";
	public String ECEmployeeExpandicon_xpath="//span[@id='__select0-icon']";
	
	public String ECJobInfoheader_xpath ="//bdi[text()='Job Information']//parent::span[@class='sapMBtnContent']";
	public String ECPortletslistbx_xpath="//ul[@id='__list0']/li";
	public String ECPortletCompInfo_xpath="//ul[@id='__list0']/li[text()='Compensation Information']";
	
	public String ECCompInfoHistorybtn_xpath ="//button[@title='Compensation Information History']";
	
	
	
	//History 
	
	public String ECRecordEventDateList_xpath ="//div[@class='sapMLIBContent']/div/div/div/span";
	public String ECReocrdEventDate_xpath = "//div[@class='sapMLIBContent']/div/div/div/span[1]";
	
	public String ECEventReasonlbl_xpath ="//span[text()='Event Reason']";
	public String ECPayCompValue_xpath ="(//span[text()='Base Salary (PC-GBL0001)']//parent::td/following-sibling::td[2]/span)[1]";
	
	
	
	
	//div[@id='splitContainer-Master']//parent::div[@id='splitContainer']
	//div[@id='splitContainer-Detail']//parent::div[@id='splitContainer']
	
	
	
	
	//**************************************************EC Objects*************************************************************
	
	
	
	
	
	
	
	
}