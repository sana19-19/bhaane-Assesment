import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest
    {
        public static void main(String [] args) throws Exception{

            //Launch the browser
            WebDriver driver = new ChromeDriver();

            //Nevigate the browser
            driver.get("https://bhaane.com");

            //Locate the email section and enter valid email address
            driver.findElement(By.className("form_input")).sendKeys("Sana07@gmail.com");

            //wait for 5 seconds
            Thread.sleep(5000);

            //Click on the sign-up button
            driver.findElement(By.className("sign_up")).click();

            //driver.findElement(By.className("cross_sign md")).click();


        }
    }

