package com.xfn.mf.util;

import com.xfn.mf.bean.AC;
import org.junit.Test;

import javax.ejb.Remove;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by po on 16/5/13.
 */

public class TestTreeMap {


    static  int x = 1;
    static  int i = 0;
//    static boolean flag = true;

    @Test
    public void testTreeMap(){
        TreeMap<String,AC> acTreeMap = new TreeMap<String, AC>();
        AC ac = new AC();
        ac.setAccode("1001");
        AC ac1 = new AC();
        ac1.setAccode("100101");
        AC ac2 = new AC();
        ac2.setAccode("10010101");
        AC ac3 = new AC();
        ac3.setAccode("10010102");
        AC ac4 = new AC();
        ac4.setAccode("100102");

        acTreeMap.put("100102",  ac4);
        acTreeMap.put("1001",    ac);
        acTreeMap.put("100101",  ac1);
        acTreeMap.put("10010101",ac2);
        acTreeMap.put("10010102",ac3);


        for (Map.Entry<String,AC> entry: acTreeMap.entrySet()) {
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

    }

    @Test
    public void testList() {
        AC ac = new AC();
        ac.setAccode("1001");
        AC ac1 = new AC();
        ac1.setAccode("100101");
        ac1.setParent("1001");
        AC ac2 = new AC();
        ac2.setAccode("10010101");
        ac2.setParent("100101");
        AC ac3 = new AC();
        ac3.setAccode("10010102");
        ac3.setParent("100101");
        AC ac4 = new AC();
        ac4.setAccode("100102");
        ac4.setParent("1001");
        AC ac5 = new AC();
        ac5.setAccode("10010201");
        ac5.setParent("100102");
        AC ac6 = new AC();
        ac6.setAccode("1001020101");
        ac6.setParent("10010201");

        List<AC> acList = new ArrayList<AC>();
        acList.add(ac);
        acList.add(ac1);
        acList.add(ac2);
        acList.add(ac3);
        acList.add(ac4);
        acList.add(ac5);
        acList.add(ac6);

        this.ishasNext(acList);

        for (int j = 0 ;j<acList.size();j++){
            System.out.println(acList.get(j));
        }

    }

    private void ishasNext(List<AC> acList) {


        if (i == acList.size() - 1) {
            acList.get(i).setLeft(x + "");
            x++;
            acList.get(i).setRight(x + "");
            x++;
        } else if (!acList.get(i).getAccode().equals(acList.get(i + 1).getParent())) {
            acList.get(i).setLeft(x + "");
            x++;
            acList.get(i).setRight(x + "");

            x++;
            i++;
        } else {
            int t = i;
            acList.get(t).setLeft(x + "");
            x++;
            i++;
            boolean flag = true;
            while(flag){
                if (i == acList.size()-1){
                    if (acList.get(t).getAccode().equals(acList.get(i).getParent())){
                        ishasNext(acList);
                    }
                    break;
                }
                if (acList.get(t).getAccode().equals(acList.get(i).getParent())) {
                    ishasNext(acList);
                }else{
                    flag = false;
                }
            }
            acList.get(t).setRight(x + "");
            x++;
        }
    }

}



















