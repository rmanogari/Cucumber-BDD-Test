
package Pepsi;

public class PageObjectO2{
	
	//*************************************Login Page Objects******************************************************************
	//QA - O2 Login
	String userNametxtbx_xpath = "//input[@id='emailID-inputEl']";
	String pwdtxtbx_xpath="//input[@id='password-inputEl']";
	String loginbtn_xpath="//span[@id='loginButton-btnInnerEl']";
	String clntSlctnO2base_id ="button-1016-btnIconEl";
	String clntSlctnO2base_xpath ="//span[@id='button-1017-btnIconEl']";
	String clienSlctntHIG_id="button-1017-btnIconEl";
	String appLoggedalready_xpath="//div[text()='User already logged. Please close other sessions and try again.']";
	String oKbtn_alreadylogged_xpath="//span[text()='OK']";
	
	//QC - O2 Login
	String HIGIconQC_id ="button-1016-btnIconEl";
	
	//************************************End of Login Page Objects*************************************************************
	
	
	//****************************************Global Search Objects***********************************************************
	
	String globalSearchtxtbx_xpath="//div[@id='elasticSearchText-inputWrap']";
	String globalSearchicon_xpath="//a[@role='button']/following::span[@id='elasticSearch-btnWrap']";
	String glblSearchResulst_xpath="//div[text()='Search Results']";
	String glblExpand_xpath="//div[@class='x-grid-group-title']";
	String glblEditicon_xpath="//b[starts-with(@onclick,'loadTransDetailPage')]";
	
	
	
	
	
	
	//************************************End of Global Search Objects*************************************************************
	
	
	
	
	
	//***************************************File Definition Creation Objects****************************************************
	//File Definition Creation
	String fileconfigbtn_id="mltStgConfigButton-btnIconEl";
	String Oldfiledef_xpathold="//table[@id='treeview-1032-record-42']/tbody/tr/td/div/span[text()='File Definitions']";
	
	String filedef_xpath ="//span[text()='File Definitions']";
	String filedefconfirpage_xpath="//span[text()='File Definition Name']";
	
	//Put Applicant
	String createPutApp_xpath="//div[@data-qtip='Create Put Applicant']";
	String headerCreationpage_xpath="//div[text()='Enter new file details']";
	
	//Mandatory fields for File Definition Creation
	String CreateFileName_xpath ="//input[@id='fileName-inputEl']";
	String FileDescription_xpath = "//input[@id='fileDefnDescr-inputEl']";
	
	String Fileformatdrop_xpath="//div[@id='fileFormatCombo-trigger-picker']";
	String Fileformatoptions_xpath="//div[@id='fileFormatCombo-picker']/div/ul/li";
	String SelectFileformatopt_xpath = "//div[@id='fileFormatCombo-picker']/div/ul/li";

	String transFileFormat_xpath = "//input[@id='fileFormatCombo-inputEl']";
	String transFileFormat1_xpath = "//ul[@class='x-list-plain']/li[contains(text(),'Excel File')]";
	
	String validationmode_xpath="//div[@id='ValModeCombo-trigger-picker']";
	String validationmodeoptns_xpath="//div[@id='ValModeCombo-picker-listWrap']/ul/li";
	String validationmodeYes_xpath="//div[@id='ValModeCombo-picker-listWrap']/ul/li[text()='Yes']";
	
	String transHeaderChbox_xpath = "//input[@id='headerInd-inputEl']";
	String transHeaderNumberLines_xpath = "//input[@id='headerCount-inputEl']";
	String fileDefNxtpagebtn_xpath="//div[@id='fileDefNextPageId']";
	
