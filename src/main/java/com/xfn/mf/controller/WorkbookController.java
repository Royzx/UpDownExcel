package com.xfn.mf.controller;

import com.xfn.mf.bean.AC;
import com.xfn.mf.view.ExcelView;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by po on 16/5/12.
 */
@Controller
@RequestMapping("file")
public class WorkbookController {

    @RequestMapping("upload")
    public ModelAndView uploadExcel(@RequestParam("file")MultipartFile file){
        List<AC> list = new ArrayList<AC>();
        String filename = file.getOriginalFilename();
        if (filename.contains("xls")) {
            try {
                Workbook wb = new HSSFWorkbook(file.getInputStream());
                Sheet sheet = wb.getSheetAt(0);
                Row row = sheet.getRow(0);
                String isAss = row.getCell(3).getStringCellValue();
                if (isAss.equals("辅助核算")){
                    for (int i = 1;i <= sheet.getLastRowNum();i++){
                        row = sheet.getRow(i);
                        AC ac = new AC();
                        ac.setAccode(row.getCell(0).getStringCellValue());
                        ac.setAcname(row.getCell(1).getStringCellValue());
                        ac.setCategory(row.getCell(2).getStringCellValue());
                        ac.setDirection(row.getCell(4).getStringCellValue());
                        list.add(ac);
                    }
                }else {
                    for (int i = 1;i <= sheet.getLastRowNum();i++){
                        row = sheet.getRow(i);
                        AC ac = new AC();
                        ac.setAccode(row.getCell(0).getStringCellValue());
                        ac.setAcname(row.getCell(1).getStringCellValue());
                        ac.setCategory(row.getCell(2).getStringCellValue());
                        ac.setDirection(row.getCell(3).getStringCellValue());
                        list.add(ac);
                    }
                }


            }catch (IOException e){
                e.printStackTrace();
            }
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("message","this is test");
        mav.addObject("content",list);
        mav.setViewName("jsp/view");
        return mav;
    }

    @RequestMapping("/download")
    public ModelAndView downloanExcel(){
        List<AC> list = new ArrayList<AC>();
        AC ac = new AC();
        ac.setAccode("1001");
        ac.setAcname("库存现金");
        ac.setCategory("流动资金");
        ac.setDirection("借");
        list.add(ac);
        list.add(ac);
        list.add(ac);
        list.add(ac);
        Map<String,List<AC>> map = new HashMap<String, List<AC>>();
        map.put("infoList",list);
        ExcelView ve = new ExcelView();
        return new ModelAndView(ve,map);
    }
}
