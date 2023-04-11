Feature: Application Login

Scenario: Home page default login
Given Login to vtiger application
When User login to vtiger application with username and password 
Then HomePage should be displayed

Scenario: Home page default login
Given Login to vtiger application
When User login to vtiger application with username "admin" and password "admin"
Then HomePage should be displayed