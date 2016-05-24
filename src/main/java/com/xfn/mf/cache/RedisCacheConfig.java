package com.xfn.mf.cache;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.lang.reflect.Method;

/**
 * Created by po on 16/5/24.
 */
//@Configuration
//@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport{

    /*@Bean
    public JedisConnectionFactory redisConnectionFactory(){
        JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();

        redisConnectionFactory.setHostName("127.0.0.1");
        redisConnectionFactory.setPort(6379);
        redisConnectionFactory.setPassword("931001");

        return redisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String,String> redisTemplate(JedisConnectionFactory cf){
        RedisTemplate<String,String> redisTemplate = new RedisTemplate<String, String>();
        redisTemplate.setConnectionFactory(cf);
        return  redisTemplate;
    }

    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate){

        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);

        cacheManager.setDefaultExpiration(3000);
        return cacheManager;
    }

    @Bean
    public KeyGenerator keyGenerator(){
        return new KeyGenerator() {
            public Object generate(Object o, Method method, Object... objects) {
                StringBuilder sb = new StringBuilder();
                sb.append(o.getClass().getName());
                sb.append(method.getName());
                for (Object obj :objects){
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };
    }*/
}
