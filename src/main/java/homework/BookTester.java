package homework;

public class BookTester {
    public static void main(String[] args) {
        Book b=new Book("The Grass","Jeffrey Archer",2345);
        b.printInfo();
        System.out.println();
        Ebook e=new Ebook("the rain","murfy",1234,"https://us.macmillan.com/");
        e.printInfo();
        System.out.println();
        PrintBook p=new PrintBook("Molecular Biology","George M.",2340,230);
        p.printInfo();
        System.out.println();
    }
}
