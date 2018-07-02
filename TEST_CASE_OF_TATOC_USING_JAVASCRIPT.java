import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class TEST_CASE_OF_TATOC_USING_JAVASCRIPT {

	WebDriver driver; 
	
	@Test
  public void ChromeBrowse() {
	  String url = "http://10.0.1.86/tatoc";
	  WebDriver driver = new ChromeDriver();
      driver.get(url);
      JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByTagName('a')[0].click();");
		jse.executeScript("document.getElementsByClassName('greenbox')[0].click();");
		//jse.executeScript("document.getElementsById('a')[0].click();");
		//driver.switchTo().frame(driver.findElement(By.id("main")));
		//driver.switchTo().frame(jse.executeScript("document.getElementById('main')"));
		//String Color_of_box_1=jse.executeScript("document.");
//		driver.switchTo().frame(driver.findElement(By.id("main")));
		String  Color_of_Box1=(String)jse.executeScript("return document."
				+ "getElementById('main')."
				+ "contentWindow.document."
				+ "querySelector('#answer')."
				+ "getAttribute('class');");
		String  Color_of_Box2=(String)jse.executeScript("return document."
				+ "getElementById('main')."
				+ "contentWindow.document."
				+ "getElementById('child')."
				+ "contentWindow."
				+ "document.querySelector('#answer')."
				+ "getAttribute('class');");
		while((Color_of_Box1.equals(Color_of_Box2) != true)) {
			jse.executeScript("document."
					+ "getElementById('main')."
					+ "contentWindow.document."
					+ "getElementsByTagName('a')[0].click();");
		  Color_of_Box2 = (String)jse.executeScript("return document."
						+ "getElementById('main')."
						+ "contentWindow.document."
						+ "getElementById('child')."
						+ "contentWindow."
						+ "document.querySelector('#answer')."
						+ "getAttribute('class');");
		}
		jse.executeScript("document."
				+ "getElementById('main')."
				+ "contentWindow.document."
				+ "getElementsByTagName('a')[1].click();");
		/*click()*/
		
		 //String Colorbox1 = driver.findElement(By.id("answer")).getAttribute("class");
	//	String Color_of_Box1 = jse.executeAsyncScript("document.getElementById('')")
		System.out.println(Color_of_Box1+"  ::  "+Color_of_Box2);
	//	WebElement fromWebElement = (WebElement)jse.executeScript("return document.getElementById('dragbox')");
	 // 	WebElement toWebElement =(WebElement)jse.executeScript("return document.getElementById('dropbox')");
	  	//Actions builder = new Actions(driver);
	  	jse.executeScript("document."
	  			+ "getElementById('dragbox')."
	  			+ "setAttribute('style','position: relative; left: 32px; top: -59px;');");
	  	jse.executeScript("document.getElementsByTagName('a')[0].click();");
	  	jse.executeScript("return document.getElementsByTagName('a')[0].click();");
	  	
	    jse.executeScript("return document.querySelector('//*[@id=\"name\"]').click()");
	    jse.executeScript("return document.querySelector('body > div > div.page >a').click()");
      }
//	@Test
	//public void Check_Weather_This_Is_a_TATOC_Page() {
		//String Expected_String="Test Automation Training Obstacle Course";
		//JavascriptExecutor jse= (JavascriptExecutor)driver;
        //WebElement Get_TATOC_HeadLine = null ;
        //Get_TATOC_HeadLine =(WebElement) jse.executeScript("return document.;", Get_TATOC_HeadLine);

	
}
