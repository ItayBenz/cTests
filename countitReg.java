package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class countitReg {

	public static void main(String[] args) throws InterruptedException {	
	
	
	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://countit.online/order/2");
		driver.manage().window().maximize();
		//WebElement Order489 = driver.findElement(By.xpath("/html/body/div/section[1]/div/div[1]/ul/li[5]/div/div/div/a"));
	  //  Order489.click();
	   
	    
	    WebElement [] arr = new WebElement[7];
	    Thread.sleep(2000);
	    arr[0] = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[1]/div/div/input"));
	    arr[0].sendKeys("Itay");
	    arr[1] = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[2]/div/div/input"));
	    arr[1].sendKeys("benz");
	    arr[2] = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[3]/div/div/input"));
	    arr[2].sendKeys("mistrhla");
	    arr[3] = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[4]/div/div/input"));
	    arr[3].sendKeys("adi223@gmail.com");
	    arr[4] = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[5]/div/div/input"));  //phone
	    arr[4].sendKeys("111234567");
	    arr[5] = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[7]/div/div/input"));
	    arr[5].sendKeys("somewhere");
	    Thread.sleep(1000);
	    arr[6] = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[8]/div/div/input"));
	    arr[6].sendKeys("rishon");
	  
	    
	   
	   Thread.sleep(2000);
	   WebElement Country = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[1]/div[6]/div/div/div[1]/div/div[1]/div[1]"));
	   Country.click();
	   Thread.sleep(500);
	   WebElement Dropdown1 = driver.findElement(By.id("react-select-2-input"));
	   Dropdown1.sendKeys(Keys.TAB);
	   Thread.sleep(500);
	   Dropdown1.sendKeys(Keys.ENTER);
	   
	   Thread.sleep(2000);
	   WebElement Land = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[2]/div/div/div[3]/div/div[1]/div[1]/div[1]"));
	   Thread.sleep(500);
	   Land.click();
	   WebElement Dropdown2 = driver.findElement(By.id("react-select-3-input"));
	   Dropdown2.sendKeys(Keys.ARROW_UP);
	   Thread.sleep(500);
	   Dropdown2.sendKeys(Keys.ENTER);
	  
	   // <Next>
	   WebElement Nextbtn = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/form/div[2]/div/button"));
	   Thread.sleep(1500);
	   Nextbtn.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	 //  <Payment>
	   WebElement Paymentbtn = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/form/div[2]/div/button[1]"));  
	   Thread.sleep(1000);
	   Paymentbtn.sendKeys(Keys.ENTER);
	}

}
