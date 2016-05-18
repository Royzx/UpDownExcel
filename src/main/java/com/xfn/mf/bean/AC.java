package com.xfn.mf.bean;

import java.io.Serializable;

/**
 * Created by po on 16/5/12.
 */
public class AC implements Serializable,Comparable<AC>{

    private String accode;

    private String acname;

    private String category;

    //private ASS ass;

    private String direction;

    private int left;

    private int right;

    private String upperid;

    private String sobid;

    public String getAccode() {
        return accode;
    }

    public void setAccode(String accode) {
        this.accode = accode;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public String getUpperid() {
        return upperid;
    }

    public void setUpperid(String upperid) {
        this.upperid = upperid;
    }

    public String getSobid() {
        return sobid;
    }

    public void setSobid(String sobid) {
        this.sobid = sobid;
    }

    @Override
    public String toString() {
        return "AC{" +
                "sobid='" + sobid + '\'' +
                "accode='" + accode + '\'' +
                ", acname='" + acname + '\'' +
                ", category='" + category + '\'' +
                ", direction='" + direction + '\'' +
                ", left='" + left + '\'' +
                ", right='" + right + '\'' +
                ", parent='" + upperid + '\'' +
                '}';
    }

    public int compareTo(AC o) {
        return this.accode.compareTo(o.getAccode());
    }
}
