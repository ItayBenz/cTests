package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.get("");
		
	WebElement GoogleTextBox = driver.findElement(By.name("q"));	
	GoogleTextBox.sendKeys("Rotem a maniak");
	WebElement GoogleSearchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
	
	GoogleSearchButton.click();
	}

}
