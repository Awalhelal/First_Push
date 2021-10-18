@Regression 
Feature: Login function validation One 

Scenario Outline: Successful Login with Valid Credentials scenario Outline
	Given User able to open chrome browser 
	And  Put "https://www.zoopla.co.uk/" and go to login page 
	When User able to click Sign in button
	And User able to use valid username "awal.helal@gmail.com" 
	And User able to put valid  password "Abdulhelal@27" 
	And User able to click signin button 
	And closing the browser 
	
	Examples: 
		|URL							|userName				|password |
		|http://www.gcrit.com/build3/	|sarowerny@gmail.com	|student  |
		|http://www.gcrit.com/build3/	|smarttech@gmail.com	|smarttech|
		|http://www.gcrit.com/build3/	|smarttech@gmail.com	|smarttech|