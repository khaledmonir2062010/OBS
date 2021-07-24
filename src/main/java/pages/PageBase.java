package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class PageBase {

	
	protected WebDriver drvier ; 
	public Select select ; 
	public Actions action ; 
	public JavascriptExecutor jse ; 
	
	
	public PageBase(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}


	//Method for click buttons
		protected static void clickButton(WebElement button) 
		{
			button.click();
		}
	//Method to SendKeys to the text boxes and search fields	
		protected static void setTextElementText(WebElement textElement , String value) 
		{
			textElement.sendKeys(value);
		}

	//Method to be used Clear the text boxes and search Fields	
		public void clearText(WebElement element) 
		{
			element.clear();
		}
		



}
