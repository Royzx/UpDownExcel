package com.xfn.mf.fliter;

import com.xfn.mf.util.MultipleDataSource;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by po on 16/6/2.
 */
public class DataSourceFilter implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {


        MultipleDataSource.setDataSourceKey("logDataSource");

        System.out.println("当前datasource:logDataSource");

        Object result = invocation.proceed();

        MultipleDataSource.setDataSourceKey("xfnDataSource");

        return result;
    }
}
