package class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3Excel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        //to acess the sheet from that file
        Sheet sheet = excel.getSheet("Sheet1");
        //accessing the rows from the above sheet
        int noOfActualRowWithData = sheet.getPhysicalNumberOfRows();
        List<Map<String,String>>excelData=new ArrayList<>();

        Row headerRow= sheet.getRow(0);
        for (int i = 0; i < noOfActualRowWithData; i++) {

            Row currentRow = sheet.getRow(i);
            Map<String,String>rowMap=new LinkedHashMap();
            int noOfActualCellWithData= currentRow.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfActualCellWithData; j++) {
                String key=headerRow.getCell(j).toString();
                String values= currentRow.getCell(j).toString();
                rowMap.put(key,values);
            }
            excelData.add(rowMap);
            }
        }
    }