package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadChrome {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ Users\\Persnal\\eclipse-workspace\\Facebook\\WebDriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		//options.setHeadless(true);
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.nopcommerce.com");
		System.out.println("Title of the page:"+driver.getTitle());
	}

}
