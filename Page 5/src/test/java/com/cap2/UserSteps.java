package com.cap2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cap1.Education;
import com.cap1.Home;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserSteps {

	WebDriver driver;
	Home h;
	Education e;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHANUMCH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 h=new Home(driver);
		 e=new Education(driver);
	}
	
@Given("^User is on Personal details Form page$")
public void user_is_on_Personal_details_Form_page() throws Throwable {
	driver.get("C:/Users/BHANUMCH/Downloads/SET03/WebPages/PersonalDetails.html");
}

@Then("^Title should be 'Personal Details'$")
public void title_should_be_Personal_Details() throws Throwable {
	assertEquals("Personal Details", driver.getTitle());
}

@When("^Next button is clicked without entering First Name$")
public void next_button_is_clicked_without_entering_First_Name() throws Throwable {
	h.getFirstName().sendKeys("");
		h.next().click(); 
    
}

@Then("^alert message should be displayed as 'Please fill the First Name'$")
public void alert_message_should_be_displayed_as_Please_fill_the_First_Name() throws Throwable {
		
		  Alert alert = driver.switchTo().alert();
		  assertEquals("Please fill the First Name", alert.getText()); 
		  alert.accept();
		 
    h.getFirstName().sendKeys("BHANU MANOJ");
   
    
}

@When("^Next button is clicked without entering Last Name$")
public void next_button_is_clicked_without_entering_Last_Name() throws Throwable {
	h.getLastName().sendKeys("");
	h.next().click();
}

@Then("^alert message should be displayed as 'Please fill the Last Name'$")
public void alert_message_should_be_displayed_as_Please_fill_the_Last_Name() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please fill the Last Name", alert.getText());
    alert.accept();
    h.getLastName().sendKeys("CHANDRAPATI");
    
	
}

@When("^Next button is clicked without entering Email$")
public void next_button_is_clicked_without_entering_Email() throws Throwable {
	h.getEmail().sendKeys("");
	h.next().click();
	
}

@Then("^alert message should be displayed as 'Please fill the Email'$")
public void alert_message_should_be_displayed_as_Please_fill_the_Email() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please fill the Email", alert.getText());
    alert.accept();
	
	
    h.getEmail().sendKeys("chbhanu");
    
	
}

@When("^Next button is clicked without entering valid Email$")
public void next_button_is_clicked_without_entering_valid_Email() throws Throwable {
	h.next().click();
}


@Then("^alert message should be displayed as 'Please enter valid Email Id\\.'$")
public void alert_message_should_be_displayed_as_Please_enter_valid_Email_Id() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please enter valid Email Id.", alert.getText());
    alert.accept();
    h.getEmail().clear();
    h.getEmail().sendKeys("ch.bhanumanoj@gmail.com");
    
}


@When("^Next button is clicked without entering Contact Number$")
public void next_button_is_clicked_without_entering_Contact_Number() throws Throwable {
	h.getPhone().sendKeys("");
	h.next().click();
	
}

@Then("^alert message should be displayed as 'Please fill the Contact No\\.'$")
public void alert_message_should_be_displayed_as_Please_fill_the_Contact_No() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please fill the Contact No.", alert.getText());
    alert.accept();
    h.getPhone().sendKeys("646651");
  }

@When("^Next button is clicked without entering Valid Contact Number$")
public void next_button_is_clicked_without_entering_Valid_Contact_Number() throws Throwable {
	h.next().click();
}

@Then("^alert message should be displayed as 'Please enter valid Contact no\\.'$")
public void alert_message_should_be_displayed_as_Please_enter_valid_Contact_no() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please enter valid Contact no.", alert.getText());
    alert.accept();
    h.getPhone().clear();
    h.getPhone().sendKeys("9949155563");
    
}


@When("^Next button is clicked without  Valid Address Line (\\d+)$")
public void next_button_is_clicked_without_Valid_Address_Line(int arg1) throws Throwable {
	h.getAddress1().sendKeys("");
	h.next().click();
    
}

@Then("^alert message is displayed as 'Please fill the address line (\\d+)'$")
public void alert_message_is_displayed_as_Please_fill_the_address_line(int arg1) throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please fill the address line 1", alert.getText());
    alert.accept();
    h.getAddress1().sendKeys("Ammi Setty");
   
    
}

@When("^Next is clicked without entering Valid Address Line (\\d+)$")
public void next_is_clicked_without_entering_Valid_Address_Line(int arg1) throws Throwable {
	h.getAddress2().sendKeys("");
	h.next().click();
    
}

@Then("^alert message be displayed as 'Please fill the address line (\\d+)'$")
public void alert_message_be_displayed_as_Please_fill_the_address_line(int arg1) throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please fill the address line 2", alert.getText());
    alert.accept();
    h.getAddress2().sendKeys("Gandhi Road");
   
    
}



@When("^Next button is clicked without selecting City$")
public void next_button_is_clicked_without_selecting_City() throws Throwable {
	h.getCity().sendKeys("");
	h.next().click();
    
}

