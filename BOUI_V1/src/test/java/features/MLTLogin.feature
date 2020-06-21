Feature: BOUI Pepsi QA

@MLTLogin
Scenario: Login MLT
Given LoginPage 
When EnterUserName
Then Details 


@MLTLogin
Scenario Outline: Global Search the Instance Id
Given User in the Home Page
When Search the file for  <Transaction> with the <InstanceId>
And User in the Transaction detail page
Then Login the EC
And Search the Employee Id

Examples:
|Transaction|InstanceId|
|BasePay    |100013092|
|BankInfo   |100013990| 
