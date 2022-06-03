//$Id$
package week3.day2;



import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links 

{
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver ( ).setup ( );
        ChromeDriver driver = new ChromeDriver ( );

        driver.manage ( ).window ( ).maximize ( );
        driver.manage ( ).timeouts ( ).implicitlyWait ( Duration.ofSeconds ( 30 ) );

        //1. Launching URL "http://leaftaps.com/opentaps/control/login"
        driver.get ( "http://www.leafground.com/pages/Link.html" );
        List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
        System.out.println(nooflinks.size());
        nooflinks.get(0).click();
        System.out.println("The Title of the page is : " +driver.getTitle());
        driver.navigate().back();
        List<WebElement> nooflinks1 = driver.findElements(By.tagName("a"));
        System.out.println("No.of.links in the page is :" +nooflinks1.size());
        String hrefvalue = nooflinks1.get(2).getAttribute("href");
        System.out.println("Second href value is" +hrefvalue);
        driver.close();
	}
}
