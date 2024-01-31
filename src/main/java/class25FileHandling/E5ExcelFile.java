package class25FileHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E5ExcelFile {
    public static void main(String[] args) throws IOException {
        //Location of file
        String path="C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\Batch18.xlsx";
        //Navigate to the file
        FileInputStream fis=new FileInputStream(path);
        //this is that secial class that we need to handle excel files
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        //to acess the sheet from that file
        Sheet sheet=excel.getSheet("Sheet1");
        int noOfRows= sheet.getPhysicalNumberOfRows();// give all the dta from sheet which one is used
        for (int i = 0; i < noOfRows; i++) {

            Row row= sheet.getRow(i);
            int noOfCol=row.getPhysicalNumberOfCells();//grab individual piece of data from cell
            for (int j = 0; j < noOfCol; j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();

            }
        }
    }

