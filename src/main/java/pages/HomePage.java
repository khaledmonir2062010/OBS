package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver) {
		super(driver);
		action= new Actions(driver);
		
	}
	
	@FindBy(name="q")
	WebElement GoogleSearch_txtbox;
	
	@FindBy(name="btnK")
	WebElement GoogleSearch_btn;
	
	@FindBy(tagName="h3")
	List<WebElement> Elements;
	
	public void SiteSearch(String Websearch)
	{
		setTextElementText(GoogleSearch_txtbox, Websearch);
		clickButton(GoogleSearch_btn);
		
	}
	
	
	


}
