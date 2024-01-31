package Class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E4Exception {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\HRMSTestData.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println();;
        }
    }
}
