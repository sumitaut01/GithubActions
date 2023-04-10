package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test(groups = "SeleniumTest")
public class SeleniumTest {
	
	
		
	


		    private WebDriver driver;

		    @BeforeClass
		    public void setUp() {
		        // Set ChromeDriver path
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");//not needed in Github action

		        // Initialize Chrome driver
		    	
		    	WebDriverManager.chromedriver().setup();
		    	ChromeOptions options = new ChromeOptions();
		    	options.addArguments("--remote-debugging-port=9222");
		    	options.addArguments("--no-sandbox");
		    	options.addArguments("--disable-dev-shm-usage");
		    	WebDriver driver = new ChromeDriver(options);
		        driver = new ChromeDriver(options);
		        
		    }

		    @Test
		    public void testGoogleTitle() {
		        // Open Google
		        driver.get("https://www.google.com");

		        // Check title
		        String expectedTitle = "Google";
		        String actualTitle = driver.getTitle();
		        
		        System.out.println("Expected=>"+expectedTitle +" Actual=>"+actualTitle);
		        Assert.assertEquals(actualTitle, expectedTitle);
		    }

		    @AfterClass
		    public void tearDown() {
		        // Close browser
		        driver.quit();
		    }
		}

		
		
	


