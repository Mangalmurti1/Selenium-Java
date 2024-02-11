import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invoke_get_print_close_quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/");//get URL
driver.getTitle();//Get the title of website
System.out.println(driver.getTitle());//print the title of website on the console. 
driver.getCurrentUrl();//get the current URL of website where we land on.
System.out.println(driver.getCurrentUrl());
driver.close();//close the current tab/window
driver.quit();//close all the associated tabs of selenuim

	}

}
