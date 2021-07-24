package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Orange_Page extends PageBase {

	public Orange_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Solutions")
	WebElement Solution_link;
	
	@FindBy(linkText="All products")
	WebElement AllProducts_link;
	
	@FindBy(id="edit-solutions")
	 public WebElement products;
	
	@FindBy(id="edit-submit-subhomes")
	WebElement Filter_btn;
	
	@FindBy(id="block-theme-boosted-page-title")
	public WebElement TitlePage;
	
	public void SelectAllprod()
	{
		clickButton(Solution_link);
		clickButton(AllProducts_link);
	}
	
	public void verifyProducts()
	{
		Select selectoptions=new Select(products);
		
		selectoptions.selectByVisibleText(("Business innovation"));
	}
	
	public void ClickFilter()
	{
		clickButton(Filter_btn);
	}

	

}
