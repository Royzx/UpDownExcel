package com.xfn.mf.service;

import com.xfn.mf.bean.AC;
import com.xfn.mf.enums.ReturnMessageEnum;

import java.util.List;

/**
 * Created by po on 16/5/18.
 */
public interface HssfService {
    ReturnMessageEnum resolveAClist(List<AC> list);
}
