package com.xfn.mf.util;

import com.xfn.mf.bean.AC;

import java.util.List;

/**
 * Created by po on 16/5/18.
 */
public class ACUtil {

    static int x = 1;
    public static int i = 0;

    public static void setACLR(List<AC> acList) {


        if (i == acList.size() - 1) {
            acList.get(i).setLeft(x);
            x++;
            acList.get(i).setRight(x);
            x++;
        } else if (!acList.get(i).getAccode().equals(acList.get(i + 1).getUpperid())) {
            acList.get(i).setLeft(x);
            x++;
            acList.get(i).setRight(x);
            x++;
            i++;
        } else {
            int t = i;
            acList.get(t).setLeft(x);
            x++;
            i++;
            boolean flag = true;
            while (flag) {
                if (i == acList.size() - 1) {
                    if (acList.get(t).getAccode().equals(acList.get(i).getUpperid())) {
                        setACLR(acList);
                    }
                    break;
                }
                if (acList.get(t).getAccode().equals(acList.get(i).getUpperid())) {
                    setACLR(acList);
                } else {
                    flag = false;
                }
            }
            acList.get(t).setRight(x);
            x++;
        }
    }
}
