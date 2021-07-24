package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Orange_Page;

public class TestCase_1 extends TestBase {


	HomePage HomeObject;
	Orange_Page OrangeObj;

	@Test(priority=1)
	public void SearchforOrange_WebSite()
	{	
		//Step_1 of Search for the Orange Business Services web site
		HomeObject = new HomePage(driver); 
		HomeObject.SiteSearch("Orange Business Service");
		List<WebElement> links=driver.findElements(By.tagName("h3"));
		for (int i=0;i<links.size();i++)
		{
			String ListItem=links.get(i).getText();
			if(ListItem.contains("Orange Business Services: Your partner for digital ..."))
			{
				links.get(i).click();
				break;
			}
		}


	}
	@Test(dependsOnMethods= {"SearchforOrange_WebSite"})
	public void OpenArticle()
	{
		OrangeObj=new Orange_Page(driver);
		OrangeObj.SelectAllprod();
		String arr[]= {"Solution","Business innovation","Cloud","Collaborative workspace","Customer experience","Cyberdefense","Data intelligence",
				"Internet of Things","Mobile connectivity","Network transformation","Services"};
		Select selectoptions=new Select(OrangeObj.products);
		List<WebElement> dropDownMenuValues=selectoptions.getOptions();
		System.out.println(dropDownMenuValues.size());
		for(int i=0;i<dropDownMenuValues.size();i++)
		{
			Assert.assertEquals(arr[i], dropDownMenuValues.get(i).getText());
			String Item=dropDownMenuValues.get(i).getText();
			if (Item.contains("Cloud"))
			{
				dropDownMenuValues.get(i).click();
				OrangeObj.ClickFilter();
				break;
			}
			
		}
		
		List<WebElement> titles=driver.findElements(By.tagName("span"));
		for (int i=0;i<titles.size();i++)
		{
			String ListItem=titles.get(i).getText();
			if(ListItem.contains("Managed Applications: improve operational capability in the cloud"))
			{
				titles.get(i).click();
				Assert.assertEquals( OrangeObj.TitlePage.getText(), "Managed Applications: improve operational capability in the cloud");
				break;
			}
		}
		
		
	}


}

