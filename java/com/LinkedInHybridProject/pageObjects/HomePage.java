package com.LinkedInHybridProject.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver ldriver;
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"global-nav-typeahead\"]/input")
	@CacheLookup
	WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"search-reusables__filters-bar\"]/ul/li[1]/button")
	@CacheLookup
	WebElement viewpage;
	
	@FindBy(xpath="//*[@id=\"results-list__title\"]")
	@CacheLookup
	WebElement textname;
	
	@FindBy(xpath="//*[@id=\"search-reusables__filters-bar\"]/ul/li[1]/button")
	@CacheLookup
	WebElement peoplebtn;
	
	public void setSearchbox(String username)
	{
		searchbox.sendKeys(username);
		searchbox.sendKeys(Keys.ENTER);
	} 
	
	public void setViewPagebtn()
	{
		viewpage.click();
	} 
	
	public void settextname()
	{
		if(textname.isDisplayed()==true)
		{
			System.out.println("Text is present under Job tab");
		}
	} 
	//setting the people
	public void setPeoplebtn()
	{
		peoplebtn.click();
	} 
}
