package class22Encapsulation;

public class BrowserTester {
    public static void main(String[] args) {
WebDriver[] d={new chromeDriver(),new FireFox()};
    for(WebDriver webdriver:d){
        webdriver.closeBrowser();
        webdriver.openBrowser();
        webdriver.maximiseWindow();
        webdriver.findElement();
        System.out.println("-----------");
    }

    }
}
