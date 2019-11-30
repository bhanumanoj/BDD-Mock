package com.cap1;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;

public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	@FindBy(name="txtFN")
    WebElement firstName;
    
	@FindBy(name="txtLN")
    WebElement lastName;
   
	@FindBy(name="Email")
    WebElement email;
    
	@FindBy(name="Phone")
    WebElement phone;
    
	@FindBy(name="address1")
    WebElement address1;
    
	@FindBy(name="address2")
    WebElement address2;
	
	@FindBy(name="city")
    WebElement city;
    
	@FindBy(name="state")
    WebElement state;

	
	  @FindBy(xpath="/html/body/form/table/tbody/tr[11]/td/a") 
	  WebElement next;
	 
	
	
	/*@FindBy(xpath="/html/body/button")
	WebElement next;*/
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}
	
	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement next()
    {
        return next;
    }

	
	

	    
    
}


