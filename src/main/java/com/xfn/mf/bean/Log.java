package com.xfn.mf.bean;

import java.io.Serializable;

/**
 * Created by po on 16/6/2.
 */
public class Log implements Serializable{

    private int logid;

    private String logname;

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    @Override
    public String toString() {
        return "Log{" +
                "logid=" + logid +
                ", logname='" + logname + '\'' +
                '}';
    }
}
