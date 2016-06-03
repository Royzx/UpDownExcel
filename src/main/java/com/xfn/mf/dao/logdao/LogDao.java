package com.xfn.mf.dao.logdao;

import com.xfn.mf.bean.Log;
import org.springframework.stereotype.Repository;

/**
 * Created by po on 16/6/2.
 */
@Repository
public interface LogDao {

    Log getLog(int logid);
}

