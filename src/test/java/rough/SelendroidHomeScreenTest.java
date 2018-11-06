package rough;

import java.io.IOException;
import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.nativeapp.SelendroidHomeScreen;
import utils.CommonUtils;

public class SelendroidHomeScreenTest {

	public static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws IOException, MalformedURLException, InterruptedException {

		CommonUtils.loadAndroidConfigProp("Android_SelendroidTestApp.properties");
		CommonUtils.setAndroidCapabilities();
		driver = CommonUtils.getAndroidDriver();

		SelendroidHomeScreen homeScreen = new SelendroidHomeScreen(driver);
		SelendroidHomeScreen homeScreenReturn = homeScreen.typeData("Hi Appium");

		Thread.sleep(3000);
		driver.quit();
	}

}
