package com.xfn.mf.poi;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 59215_000 on 2016/5/16.
 */
public class PoiReadExcel {

    public static void main(String[] args) {
        File file = new File("D:/poi.xls");
        try {
            FileInputStream stream = FileUtils.openInputStream(file);
            HSSFWorkbook workbook = new HSSFWorkbook(stream);
            HSSFSheet sheet = workbook.getSheet("Sheet0");
            int lastRowNum = sheet.getLastRowNum();
            for (int i = 0 ;i<lastRowNum;i++){
                HSSFRow row =  sheet.getRow(i);
                int lastCellNum = row.getLastCellNum();
                for (int j = 0 ;j<lastCellNum;j++){
                    HSSFCell cell = row.getCell(j);
                    String value = cell.getStringCellValue();
                    System.out.print(value+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
