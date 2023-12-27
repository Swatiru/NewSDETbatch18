package homework;
//Create a base class Book with attributes like title, author, and ISBN.
//Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link, and in PrintBook,
// add a property for number_of_copies.
//Implement a method in each subclass that displays book details.
//Instantiate objects from these classes and demonstrate the display functionality.
public class Book {
    private String title;
    private String author;
    private int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
        public void printInfo() {
            System.out.println(title + " " + author + " " + ISBN);
        }
    }
     class Ebook extends Book{
    private String downloadLink;
    public Ebook(String title, String author, int ISBN, String download_link) {
             super(title, author, ISBN);
             this.downloadLink = download_link;
         }
         public void printInfo(){
        super.printInfo();
             System.out.println("link to download "+downloadLink);
         }
     }
     class PrintBook extends Book{
    private int NoOfCopies;
    public PrintBook(String title, String author, int ISBN, int noOfCopies) {
             super(title, author, ISBN);
            this.NoOfCopies = noOfCopies;
         }
         public void printInfo(){
        super.printInfo();
             System.out.println("no of copies "+NoOfCopies);

         }

     }


