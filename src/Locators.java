import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/locatorspractice/");//navigate to the website
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Give delay/timeout for 5 seconds so selenuim capture the moments 
     driver.findElement(By.id("inputUsername")).sendKeys("Mahesh");//finding web element by ID selector & entering 'Mahesh' into it 
     driver.findElement(By.name("inputPassword")).sendKeys("Rahul");//finding web element by Name selector & entering 'Rahul' into it
     driver.findElement(By.className("signInBtn")).click();//finding web element by ClassName selector & click on it
     System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//finding web element by CSS selector and fetch the textline and print it on console.
     driver.findElement(By.linkText("Forgot your password?")).click();//finding web element by linkText selector & click on it.
     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mahesh");//finding web element by xpath selector & entering 'Mahesh' into it
     driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rk@gmail.com");//finding web element by customized xpath selector (using index)) & entering 'rk@gmail.com' into it
     driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//finding web element by customized xpath selector & Clear the textfield
     driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Mahesh@gmail.com");// finding web element by customized CSS Selector(using index) & entering the 'Mahesh@gmail.com'
     driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543789");//finding web element by xpath selector by traversing from parent to child using only tag name.
     driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
     System.out.println(driver.findElement(By.cssSelector("form p")).getText());//finding web element by css selector by traversing from parent to child using only tag name.
     driver.findElement(By.cssSelector(".go-to-login-btn")).click();
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sudhakar");
     driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//used regular expression * to find partial text from attribute 'type'
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
     driver.findElement(By.cssSelector("button[class*='sub']")).click();//used regular expression * to find partial text from attribute 'class'
     System.out.println(driver.findElement(By.cssSelector("p[style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText());
	}

}
