*** Settings ***
Documentation  This is some basic info about the whole suite
Library  SeleniumLibrary

# Copy/paste the line below into Terminal to execute:
# robot -d results C:/QA/ProjectsGIT/UI-Tests/MyCornerCard.robot

*** Variables ***


*** Test Cases ***
Browser must open with Swagger Editor and Sprint Cloud
    [Documentation]  This is some basic info about the test
    [Tags]  Smoke
    Open Browser  http://localhost:9999/index.html  chrome
    Wait Until Page Contains  Swagger Editor
	
	Execute Javascript   window.open('http://localhost:8761/');
	Wait Until Page Contains  System Status
    #Wait Until Page Contains Element  xpath=//*[@id="one"]/div/h1[1]
    Page Contains Element  System Status
	
	
*** Keywords ***
