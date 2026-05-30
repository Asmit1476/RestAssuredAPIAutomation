package readCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadCSV {
    public static void main(String[] args) {
        String file = "/Users/asmit/Documents/Web Automation Template/Web_Automation_Template/Training2022/src/main/java/readCSV/Data/dummy.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));

            while((line = reader.readLine()) != null){

                String[] row = line.split(" ,");
                System.out.println("Name is:" +row);


            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
