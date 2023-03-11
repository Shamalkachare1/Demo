package Pages.StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Steps {				

	testBase testbase= new testBase();
    WebDriver driver;			
    
    
    
    		
    @Given("^Open the browser and hit the given URL$")					
    public void open_the_browser_and_launch_the_application() throws Throwable							
    {
    	Thread.sleep(3);
    	testbase.beforeTest();
    	testbase.initialize();
    	
    }
    @Then("Verify the page ASIANS USER SYSTEM")
    public void Verify_the_page(DataTable table) throws InterruptedException
    {
    	List<String> pageTitle = table.asList();
    	 String title = pageTitle.get(0);
    	 String ActualTitle = driver.findElement(By.id("kc-header-wrapper")).getText();
    	 System.out.println(ActualTitle);
    	 if(title==ActualTitle)
    	 {
    		 System.out.println("Title is as per spec" );
    	 }
    	 else {
			System.out.println("Title is not matching");
		}
    	 
    }
}