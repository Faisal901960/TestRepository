package WebDriverCommads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommads {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Persnal\\eclipse-workspace\\Facebook\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	     
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		String text = driver.findElement(By.xpath("//*[@id=\"adBlock\"]/div[2]/div[1]/a/span")).getText();
		
		System.out.println(text);
		
		
		
	}
}
