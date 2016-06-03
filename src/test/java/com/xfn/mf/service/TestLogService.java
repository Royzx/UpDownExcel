package com.xfn.mf.service;

import com.xfn.mf.bean.Log;
import com.xfn.mf.util.MultipleDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by po on 16/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestLogService {

    @Resource
    private LogService logService;

    @Test
    public void testGetLog(){
        Log log =logService.getLog(1);
        System.out.println("成功"+log);
    }
}
