import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links  {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techbeamers.com/websites-to-practice-selenium-webdriver-online/");
		driver.manage().window().maximize();
	  List<WebElement> links=   driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  
	  
	  for(int i=0;i<links.size();i++) {
		  
	System.out.println(links.get(i).getText()+" -> "+i);

	  }
	  driver.quit();
	
		
	}
		
		
	}

