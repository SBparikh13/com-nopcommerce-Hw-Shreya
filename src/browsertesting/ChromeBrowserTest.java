package browsertesting;
/** Project-1 - Project Name: com-nopcommerce
        * BaseUrl = https://demo.nopcommerce.com/login?returnUrl=%2F
        * 1. Setup Chrome browser
        * 2. Open URL
        * 3. Print the title of the page
        * 4. Print the current url
        * 5. Print the page source
        * 6. Enter the email to email field
        * 7. Enter the password to password field
        * 8. Close the browser
        */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //to launch browser
        WebDriver driver = new ChromeDriver();
        //to open URL
        driver.get(baseUrl);
        //to print title of the page
        System.out.println(driver.getTitle());
        //to print current URl
        System.out.println(driver.getCurrentUrl());
        //to print the page source
        System.out.println(driver.getPageSource());
        //to find email and email field
        driver.findElement(By.id("Email")).sendKeys("sbparikh@gmail.com");
        //to find password and password field
        driver.findElement(By.id("Password")).sendKeys("abc123");
        //close the driver
        driver.close();






    }
}
