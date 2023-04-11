package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    public static void main(String[] args) {
        //to set up browser and open Url
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        //to open URL
        driver.get(baseUrl);
        //to print the title of the page
        System.out.println(driver.getTitle());
        //to print current Url
        System.out.println(driver.getCurrentUrl());
        //to print page source
        System.out.println(driver.getPageSource());
        //to find email and email field
        driver.findElement(By.id("Email")).sendKeys("sbparikh@gmail.com");
        //to find password and password field
        driver.findElement(By.id("Password")).sendKeys("abc123");
        //close driver
       // driver.close();





    }
}
