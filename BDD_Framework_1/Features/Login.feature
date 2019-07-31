Feature: Aptara leave portal login with example keyword
Scenario Outline: leave portal login home page test scenario with example keyword
Given first user open the url
When user enter "<username>" and "<password>"
Then user is on home page
Then user check their attendance
Then After check their attendance user does logout
Examples: 
        | username |  password      |
        | A6019    | mohanpur@12345 |

        