package class19;

public class E2Polly {
    public static void main(String[] args) {
        Dog d1=new Dog("jackey","pink",4,4.4);
        Dog d2=new Dog("mackey","red",4,4.4);
        Dog d3=new Dog("rackey","blue",4,4.4);

        Animal[] arr={d1,d2,d3};
        Animal a2=arr[0];
        a2.printInfo();
    }
}
