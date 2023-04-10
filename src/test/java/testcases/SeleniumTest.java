package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	
		
	


		    private WebDriver driver;

		    @BeforeClass
		    public void setUp() {
		        // Set ChromeDriver path
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");//not needed in Github action

		        // Initialize Chrome driver
		        driver = new ChromeDriver();
		    }

		    @Test
		    public void testGoogleTitle() {
		        // Open Google
		        driver.get("https://www.google.com");

		        // Check title
		        String expectedTitle = "Google";
		        String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
		    }

		    @AfterClass
		    public void tearDown() {
		        // Close browser
		        driver.quit();
		    }
		}

		
		
	