@Then("^alert message should be displayed as 'Please select city'$")
public void alert_message_should_be_displayed_as_Please_select_city() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please select city", alert.getText());
    alert.accept();
    h.getCity().sendKeys("Pune");
   
}

@When("^Next button is clicked without selecting State$")
public void next_button_is_clicked_without_selecting_State() throws Throwable {
	h.getState().sendKeys("");
	h.next().click();
    
}

@Then("^alert message should be displayed as 'Please select state'$")
public void alert_message_should_be_displayed_as_Please_select_state() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Please select state", alert.getText());
    alert.accept();
    h.getState().sendKeys("Maharashtra");
   
}

@When("^Next button is clicked after entering valid details$")
public void next_button_is_clicked_after_entering_valid_details() throws Throwable {
	h.next().click();
}

@Then("^alert message should be displayed as 'Personal details are validated and accepted successfully'$")
public void alert_message_should_be_displayed_as_Personal_details_are_validated_and_accepted_successfully() throws Throwable {
	Alert alert = driver.switchTo().alert();
	assertEquals("Personal details are validated and accepted successfully.", alert.getText());
    alert.accept();
    //h.next().click();
}

@Given("^User is on Educational details Form page$")
public void user_is_on_Educational_details_Form_page() throws Throwable {
    driver.get("file:///C:/Users/BHANUMCH/Downloads/SET03/WebPages/EducationalDetails.html");
}

@Then("^Title should be 'Education Details'$")
public void title_should_be_Education_Details() throws Throwable {
	assertEquals("Educational Details", driver.getTitle());
 
}

@When("^Register button is clicked without entering Graduation$")
public void register_button_is_clicked_without_entering_Graduation() throws Throwable {
	e.getGraduation().sendKeys("");
	e.getRegisterme().click(); 
 
}

@Then("^alert message should be displayed as 'Please Select Graduation'$")
public void alert_message_should_be_displayed_as_Please_Select_Graduation() throws Throwable {
	 Alert alert = driver.switchTo().alert();
	  assertEquals("Please Select Graduation", alert.getText()); 
	  alert.accept();
	 
e.getGraduation().sendKeys("BE");
 
}

@When("^Register button is clicked without entering Percentage\\*$")
public void register_button_is_clicked_without_entering_Percentage() throws Throwable {
	e.getPercentage().sendKeys("");
	e.getRegisterme().click(); 
 
 
}

@Then("^alert message should be displayed as 'Please fill Percentage detail'$")
public void alert_message_should_be_displayed_as_Please_fill_Percentage_detail() throws Throwable {
	Alert alert = driver.switchTo().alert();
	  assertEquals("Please fill Percentage detail", alert.getText()); 
	  alert.accept();
	 
e.getPercentage().sendKeys("8.07");
}

@When("^Register button is clicked without entering Passing Year$")
public void register_button_is_clicked_without_entering_Passing_Year() throws Throwable {
	e.getPassingYear().sendKeys("");
	e.getRegisterme().click(); 
 
}

@Then("^alert message should be displayed as 'Please fill Passing Year'$")
public void alert_message_should_be_displayed_as_Please_fill_Passing_Year() throws Throwable {
	Alert alert = driver.switchTo().alert();
	  assertEquals("Please fill Passing Year", alert.getText()); 
	  alert.accept();
	 
e.getPassingYear().sendKeys("2019");
 }

@When("^Register button is clicked without entering Project Name$")
public void register_button_is_clicked_without_entering_Project_Name() throws Throwable {
	e.getProjectName().sendKeys("");
	e.getRegisterme().click(); 
 
}

@Then("^alert message should be displayed as 'Please fill Project Name'$")
public void alert_message_should_be_displayed_as_Please_fill_Project_Name() throws Throwable {
	Alert alert = driver.switchTo().alert();
	  assertEquals("Please fill Project Name", alert.getText()); 
	  alert.accept();
	 
e.getProjectName().sendKeys("Education");
}

@When("^Register button is clicked without entering Technologies Used$")
public void register_button_is_clicked_without_entering_Technologies_Used() throws Throwable {
	e.getJava().sendKeys("");
	e.getRegisterme().click(); 
 
 }

@Then("^alert message should be displayed as 'Please Select Technologies Used'$")
public void alert_message_should_be_displayed_as_Please_Select_Technologies_Used() throws Throwable {
	Alert alert = driver.switchTo().alert();
	  assertEquals("Please Select Technologies Used", alert.getText()); 
	  alert.accept();
	 
e.getJava().click();
}

@When("^Register button is clicked after entering registration details$")
public void register_button_is_clicked_after_entering_registration_details() throws Throwable {
	
	e.getRegisterme().click(); 
 
 
}

@Then("^alert message should be displayed as 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!'$")
public void alert_message_should_be_displayed_as_Your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link() throws Throwable {
	Alert alert = driver.switchTo().alert();
	  assertEquals("Your Registration Has succesfully done Plz check you registerd email for account activation link !!!", alert.getText()); 
	  alert.accept();
	 

}


}
