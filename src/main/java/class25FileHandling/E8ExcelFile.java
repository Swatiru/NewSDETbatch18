package class25FileHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E8ExcelFile {
    public static void main(String[] args) throws IOException {
        //Location of file
        String path = "C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\Files\\Batch18.xlsx";
        //Navigate to the file
        FileInputStream fis = new FileInputStream(path);
        //this is that secial class that we need to handle excel files
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        //to acess the sheet from that file
        Sheet sheet = excel.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();// give all the dta from sheet which one is used

        List<Map<String, String>> excelData = new ArrayList<>();
        //header 0th row
        Row header = sheet.getRow(0);
        for (int i = 0; i < noOfRows; i++) {//how many coloms

            Row row = sheet.getRow(i);
            Map<String, String> rowData = new HashMap<>();
            int noOfCol = row.getPhysicalNumberOfCells();//grab individual piece of data from cell
            for (int j = 0; j < noOfCol; j++) {
                String key = header.getCell(j).toString();
                String value = row.getCell(j).toString();
                rowData.put(key, value);
            }
            excelData.add(rowData);//add in arryList/every iteration we create new map
        }
        System.out.println(excelData);
    }
}

