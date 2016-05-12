package com.xfn.mf.bean;

/**
 * Created by po on 16/5/12.
 */
public class AC {

    private String accode;

    private String acname;

    private String category;

    //private ASS ass;

    private String direction;

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

    @Override
    public String toString() {
        return "AC{" +
                "accode='" + accode + '\'' +
                ", acname='" + acname + '\'' +
                ", category='" + category + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }

}
