package class22Encapsulation;

public interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximiseWindow();

    void findElement();
}
class chromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open browrser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close browser");

    }

    @Override
    public void maximiseWindow() {
        System.out.println("maximise browser");

    }

    @Override
    public void findElement() {

    }}
    class FireFox implements WebDriver{

        @Override
        public void openBrowser() {
            System.out.println("open browrser");

        }

        @Override
        public void closeBrowser() {
            System.out.println("close browser");

        }

        @Override
        public void maximiseWindow() {
            System.out.println("maximise browser");

        }

        @Override
        public void findElement() {
            System.out.println("find element");
        }}

