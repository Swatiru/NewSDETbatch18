package class21Abstraction;
/* Create a class File that will have the following behaviors:
open(), edit(), close() and fields like name and size. Edit and close are implemented method
while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
to open .doc file we need Microsoft word to be installed etc.Create a tester class and call all of the methods from these classes..*/
public abstract class Task1 {
    public String name;
    public int size;

    public Task1(String name, int size){
        this.name = name;
        this.size = size;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing file");
    }
    public void close(){
        System.out.println("Closing file");
    }
}
class JavaFile extends Task1{


    public JavaFile(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("We need Notepad++ or sublime text to open JavaFile");
    }
}
class WordFile extends Task1{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("We need Microsoft Word to open WorFile");
    }
}
class PdfFile extends Task1{

    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF file");
    }
}