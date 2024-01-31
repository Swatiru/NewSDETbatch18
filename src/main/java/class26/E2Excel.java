package class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E2Excel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        //to acess the sheet from that file
        Sheet sheet = excel.getSheet("Sheet1");
        //accessing the rows from the above sheet
        int noOfActualRowWithData = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < noOfActualRowWithData; i++) {

            Row row1 = sheet.getRow(i);
            int noOfActualCellWithData= row1.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfActualCellWithData; j++) {
                System.out.println(row1.getCell(j)+" ");
            }
            System.out.println();
            }
        }
    }