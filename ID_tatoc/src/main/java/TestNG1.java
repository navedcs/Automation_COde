
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.openqa.selenium.WebDriver;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.j2objc.annotations.Property;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestNG1 {
		
		public static WebDriver driver;
		Launch_website ob = new Launch_website();
		
		
		@Test
		public void A_Launch_website() {
			// TODO Auto-generated constructor stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\naved.alam\\Documents\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cengagegroup.com/");
			
	}
		
		@Test
		public void B_Basic_course()
		{
			//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			ob.Basicscource(driver);
		}
		
		
		
//		@Test
//		public void C_ClickGreenBox()
//		{
//			//ob.clickgrenbox(driver);
//			//ob.GetTheRightBox(driver);
//			ob.clickgrenbox(driver);
//		}
//		
//		@Test
//		public void D_GetBox()
//		{
//			ob.GetTheRightBox(driver);
//		}
//		
//		@Test
//		public void E_drganddrp()
//		{
//			ob.dragansdrop(driver);
//		}
//		
//		@Test
//		public void F_launchwin()
//		{
//			ob.launch_popup(driver);
//		}
//		
//		@Test
//		public void G_enternamee()
//		{
//			ob.entername(driver);
//		}
//		
//		@Test
//		public void H_gnratetokenAndcookie()
//		{
//			ob.genratetoken(driver);
//			ob.creatcookie(driver);
//		}
//		
		
		

}


