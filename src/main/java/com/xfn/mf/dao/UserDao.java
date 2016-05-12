package com.xfn.mf.dao;

import com.xfn.mf.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by po on 16/5/11.
 */
@Repository
public interface UserDao {

    public User getUser(String userid);
}
