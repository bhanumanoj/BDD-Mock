package com.cap1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Education {
	
	WebDriver driver;

	public Education(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

		
	@FindBy(name="graduation")
    WebElement graduation;
	
	@FindBy(name="percentage")
    WebElement percentage;
	
	@FindBy(name="passingYear")
    WebElement passingYear;

	@FindBy(name="projectName")
    WebElement projectName;

	@FindBy(xpath="/html/body/form/table/tbody/tr[6]/td[2]/input[2]")
    WebElement java;

	@FindBy(name="otherTechnologies")
    WebElement othertechnologies;
	
	@FindBy(xpath="//*[@id=\"btnRegister\"]")
    WebElement registerme;
	
	
	public WebElement getGraduation() {
		return graduation;
	}

	public WebElement getPercentage() {
		return percentage;
	}

	public WebElement getPassingYear() {
		return passingYear;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getJava() {
		return java;
	}

	public WebElement getOthertechnologies() {
		return othertechnologies;
	}
	
	public WebElement getRegisterme()
    {
        return registerme;
    }
	    

}
