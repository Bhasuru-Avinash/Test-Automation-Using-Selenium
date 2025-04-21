package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aavi45538@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Avinash@2002");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.geeksforgeeks.org/software-testing-tutorial/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close();
		
	}

}
