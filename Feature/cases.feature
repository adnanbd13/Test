@Search
Feature: In order to search for the video, user needs to visit YouTube
I want to be on the YouTube page and search for specific video

Scenario: postive test case

Given user is on the homepage
When user clicks on search
And enters video title
And clicks search
Then user will have the desired search results 

#Examples: 
#
#| firstname | | last name | | email 			 | | password | | confirm password |
#| Bill      | | John      | | BJohn91@aol.com | |  12345   | | 12345     |