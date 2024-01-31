package class26;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E1Excel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        //to acess the sheet from that file
        Sheet sheet=excel.getSheet("Sheet1");
        //accessing the rows from the above sheet
        Row row1=sheet.getRow(2);
        //Accessing the columns from above rows
        Cell cell1=row1.getCell(1);
        System.out.println(cell1);
    }

}
