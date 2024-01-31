package Class27;

import java.io.FileInputStream;
import java.io.IOException;

public class E8Exception {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\HRMSTestData.xlsx")) {

        } catch (IOException e){
            System.out.println("Please check the file path");
        }

    }
}
