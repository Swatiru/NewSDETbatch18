package class22Encapsulation;

public interface  Human {
    void walk();
}
interface Person{
    void talk();
}
interface Employee extends Human, Person{
    void work();
}
class syntaxEmployee implements Employee{

    @Override
    public void walk() {
        System.out.println("walking---");

    }

    @Override
    public void talk() {
        System.out.println("talking----");
    }

    @Override
    public void work() {
        System.out.println("working----");

    }
}