	//Field Required selection Page
	String headerfieldreqpage_xpath ="//div[text()='Enter details of fields in the new file']";
	String wholepage_xpath ="//div[@id='finalCardPanel']";
	
	
	String spreadshtslctn_xpath="//*[text()='SPREADSHEET_KEY']/following::td[4]";
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
	String fileUploadicon_id ="mltFileUploadButton-btnIconEl";
	String fileUploadbtn_xpath="//span[text()='File Upload']";
	String Headertxtfileupload_id="fileSelectPanel_header-title-textEl";
	String FileUploadlink_xpath="//div[@id='fileUploadDragPanel-body']";
	String ValidationModeConfr_xpath ="//div[text()='Confirmation']";
	String ValidationModeYes_xpath ="//span[text()='Yes']";
	String ValidationModeNo_xpath = "//span[text()='No']";
	String ConfirmInstance_xpath="//div[text()='Confirmation']";
	String InstanceToTranspage_xpath="//span[text()='Yes']";
	
	
	//**************************************************End of File Upload Objects******************************************************
	
	
	//**************************************************TransList Page Objects*************************************************************
	String getinstanceid_xpath ="//div[@id='uploadGrid-body']/div/div[2]/table/tbody/tr[1]/td/div/a";
	String getFileNameRT_xpath="//div[@id='uploadGrid-body']/div/div[2]/table/tbody/tr[1]/td[2]/div";
	
	
	
	String Transpagehdr_xpath = "//div[text()='List of Transactions']";
	String RefreshiconTrans_xpath="//div[@id='buttonPanelId-innerCt']/div[1]/div[@aria-label='Refresh button']";
	String TransInstanceStatus_xpath="//div[@id='summaryGrid-body']/div/div/table/tbody/tr/td[5]/div";
	String TransEntityStatusRT_xpath ="//div[@id='entityGrid-bodyWrap']/div[2]/div/div[2]/table/tbody/tr/td[1]/div";
	String TransEditLink_xpath="//a/sup[contains(text(),'Edit')]";
	String TransListEntityError ="//div[@class='x-grid-item-container']/table/tbody/tr/td/div/form/select/option";
	
	
	String LoadToWorkdaybtn_xpath ="//span[contains(text(),'Load to Workday')]";
	String LoadToWorkdayDialogbx_xpath ="//div[contains(text(),'Load To Work Day')]";
	String LoadToWorkdaydialogYes_xpath ="//span[contains(text(),'Yes')]";
	String LoadToWorkdaydialogNo_xpath ="//span[contains(text(),'No')]";
	String DetailsLnkLoadedEntity_xpath="(//td/div[contains(text(),'Loaded')])[2]/following::td/div/a/sup[contains(text(),'Details')]";
	
	////div[@id='entityGrid-bodyWrap']/div[2]/div/div[2]/table/tbody/tr/td[1]/div[contains(text(),'Loaded')]/following::td[1]/div/a/sup[contains(text(),'Details')]
	
	
	//a/sup[contains(text(),'Details')]/ancestor::tr/td/div[contains(text(),'Loaded')]
	
	
	
	//TransList Page 
	
	String TransListHdr_xpath= "//div[text()='List of Transactions']";
	String TransListEntityList_xpath="//div[@id='entityGrid-body']";
	String TransListEntitieListRow_xpath="//div[@id='entityGrid-body']/div/div[2]/table/tbody/tr";
	
	String PreValidatSuccessfulRow_xpath="//tbody/tr/td/div[text()='Pre-validation Successful']";
	String PreValidSuccessfulCol_xpath="//div[text()='Pre-validation Successful']";
	String AnchrSupStatus_xpath="//a[@class='blueanchor']/sup";
	String EntityStatSupEdit_xpath="//a[@class='blueanchor']/sup[text()='Edit']";
	String EntityStatSupDetails_xpath="//a[@class='blueanchor']/sup[text()='Details']";
	
	String PreValidatFailedRow_xpath="//table/tbody/tr/td/div/form/select/option[text()='Pre-validation Failed']";
	
	String ValidationErrorRow_xpath="//table/tbody/tr/td/div/form/select/option[text()='Validation Error']";
	String TransactionNum_xpath="//table/tbody/tr/td/div/form/select/option[text()='Validation Error']/following::a/sup[contains(text(),'Edit')]/ancestor::div[@class='x-grid-cell-inner ']";	
	String TransNum_xpath="//a/sup[contains(text(),'Edit')]/ancestor::div[@class='x-grid-cell-inner ']";
	String TransListEditLink ="//a/sup[text()='Edit']";
	
	
	
	

	
	//Trans Details page
	String TransDetailHeadr_xpath="//div[contains(text(),'Trans Details')]";
	String TransDtlCurrntErrorHdr_xpath ="//span[contains(text(),'Current Errors')]";
	String TransDtlShowAllChbx_xpath="//input[@id='checkID-inputEl']";
	
