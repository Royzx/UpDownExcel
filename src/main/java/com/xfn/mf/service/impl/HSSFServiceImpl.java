package com.xfn.mf.service.impl;

import com.xfn.mf.bean.AC;
import com.xfn.mf.dao.ACDao;
import com.xfn.mf.enums.ReturnMessageEnum;
import com.xfn.mf.service.HssfService;
import com.xfn.mf.util.ACUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.xfn.mf.enums.ReturnMessageEnum.returnMsg;
import static com.xfn.mf.util.ACUtil.setACLR;

/**
 * Created by po on 16/5/18.
 */
@Service("hssfService")
public class HssfServiceImpl implements HssfService {

    private ACDao acDao;

    public ReturnMessageEnum resolveAClist(List<AC> acList) {

        Collections.sort(acList);
        AC ac = null;
        List<List<AC>> lists = new ArrayList<List<AC>>();
        List<AC> onelist = null;
        for (int i = 0; i < acList.size(); i++) {
            ac = acList.get(i);
            ac.setSobid("18720971071");
            if (ac.getAccode().length() != 4 &&
                    ac.getAccode().length() != 6 &&
                    ac.getAccode().length() != 8 &&
                    ac.getAccode().length() != 10) {
                return returnMsg(1);
            }
            else if(ac.getAccode().length() == 4){
                onelist = new ArrayList<AC>();
                onelist.add(ac);
                lists.add(onelist);
            }else {
                ac.setUpperid(ac.getAccode().substring(0,ac.getAccode().length()-2));
                onelist.add(ac);
            }
        }


        for (int i = 0;i<lists.size();i++){
            setACLR(lists.get(i));
            ACUtil.i = 0;
        }

        int upload = acDao.uploadAC(acList);
        if (upload != acList.size()){
            return returnMsg(1);
        }

        return returnMsg(0);
    }

    @Resource
    public void setAcDao(ACDao acDao) {
        this.acDao = acDao;
    }
}
