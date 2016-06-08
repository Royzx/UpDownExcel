package com.xfn.mf.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by po on 16/6/3.
 */
public class ExpireJobTask {

    private final static Logger logger = LoggerFactory.getLogger(ExpireJobTask.class);

    public void doBiz(){
        try {
            String urlString = "http://10.0.0.99:3000/server/user/heart";
            CloseableHttpClient httpClient = HttpClients.createDefault();
            URI url = new URI(urlString);
            HttpGet get = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(get);
            HttpEntity entity=response.getEntity();
            String s = EntityUtils.toString(entity);
            System.out.println("接收到的数据为:"+s);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
