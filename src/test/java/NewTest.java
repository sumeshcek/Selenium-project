import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

  @Test
  public void testEasy() {	
		/*driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	*/
	  System.out.println("Hello Maven success");
	}	
	@BeforeTest
	public void beforeTest()
	{	
		 //System.setProperty("webdriver.ie.driver","C:\\Users\\Adwaith\\karthika work\\chromedriver.exe");
		  //driver=new ChromeDriver();
	}
	     
		
	@AfterTest
	public void afterTest() {
		//driver.quit();	
		//comment
		//comment
	}
}
