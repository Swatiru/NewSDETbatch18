package class15constructor;

import org.openqa.selenium.chrome.ChromeDriver;

public class E1BrowserDemo {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://www.amazon.com/");
        chromeDriver.close();


    }
}
