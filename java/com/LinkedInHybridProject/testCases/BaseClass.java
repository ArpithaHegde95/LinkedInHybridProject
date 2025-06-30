package com.LinkedInHybridProject.testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.LinkedInHybridProject.utilities.ReadConfig;
//started
public class BaseClass 
{
    ReadConfig readconfig=new ReadConfig();
    public String baseUrl=readconfig.getApplicationURL();
    public String validusername=readconfig.getValidUserName();
    public String validpassword=readconfig.getValidPassword();
    public String invalidusername=readconfig.getInvalidUserName();
    public String invalidpassword=readconfig.getInvalidPassword();
    public String username=readconfig.getUserName();
    public String companyname=readconfig.getCompanyName();
    public static WebDriver driver;
   
    @Parameters("browser")
    @BeforeClass
    public void setUp(String br) throws Exception
    {
    	if(br.equals("chrome"))
    	{
    		driver=new ChromeDriver();
    		driver.get(baseUrl);
        	driver.manage().window().maximize();
    	}
    }
    @AfterClass
    public void tearDown()
    {
       driver.quit();
    }
}  
