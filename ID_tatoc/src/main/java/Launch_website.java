import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_website {
	
	//public static WebDriver driver;
	

		By Basic_Course = By.xpath("//a[text()='Basic Course']");
		By GreenBox = By.xpath("//*[@class=\"greenbox\"]");
		By RightAnswer = By.xpath("//*[@id=\"answer\"]");
		By changeclr = By.xpath("/html/body/center/a[1]");
		By proceedd = By.xpath("//a[text()='Proceed']");
		By drgr = By.xpath("//div[@id=\"dragbox\"]");
		By drpr = By.xpath("//div[@id=\"dropbox\"]");
		By drag_proceed = By.xpath("//a[text()=\"Proceed\"]");
		By popupwind = By.xpath("//a[text()=\"Launch Popup Window\"]");
		By inputname = By.xpath("//input[@id=\"name\"]");
		By subname = By.xpath("//input[@id=\"submit\"]");
		By windproceed = By.xpath("//a[text()=\"Proceed\"]");
		By tokenkey = By.xpath("//a[text()=\"Generate Token\"]");
		By token = By.xpath("//span[@id=\"token\"]");
		By fnlproceed = By.xpath("//a[text()=\"Proceed\"]");
		
		
	
		public void Basicscource(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.findElement(Basic_Course).click();
		
	}
	


	public void clickgrenbox(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(GreenBox).click();
	}
	
	public void GetTheRightBox(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().frame("main");
		String str = driver.findElement(By.xpath("/html/body/center/div")).getAttribute("class");
		driver.switchTo().frame("child");
		String str2 = driver.findElement(By.xpath("/html/body/div[@id=\"answer\"]")).getAttribute("class");
		System.out.print(str2);
		while(true)
		{
			if(str2.equals(str))
			{
				driver.switchTo().parentFrame();
				driver.findElement(proceedd).click();
				break;
			}
			else
			{	driver.switchTo().parentFrame();
				System.out.print(str+"  "+str2);
				driver.findElement(changeclr).click();
				driver.switchTo().frame("child");
				str2 = driver.findElement(By.xpath("/html/body/div[@id=\"answer\"]")).getAttribute("class");
			}
		}
		driver.switchTo().parentFrame(); 
	}



	public void dragansdrop(WebDriver driver) {
		// TODO Auto-generated method stub
		
		Actions builder = new Actions(driver);
		 
		 WebElement from = driver.findElement(drgr);
		 
		 WebElement to = driver.findElement(drpr); 
		 
		 builder.dragAndDrop(from, to).perform();
		 
		 driver.findElement(drag_proceed).click();
		
	}



	public void launch_popup(WebDriver driver) {
		// TODO Auto-generated method stub
		
		driver.findElement(popupwind).click();
		
		
		
	}



	public void entername(WebDriver driver) {
		// TODO Auto-generated method stub
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	   
	    driver.findElement(inputname).sendKeys("mnbcvx");
		driver.findElement(subname).click();
		driver.switchTo().window(tabs.get(0)); // switch back to main screen
		driver.findElement(windproceed).click();
	    
	}


	String ftoken;
	public void genratetoken(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(tokenkey).click();
		String tokenstr = driver.findElement(token).getText();
		ftoken = tokenstr.substring(7, tokenstr.length());
		
		
	}



	public void creatcookie(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println(ftoken);
		Cookie name = new Cookie("Token", ftoken);
		driver.manage().addCookie(name);
		
		driver.findElement(fnlproceed).click();
		
		
	}
	
	
	

}
