package screens.nativeapp;

import org.openqa.selenium.WebElement;

import base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelendroidHomeScreen extends ScreenBase{
	
	public static AndroidDriver<MobileElement> driver;
	
	public SelendroidHomeScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field")
	public WebElement textField;
	
	
	public SelendroidHomeScreen typeData(String data) throws InterruptedException {
		Thread.sleep(3000);
		textField.sendKeys(data);
		
		return this;
		
	}

}
