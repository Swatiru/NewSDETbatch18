package class25FileHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExCelFile {
    public static void main(String[] args) throws IOException {
        //Location of file
        String path="C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\Batch18.xlsx";
        //Navigate to the file
        FileInputStream fis=new FileInputStream(path);
        //this is that secial class that we need to handle excel files
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        //to acess the sheet from that file
        Sheet sheet=excel.getSheet("Sheet1");
        //accessing the rows from the above sheet
        Row row1=sheet.getRow(1);
        //Accessing the columns from above rows
        Cell cell1=row1.getCell(1);
        System.out.println(cell1);


    }
}
