package com.xfn.mf.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import static com.xfn.mf.util.UpLoadFile.uploadFile;

/**
 * Created by po on 16/5/12.
 */
@Controller
@RequestMapping("/test")
public class TestFileUploadController {


    @RequestMapping("/upload")
    @ResponseBody
    public JSONObject upload(HttpServletRequest request) throws IOException {

        uploadFile(request);
        JSONObject json = new JSONObject();
        json.put("msg","ok");
        json.put("errcode","0");

        return json;
    }
}
