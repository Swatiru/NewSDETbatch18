package Class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E7Exception {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis = new FileInputStream("C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\HRMSTestData.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("please check the path");

        } finally {

            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("error in closing the file");

            }
        }

    }
}
