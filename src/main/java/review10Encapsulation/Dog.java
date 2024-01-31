package review10Encapsulation;

public class Dog {
    private String name;
    private String Age;
    private String color;
    public Dog(String name, String age, String color) {
        this.name = name;
        Age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    }

