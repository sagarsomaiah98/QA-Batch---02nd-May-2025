

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
     
		
		WebDriver driver= new ChromeDriver();
		
	
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		driver.manage().window().maximize();
		WebElement Button=	driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act= new Actions(driver);
		act.doubleClick(Button).build().perform();
			
		
	
		
		
		

	}

}
