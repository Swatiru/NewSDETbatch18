package class25FileHandling;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeExcelFile {
    public static void main(String[] args) throws IOException {
        //Location of file
        String path="C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\Practice.xlsx";
        //Navigate to the file
        FileInputStream fis=new FileInputStream(path);
        //this is that secial class that we need to handle excel files
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        //to acess the sheet from that file
        Sheet sheet=excel.getSheet("Sheet1");
        //accessing the rows from the above sheet
       // Row row1=sheet.getRow(1);
        sheet.createRow(3).createCell(0).setCellValue("emp");
        sheet.getRow(3).createCell(1).setCellValue("empwork");
        FileOutputStream fos=new FileOutputStream(path);
        excel.write(fos);
        fos.close();

    }
}
