Feature: This is a Personal details Form page

 


Scenario: User Entering invalid details in Personal details  Form

 

Given User is on Personal details Form page
Then Title should be 'Personal Details'

 

When Next button is clicked without entering First Name
Then alert message should be displayed as 'Please fill the First Name'

 

When Next button is clicked without entering Last Name
Then alert message should be displayed as 'Please fill the Last Name'

 

When Next button is clicked without entering Email
Then alert message should be displayed as 'Please fill the Email'



When Next button is clicked without entering valid Email 
Then alert message should be displayed as 'Please enter valid Email Id.'

 

When Next button is clicked without entering Contact Number
Then alert message should be displayed as 'Please fill the Contact No.'

 

When Next button is clicked without entering Valid Contact Number
Then alert message should be displayed as 'Please enter valid Contact no.'

 

When Next button is clicked without  Valid Address Line 1
Then alert message is displayed as 'Please fill the address line 1'

 

When Next is clicked without entering Valid Address Line 2
Then alert message be displayed as 'Please fill the address line 2'

 

When Next button is clicked without selecting City
Then alert message should be displayed as 'Please select city'

 


When Next button is clicked without selecting State
Then alert message should be displayed as 'Please select state'

 

When Next button is clicked after entering valid details
Then alert message should be displayed as 'Personal details are validated and accepted successfully'

Given User is on Educational details Form page
Then Title should be 'Education Details'

When Register button is clicked without entering Graduation
Then alert message should be displayed as 'Please Select Graduation'

When Register button is clicked without entering Percentage*
Then alert message should be displayed as 'Please fill Percentage detail'

When Register button is clicked without entering Passing Year
Then alert message should be displayed as 'Please fill Passing Year'

When Register button is clicked without entering Project Name
Then alert message should be displayed as 'Please fill Project Name'

When Register button is clicked without entering Technologies Used
Then alert message should be displayed as 'Please Select Technologies Used'

When Register button is clicked after entering registration details
Then alert message should be displayed as 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!'


