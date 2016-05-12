package com.xfn.mf.util;
import com.xfn.mf.bean.User;
import com.xfn.mf.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

/**
 * Created by po on 16/5/11.
 */

public class TestUtil {

    @Test
    public void test() throws IOException {
        File file = new File("\\Users\\po\\Documents\\logs\\test.txt");
        System.out.println(file.getAbsolutePath());
        // System.out.println(file.createNewFile());
        DownFile downFile = new DownFile();
        ResponseEntity res = downFile.download("\\Users\\po\\Documents\\logs\\",file);
        System.out.println(res.toString());
}
}
