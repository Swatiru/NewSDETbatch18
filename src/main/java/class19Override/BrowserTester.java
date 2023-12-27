package class19Override;

public class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closBrowser();

        FireFox fireFox=new FireFox();
        fireFox.get("https://Amazon.com");
        fireFox.performTest();
        fireFox.closBrowser();

        Safari safari=new Safari();
        safari.get("https://Amazon.com");
        safari.performTest();
        safari.closBrowser();

        Edge edge=new Edge();
        edge.get("https://Amazon.com");
        edge.performTest();
        edge.closBrowser();

        System.out.println("***************************");
        //Array that holds the object of all browser
        Browser[] bArr={chrome,fireFox,edge};
//A loop that picks all of the objects one by onefrom array
        //and places it indide the b variable
        for (int i = 0; i <bArr.length ; i++) {

            Browser b=bArr[i];
            b.get("https://Amazon.com");
            b.performTest();
            b.closBrowser();
        }



    }
}