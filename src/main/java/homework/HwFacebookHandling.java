package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;
public class HwFacebookHandling {
    public static void main(String[] args) throws IOException, InterruptedException {

            String url = ConfigReader.read("url");
            String userName = ConfigReader.read("userName");
            String password = ConfigReader.read("password");
            WebDriver webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.get(url);
            WebElement userNameWE = webDriver.findElement(By.xpath("//input[@id='email']"));
            WebElement passwordWE = webDriver.findElement(By.xpath("//input[@id='pass']"));
            WebElement enterBtn = webDriver.findElement(By.xpath("//button[@name='login']"));
            userNameWE.sendKeys(userName);
            passwordWE.sendKeys(password);
            enterBtn.click();
    }
}
