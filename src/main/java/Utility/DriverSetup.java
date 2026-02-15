package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {

	public WebDriver driver;
	public Properties properties;
	public FileInputStream fis;

	public WebDriver returnDriver() throws IOException {

		fis = new FileInputStream(".//src//test/resources//Configuration.properties");
		properties = new Properties();
		properties.load(fis);
		String url = properties.getProperty("url");
		String browser = properties.getProperty("browser");

		if (driver == null) {
			switch (browser.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				throw new IllegalArgumentException("Invalid Browser Name: " + browser);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		return driver;
	}

}
