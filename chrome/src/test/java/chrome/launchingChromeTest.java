package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchingChromeTest 
{
	@Test
	public void chromeTest() throws InterruptedException
	{
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com");
  Thread.sleep(3000);
  driver.quit();
}
}