	String TransDetlWID_xpath="//span[contains(text(),'Workday Result WID:')]/following::div/div";
	//full panel =//div[@class='x-panel x-panel-default x-grid']
	String TransDtlCrntErrorsRow_xpath="//div[@id='rulePanel-body']/div/div[2]/table/tbody/tr";
	String TransDtlCrntErrorsCol_xpath="//div[@id='rulePanel-body']/div/div[2]/table/tbody/tr/td[2]";
	String TransDtlCrntErrorMsg_xpath="//div[@id='rulePanel-body']/div/div[2]/table/tbody/tr/td[2]/div";
	String TransDtlErrormsgCount_xpath="//div[@id='rulePanel-body']/div/div[2]/table";
	String TransDtlBackBtn_xpath="//span[text()='Back']";
	String TransDtl_MaxErrorSec_xpath="//div[@aria-label='Error Log']";
	
	//Logout Function Objects
	String Userprobtn_xpath="//span[@id='userProfileButton-btnIconEl']";
	String logout_xpath="//span[contains(text(),'Logout')]";
	String logoutdialogbox_xpath="//div[contains(text(),'Logout?')]";
	String logoutdialogbxYes_xpath="//span[contains(text(),'Yes')]";
	
	
	//Workday Objects
	String WDUserNametxtbox_xpath="//div[contains(text(),'Username')]/following-sibling::input";
	String WDpwdtxbox_xpath="//div[contains(text(),'Password')]/following-sibling::input";
	String WDSigInbtx_xpath="//button[contains(text(),'Sign In')]";
	String WDDeviceRembdiabx_xpath="//h1[contains(text(),'Remember Device?')]";
	String WDDeviceRembSkip_xpath="//button[contains(text(),'Skip')]";
	
	String WDSearchtxtbx_xpath="//input[@type='search']";
	String WDResult_xpath="//div[starts-with(@id,'promptOption-gwt-uid')]";
	String OverallStatuslbl_xpath="//label[contains(text(),'Overall Status')]";
	String OverallStatvalue_xpath="//div/label[contains(text(),'Overall Status')]/following::div[2]/div/div";
	
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
	
	
	String ECEnterCompanyIdtxtbx_xpath = "//input[@placeholder='Enter Company ID']";
	String ECCompanyIdSubmitbtn_xpath = "//span[@id='__button0-img']";
	
	String ECUserNametxt_name = "username";
	String ECPasswrdtxt_name = "password";
	String ECLoginbtn_xpath="//button[@id='__button2']";
	
	String ECSearchtxtbx_xpath="//input[@type='search']";
	String ECEmployeeExpandicon_xpath="//span[@id='__select0-icon']";
	
	String ECJobInfoheader_xpath ="//bdi[text()='Job Information']//parent::span[@class='sapMBtnContent']";
	String ECPortletslistbx_xpath="//ul[@id='__list0']/li";
	String ECPortletCompInfo_xpath="//ul[@id='__list0']/li[text()='Compensation Information']";
	
	String ECCompInfoHistorybtn_xpath ="//button[@title='Compensation Information History']";
	
	
	
	//History 
	
	String ECRecordEventDateList_xpath ="//div[@class='sapMLIBContent']/div/div/div/span";
	String ECReocrdEventDate_xpath = "//div[@class='sapMLIBContent']/div/div/div/span[1]";
	
	String ECEventReasonlbl_xpath ="//span[text()='Event Reason']";
	String ECPayCompValue_xpath ="(//span[text()='Base Salary (PC-GBL0001)']//parent::td/following-sibling::td[2]/span)[1]";
	
	
	
	
	//div[@id='splitContainer-Master']//parent::div[@id='splitContainer']
	//div[@id='splitContainer-Detail']//parent::div[@id='splitContainer']
	
	
	
	
	//**************************************************EC Objects*************************************************************
	
	
	
	
	
	
	
	
}