package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public static void verifyHPisDisplayed(WebDriver driver,long ETO,String title)
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("HomePageIsDisplayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("HomePageIsNotDisplayed",true);
			Assert.fail();
		}
	}

}
