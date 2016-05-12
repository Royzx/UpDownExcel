package com.xfn.mf.bean;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by po on 16/5/11.
 */
public class User {

    private String userid;

    private String password;

    private String username;

    private String defaultsobid;

    private int level;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDefaultsobid() {
        return defaultsobid;
    }

    public void setDefaultsobid(String defaultsobid) {
        this.defaultsobid = defaultsobid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", defaultsobid='" + defaultsobid + '\'' +
                ", level=" + level +
                '}';
    }

    public JSONObject toJSONObject()
    {
        JSONObject json = new JSONObject();
        json.put("userid",userid);
        json.put("password",password);
        json.put("username",username);
        json.put("defaultsobid",defaultsobid);
        json.put("level",level);
        return json;
    }
}















