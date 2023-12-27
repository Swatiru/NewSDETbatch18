package class19;

public class Browser {

    void get(String url){
        System.out.println("Loading... "+url+" in Chrome");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }
    void closBrowser(){
        System.out.println("Closing the Google Chrome Browser");
    }


}
class Chrome extends Browser{
    void get(String url){
            System.out.println("Loading... "+url+" in firefox");
        }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }
    void closBrowser(){
        System.out.println("Closing the Google Chrome Browser");
    }
}

class FireFox extends Browser{

    void get(String url){
        System.out.println("Loading... "+url+" in firefox");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in FireFox");
    }
    void closBrowser(){
        System.out.println("Closing the FireFox Browser");
    }
}


class Edge extends Browser{
    void get(String url){
        System.out.println("Loading... "+url+" in Microsoft Edge");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in Microsoft Edge");
    }
    void closBrowser(){
        System.out.println("Closing the Microsoft Edge Browser");
    }

}

class Safari{
    void get(String url){
        System.out.println("Loading... "+url+" in Safari");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in Safari");
    }
    void closBrowser(){
        System.out.println("Closing the Safari Browser");
    }

}

