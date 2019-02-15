Learning points
1. When looking for the chromedriver.exe, just download the latst zip and link to it as "/path/chromedriver" and not "/path/chromedriver.exe"
2. When getting the variable to test against, be sure when you should be setting the variable. My test failed because the sample code set the variale for the title before the google search was made.
3. For feature files, you can send just a single string as a string parameter eg. - Then I search for "weather tomorrow" on Google.
4. Intellij will automatically make a TestNg test even though u specify Junit.
5. To use TestNG, you'd need the testng.xml (dont mind the class name red), AbstractTestNGCucumberTests, edit the config for running it.
Need to suite, whole project, listeners set up (especially this one to create the test-output).

Tests to try. - https://www.guru99.com/selenium-tutorial.html
1. Basic search bar usage (Done)
2. Login, logout & wrong input
3. Pass in a bunch of data and it should be transformed to another set of data
