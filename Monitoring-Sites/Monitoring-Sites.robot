*** Settings ***
Documentation  This is some basic info about the whole suite
Library  SeleniumLibrary
Library  Process

# Copy/paste the line below into Terminal to execute:
# robot -d results C:/QA/ProjectsGIT/UI-Tests/MyCornerCard.robot

*** Variables ***


*** Test Cases ***
Calling python script
	${result}=  run process  python  /Python Scripts/helloworld.py
	Should be equal as integers  ${result.rc}	0
	Should be equal as strings  ${result.stdout}  hello, world

Browser must open with Swagger Editor and Sprint Cloud
    [Documentation]  This is some basic info about the test
    [Tags]  Smoke
    Open Browser  http://localhost:9999/index.html  chrome
    Wait Until Page Contains  Swagger Editor
	
	Execute Javascript   window.open('http://localhost:8761/');
	#Wait Until Page Contains  System Status
    #Wait Until Page Contains Element  xpath=//*[@id="one"]/div/h1[1]
    #Page Contains Element  System Status
	
	Execute Javascript   window.open('http://localhost:8985/hystrix/monitor?stream=http://localhost:8987');
	#Wait Until Page Contains  Hystrix Stream
    #Wait Until Page Contains Element  xpath=//*[@id="one"]/div/h1[1]
    #Page Contains Element  Hystrix Stream

	Execute Javascript   window.open('http://localhost:9393/dashboard/index.html');
	
	
*** Keywords ***
