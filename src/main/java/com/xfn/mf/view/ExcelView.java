package com.xfn.mf.view;

import com.xfn.mf.bean.AC;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by po on 16/5/12.
 */
public class ExcelView extends AbstractExcelView{
    protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<AC> list = (List<AC>) model.get("infoList");
        if (list != null && list.size() != 0){
            int len = list.size();
            Sheet sheet = workbook.createSheet();

            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0,Cell.CELL_TYPE_STRING);
            cell.setCellValue("科目编号");
            cell = row.createCell(1,Cell.CELL_TYPE_STRING);
            cell.setCellValue("科目名称");



        }


    }
}
