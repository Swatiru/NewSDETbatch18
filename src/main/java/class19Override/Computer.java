package class19Override;

public class Computer {
    void speed() {
        System.out.println("fast");
    }

    void StartOn() {
        System.out.println("working");
    }

    void startOff() {
        System.out.println("not working");
    }
}
class Apple extends Computer{
    void speed() {
        System.out.println("computer fast");
    }
}

class Lenovo extends Computer{
    void starton() {
        System.out.println("working");
    }
}
class HPDell extends Computer {
    void startOff() {
        System.out.println("not working");
    }

}

