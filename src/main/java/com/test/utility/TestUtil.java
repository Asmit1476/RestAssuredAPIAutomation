package com.test.utility;
import com.excel.utility.Xls_Reader;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import static com.excel.utility.Xls_Reader.getExcelFile;

public class TestUtil {
    static Xls_Reader reader;

    public static Object[][] getDataFromExcel() throws IOException, ParseException {
        //ArrayList<Object[]> myData = new ArrayList<Object[]>();

        try {

            reader = new Xls_Reader("/Users/asmit/Documents/Web Automation Template/Web_Automation_Template/Training2022/src/main/java/com/testdata/data.xlsx");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return getExcelFile();

    }
}
