import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokeFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://rahulshettyacademy.com/");
System.out.println(driver.getTitle());
driver.close();


	}

}
