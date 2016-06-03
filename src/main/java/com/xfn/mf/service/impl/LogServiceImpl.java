package com.xfn.mf.service.impl;

import com.xfn.mf.bean.Log;
import com.xfn.mf.dao.logdao.LogDao;
import com.xfn.mf.service.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by po on 16/6/2.
 */
@Service("logService")
public class LogServiceImpl implements LogService {

    @Resource
    private LogDao logDao;

    public Log getLog(int logid) {
        Log log = logDao.getLog(logid);
        System.out.println("log:"+log.toString());
        return log;
    }
}
