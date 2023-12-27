package class21Abstraction;

public class Task1Tester {
    public static void main(String[] args) {

        Task1[] array={new JavaFile("Name",5),new WordFile("Name",6),new PdfFile("Neha",8)};
        for (int i=0; i< array.length; i++){

            Task1 f=array[i];
            f.edit();
            f.open();
            f.close();
        }

    }
}

