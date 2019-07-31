Feature: Aptara leave portal login using dataTable with maps

Scenario: Loged home page test scenario with dataTable for first time
Given user have reached at login page for login
When now user enter username and password
| A6019 | mohanpur@12345 |
Then after login user is on home page
Then now user check their attendance
Then after check the attendance user does logout

Scenario: Loged home page test scenario with dataTable for second time
Given user again is on login page for login
Then again user enter username and password for relogin
|UserName | Password       |
| A6019   | mohanpur@12345 |
Then after check user heve to be logout again