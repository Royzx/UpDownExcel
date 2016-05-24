package com.xfn.mf.dao;

import com.xfn.mf.bean.AC;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by po on 16/5/18.
 */
@Repository
public interface ACDao {
    int uploadAC(List<AC> acList);

    List<AC> getACList(String sobid);
}

