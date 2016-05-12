package com.xfn.mf.util;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by po on 16/5/12.
 */
public class UpLoadFile {

    public static void uploadFile(HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest mrequest = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> fileMap = mrequest.getFileMap();
        Iterator<Map.Entry<String, MultipartFile>> it = fileMap.entrySet().iterator();
        if (it.hasNext()){
            Map.Entry<String, MultipartFile> entry = it.next();
            MultipartFile mFile = entry.getValue();
            if(mFile.getSize() != 0 && !"".equals(mFile.getName())){
                write(mFile.getInputStream());
            }
        }
    }


    public static void write(InputStream in){
        byte[] buff = new byte[1024];
        int i = -1;
        try {
            while ((i=in.read(buff)) != -1){
                String s = new String(buff,"GBK");
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
