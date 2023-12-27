package class19;

import org.openqa.selenium.edge.EdgeDriver;

public class E3Poly {
    public static void main(String[] args) throws InterruptedException {
       /* ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();*/

        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        System.out.println(edgeDriver.getTitle());
        edgeDriver.close();


    }
}
