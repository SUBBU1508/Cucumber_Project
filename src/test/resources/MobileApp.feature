Feature: Verifying mobile condition

Background:
Given Get the mobile
When switch on power button
Then Display the screen
@white
Scenario: verify mobile working properly

When click on the dial keypad 
Then open the keypad
When Type the numbers 
And click on the dial option
Then call farward to correspond mobile
And Ringing 
@black
Scenario: verify all built in apps working properly

When Click on any one of the app
Then To display that app
