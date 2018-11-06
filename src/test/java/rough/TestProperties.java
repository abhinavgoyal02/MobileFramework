package rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static Properties prop = new Properties();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Android_SelendroidTestApp.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("application.path"));
	}

}
