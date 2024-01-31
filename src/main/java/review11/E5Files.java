package review11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E5Files {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\src\\main\\java\\review11\\E5Files.java";
        //bringing the file back to memory
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println("url");
    }
}