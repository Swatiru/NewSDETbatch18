package class19Override;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arr = {new Apple(), new Lenovo(), new HPDell()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].speed();
            arr[i].StartOn();
            arr[i].startOff();
        }
    }}