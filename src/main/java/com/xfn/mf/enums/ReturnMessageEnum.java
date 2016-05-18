package com.xfn.mf.enums;

import com.sun.mail.imap.protocol.Item;

/**
 * Created by po on 16/5/18.
 */
public enum  ReturnMessageEnum {
    SUCCESS(0,"ok"),
    ER00001(1,"系统异常");


    private int errcode;

    private String errmsg;

    public int getErrcode() {
        return errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    ReturnMessageEnum(int errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public static ReturnMessageEnum returnMsg(int index){
        for (ReturnMessageEnum rme: values()) {
            if (rme.getErrcode() == index){
                String msg = rme.getErrmsg();
                int temp ;
                if (msg.contains("/")){
                    temp = msg.indexOf("/");
                    rme.setErrmsg(msg.substring(0,temp));
                }
                return rme;
            }
        }
        return null;
    }

    public static ReturnMessageEnum returnMsgWithExtra(int index,String extra){
        for (ReturnMessageEnum rme: values()) {
            if (rme.getErrcode() == index){
                String msg = rme.getErrmsg();
                int temp ;
                if (msg.contains("/")){
                    temp = msg.indexOf("/");
                    rme.setErrmsg(msg.substring(0,temp));
                }
                rme.setErrmsg(rme.getErrmsg()+"/"+extra);
                return rme;
            }
        }
        return null;
    }
}
