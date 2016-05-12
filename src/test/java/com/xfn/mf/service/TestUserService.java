package com.xfn.mf.service;
import com.xfn.mf.bean.User;
import com.xfn.mf.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by po on 16/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestUserService {

    @Resource
    private IUserService userService;

    @Test
    public void test()
    {
       User user = userService.getUser("18720971071");
        System.out.println(user.toString());
    }
}
