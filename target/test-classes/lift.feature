Feature: Verifying lift processes
Scenario: verify lift working properly or not

Given go to lift
When click on open button
Then open the doors
When click on floor number button 5
Then close the doors
And lift go to given number floor