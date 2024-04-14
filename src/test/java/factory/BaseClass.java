package factory;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	static WebDriver driver;
    static Properties p;
    static Logger logger;
    static JavascriptExecutor js;
 	     
	public static WebDriver initilizeBrowser() throws IOException
	{
		// Grid implementation if environment is remote
		if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//OS selection with the help of DesiredCapabilities class
			if (getProperties().getProperty("os").equalsIgnoreCase("windows")) 
			{
			    capabilities.setPlatform(Platform.WIN11);
			} 
			else 
			{
			    System.out.println("No matching OS..");
			}
			
			//Browser selection with the help of DesiredCapabilities class
			if (getProperties().getProperty("browser").equalsIgnoreCase("chrome")) {
			        capabilities.setBrowserName("chrome");
			}
			else if(getProperties().getProperty("browser").equalsIgnoreCase("edge")) {
			        capabilities.setBrowserName("MicrosoftEdge");
			}
			else {
			        System.out.println("No matching browser");
			}
	      
			//Specifying the hub url on which the hub is running
	       driver = new RemoteWebDriver(new URL("http://192.168.1.7:4444"),capabilities);
			
		}
		
		// If environment is local
		else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))
			{
				if(getProperties().getProperty("browser").equalsIgnoreCase("chrome")) 
				{
			        driver=new ChromeDriver();
				}
				else if(getProperties().getProperty("browser").equalsIgnoreCase("edge")){
			    	driver=new EdgeDriver();
				}
				else {
			        System.out.println("No matching browser");
				}
			}
		
		 driver.manage().deleteAllCookies(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 
		 return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static Properties getProperties() throws IOException
	{	
		//Script to load the Properties file
	   FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\DataProperties.properties");	
	   p=new Properties();
	   p.load(file);
	   return p;
	}
	
	public static Logger getLogger() 
	{	
		//Loading the log4j2 file
		logger=LogManager.getLogger(); //Log4j
		return logger;
	}
	
	public static String randomString() {
		
		//Generates random String
		String generateString = RandomStringUtils.randomAlphabetic(7);
		return generateString;
	}
	public static String randomNumber() {
		
		//Generates the Random Number
		String generateString = "9" + RandomStringUtils.randomNumeric(9);
		return generateString;
	}

	public void Scroll(WebElement e) {
		
		//To Scroll unto a particular WebElement
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments [0].scrollIntoView();", e);
	}

}
