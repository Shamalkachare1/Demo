package TESTCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;

public class HomePage {  
  
    
	public static void main(String[] args) throws InterruptedException {  
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tnluser\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
    	WebDriver driver =new ChromeDriver();
    	ChromeOptions options = new ChromeOptions();
    	driver.get("https://console.uat.asians.group/#/domain/list");	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
  
		
		System.out.println("*********** Teste case 1,2,and 3 ****************************************");
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"kc-header-wrapper\"]/span")));
    	String pagetitle= driver.findElement(By.xpath("//*[@id=\"kc-header-wrapper\"]/span")).getText();
    	System.out.println(pagetitle);
    	
    	if(pagetitle.equalsIgnoreCase("Asians User System"))
        {
        	System.out.println("Page title is Asians User System and Test case Passed");
        }
        else
        {
        	System.out.println("Test case failed");
        }
    	
    	System.out.println("*********** Teste case Four ****************************************");
    	
    	String SignIn= driver.findElement(By.id("kc-page-title")).getText();
    	System.out.println(SignIn);
    	if(SignIn.equalsIgnoreCase("Sign in to your account"))
    		System.out.println("Test Case Passed");
    	else {
    		System.out.println("Test case failed");
			}
    	
    	
System.out.println("*********** Teste case Five ****************************************");
    	
    	driver.findElement(By.id("username")).sendKeys("Shamalkachare775@gmail.com");
    	System.out.println("User is able to provide the username");
    	driver.findElement(By.id("password")).sendKeys("cyz123@");
    	System.out.println("User is able to provide the password");
    	Thread.sleep(3);
    	System.out.println("Test Case Passed");
    	
System.out.println("*********** Teste case Six ****************************************");    	
    	
    	Boolean SignInBtn=driver.findElement(By.id("kc-login")).isEnabled();
    	if(SignInBtn==true)
    	{
    		System.out.println("Sign In Button is Enabled and Clickbale");
    	System.out.println("Test Case Passed");
    	}
    	else {
    		System.out.println("Sign In Button is disabled");
		}
    		
 System.out.println("*********** Teste case eight ****************************************");    	
 	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("password")).clear();	
	Thread.sleep(3);
	driver.findElement(By.id("kc-login")).submit();
	String errMsg= driver.findElement(By.id("input-error")).getText();
	System.err.println(errMsg +"\t Error msg is displayed");
	System.out.println("Test Case Passed");
 Thread.sleep(3);
 
 
 System.out.println("*********** Teste case Nine ****************************************");    	
	driver.findElement(By.id("username")).clear();
	Thread.sleep(3);
	driver.findElement(By.id("password")).sendKeys("cyz123@");
	driver.findElement(By.id("kc-login")).submit();
	String errMsg1= driver.findElement(By.id("input-error")).getText();
	System.err.println(errMsg1 +"\t Error msg is displayed");
	System.out.println("Test Case Passed");
	
System.out.println("*********** Teste case Ten ****************************************");    	
	driver.findElement(By.id("username")).sendKeys("Shamalkachare775@gmail.com");
	Thread.sleep(3);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("kc-login")).submit();
	String errMsg2= driver.findElement(By.id("input-error")).getText();
	System.err.println(errMsg2 +"\t Error msg is displayed");
	System.out.println("Test Case Passed");
	
	
System.out.println("*********** Teste case Eleven ****************************************");    	
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("Shamalkachare.com");
	Thread.sleep(3);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("cyz123@");
	driver.findElement(By.id("kc-login")).submit();
	String errMsg3= driver.findElement(By.id("input-error")).getText();
	System.err.println(errMsg3 +"\t Error msg is displayed");
	System.out.println("Test Case Passed");

    			
    
 System.out.println("*********** Teste case Twelve ****************************************");    	
 
    	driver.findElement(By.id("username")).clear();
    	driver.findElement(By.id("username")).sendKeys("Shamalkachare775@gmail.com");
    	Thread.sleep(3);
    	driver.findElement(By.id("password")).clear();
    	driver.findElement(By.id("password")).sendKeys("Test123@");
    	
    	WebElement checkbx = driver.findElement(By.id("rememberMe"));
    	Boolean checkBox= checkbx.isSelected();
    	if(checkBox!=true)
    	{
    	System.out.println(checkBox +" Checkbox is not selected");
    	driver.findElement(By.id("kc-login")).submit();
    	}
    	
    	System.out.println("Test Case Passed");
    		 Thread.sleep(5);

 		driver.navigate().refresh();
 		
		
		System.out.println("*********** Teste case Thirteen ****************************************");
		
    
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/header/ul[3]/li/a/div")));
    	WebElement dropdwn= driver.findElement(By.xpath("/html/body/div[1]/div/header/ul[3]/li/a/div"));
    	dropdwn.click();
    
		WebElement logout1= driver.findElement(By.cssSelector("body > div.c-app > div > header > ul:nth-child(4) > li > div > a:nth-child(5)"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("body > div.c-app > div > header > ul:nth-child(4) > li > div > a:nth-child(5)")));
    	logout1.click();
    	
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("kc-page-title")));
    	

    	String pageTitle= driver.findElement(By.cssSelector("#kc-page-title")).getText();
		if(pageTitle.equals("Sign in to your account"))
		{
			System.out.println("User has been logged out successfully");
		}else {
			System.err.println("User has not been logged out");
		}
		
		System.out.println("*********** Teste case Fourteen ****************************************");
		
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("username")));
		//driver.findElement(By.id("username")).clear();
		Thread.sleep(5);
    	driver.findElement(By.id("username")).sendKeys("Shamalkachare775@gmail.com");
    	Thread.sleep(3);
    	//driver.findElement(By.id("password")).clear();
    	driver.findElement(By.id("password")).sendKeys("Test123@");
    	driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/div/form/div[3]/div[1]/div/label/input")).click();
    	driver.findElement(By.id("kc-login")).submit();
    	
//    	if(checkBox!=true)
//    	{
//    	System.out.println(checkBox +" Checkbox is not selected");
//    //	driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/div/form/div[3]/div[1]/div/label/input")).click();
//    	Thread.sleep(5);
//    	}
//    	else if(checkBox==true)
//    	{
//    		System.out.println(checkBox +" Checkbox is selected");
//    	
//    	}
//    	
//    	else {
//    		System.out.println("Checkbox is already selected");
//    	}
    	driver.navigate().refresh();
 		
    	try {
    		
    	
    	
    	//driver.findElement(By.id("kc-login")).submit();
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/header/ul[3]/li/a/div")));
    	Thread.sleep(5);


		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/header/ul[3]/li/a/div")));
    	dropdwn.click();
    
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("body > div.c-app > div > header > ul:nth-child(4) > li > div > a:nth-child(5)")));
    	logout1.click();
    	
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("kc-page-title")));
    	

    	if(pageTitle.equals("Sign in to your account"))
		{
			System.out.println("User has been logged out successfully");
		}else {
			System.err.println("User has not been logged out");
		}
    	System.out.println("Test Case Passed");
    	Thread.sleep(5);
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("kc-page-title")));
    	driver.close();
        			
    	
}
    
}