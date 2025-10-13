package pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc002_findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement> amazonlinks=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links:"+amazonlinks.size());
		
		for( WebElement link: amazonlinks)
		{
			System.out.println("link is:"+link.getText());
		}

	}

}
