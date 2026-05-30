package com.excel.utility;


//package JavaSessions;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
    public String path;
    public FileInputStream fis = null;
    public FileOutputStream fileOut = null;
    static XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row = null;
    private XSSFCell cell = null;

    public Xls_Reader(String path) {

        this.path = path;
        try {
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            //sheet = workbook.getSheetAt(0);
            fis.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static Object[][] getExcelFile() throws IOException, ParseException {
        //XSSFWorkbook workbook = null;
        try {
            //File testData = new File(System.getProperty("user.dir") + "/src/main/resources/" + fileName + ".xlsx");
            //FileInputStream fs = new FileInputStream(testData);

            //workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = null;

//            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
//                if (workbook.getSheetName(i).equalsIgnoreCase(getProperties("config", "ENV"))) {
//                    sheet = workbook.getSheetAt(i);
//                    break;
//                }
//            }
            sheet = workbook.getSheetAt(0);

            Iterator<Row> row = sheet.iterator(); //give access to all the rows

            int maxCol = row.next().getLastCellNum(); //get last cell number i.e column number

            Object obj[][] = new Object[sheet.getLastRowNum()][maxCol];

            for (int i = 0; i < sheet.getLastRowNum(); i++) {
                Row row1 = sheet.getRow(i+1); // one particular row
                for (int j = 0; j < maxCol; j++) {
//                    System.out.println(row1.getCell(j));

                    obj[i][j] = row1.getCell(j).getStringCellValue();

                }

                System.out.println("\n");
            }
            return obj;
        }

        finally {
            workbook.close();
        }
    }


}

