package com.xfn.mf.service.impl;

import com.xfn.mf.bean.User;
import com.xfn.mf.dao.UserDao;
import com.xfn.mf.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by po on 16/5/11.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Cacheable(value = "User", key = "#userid")
    public User getUser(String userid) {
        System.out.println("userDao:" + userDao.toString());
        User user = userDao.getUser(userid);
        return user;
    }


    @CacheEvict(value = "User", key = "#userid")
    public int updateUser(String userid, String username) {
        int re = userDao.updateUser(userid, username);
        System.out.println("返回值为:" + re);
        return re;
    }

    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
