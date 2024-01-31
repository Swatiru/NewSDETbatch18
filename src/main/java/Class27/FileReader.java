package Class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    static void readFile() throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\HRMSTestData.xlsx");

    }
        public static void main(String[] args)  {
    try{
        readFile();
    }catch (FileNotFoundException f){
        System.out.println("Please check the file path");
    }
}

}

