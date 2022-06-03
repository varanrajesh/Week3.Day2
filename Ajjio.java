//$Id$
package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajjio

{

	public static void main(String[] args) throws InterruptedException

	{
		/*
		 * WebDriverManager.chromedriver().setup(); Disable Popup Notifications on the browser ChromeOptions options = new ChromeOptions(); options.addArguments("--disable-notifications");
		 * ChromeDriver driver = new ChromeDriver(); driver.manage().window().maximize(); driver.manage().timeouts().implicitlyWait(Duration.ofSeconds ( 30 ));
		 */

		WebDriverManager.chromedriver().setup();

		/* Disable Popup Notifications on the browser */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		/* Trigger the Browser */
		ChromeDriver driver = new ChromeDriver(options);

		// Maximize Window and Set the timeout to 30seconds
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.ajio.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		String NoOfItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of Items found : " + NoOfItems);
		
		
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		List<WebElement> bagList = driver.findElements(By.className("nameCls"));
		
		System.out.println("Brandlist cpunt is :" +brandList.size() );
				
		//Create a new ArrayList<String>
		List<String> strbrandList = new ArrayList<String>();
		//Convert WebElement List to String List
		for(WebElement ele : brandList){
			strbrandList.add(ele.getText());
		}
		System.out.println("List Size:  " + brandList.size());
		System.out.println("Brand List: " + strbrandList);
		
		//Create a new ArrayList<String>
		List<String> strbagList = new ArrayList<String>();
		//Convert WebElement List to String List
		for(WebElement ele : bagList){
			strbagList.add(ele.getText());
		}
		System.out.println("List Size :" + bagList.size());
		System.out.println("Name List: " + strbagList);

		//HashSet for BagBrand
		Set<String> BrandSet = new HashSet<String>();
		for (String bagBrand : strbrandList)
			BrandSet.add(bagBrand);
		
		//HashSet for BagNames
		Set<String> BagNameSet = new HashSet<String>();
		for (String bagName : strbagList)
			BagNameSet.add(bagName);

		driver.close();

	}

}
