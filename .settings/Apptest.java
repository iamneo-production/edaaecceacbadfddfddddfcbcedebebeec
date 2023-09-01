import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Apptest {
      public static void main(String[] args) {
  
         WebDriver driver = new ChromeDriver();

         driver.get("http://www.snapdeal.com");
         try {

              WebElement sign_in_button = driver.findElement(By.xpath("//div[contains(@class, 'accountInner')]"));
              Actions actions = new Actions(driver);
              actions.moveToElement(sign_in_button).perform();

              sign_in_button.click();
 
              driver.switchTo().frame("loginIframe");
 
              WebElement email_input = driver.findElement(By.id("userName"));
              email_input.sendKeys("your_valid_email@example.com");
              WebElement continue_button = driver.findElement(By.id("checkUser"));
              continue_button.click();
              WebElement password_input = driver.findElement(By.id("j_password_login_uc"));
              password_input.sendKeys("your_valid_password");
              WebElement login_button = driver.findElement(By.id("submitLoginUC"));
              login_button.click();
              WebElement success_element = driver.findElement(By.xpath("//span[contains(text(), 'Welcome')]"));
              if (success_element != null) {
                  System.out.println("Login successful!");
              } else {
                  System.out.println("Login failed!");
              } 
            
            } finally {

                driver.quit();
            }
        }
    }
}


