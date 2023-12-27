package class13;

public class Hello {
    void sayHello(String country){
        if (country.equalsIgnoreCase("usa")){
            System.out.println("hello");
        }else if(country.equalsIgnoreCase("france")){
            System.out.println("bonjour");
        }else if(country.equalsIgnoreCase("india")){
            System.out.println("namaste");

        }else if(country.equalsIgnoreCase("brazil")){
            System.out.println("ola");
        }else if(country.equalsIgnoreCase("spanish")){
            System.out.println("hola");
        }
}}
