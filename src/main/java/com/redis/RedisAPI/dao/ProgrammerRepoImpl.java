package com.redis.RedisAPI.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class ProgrammerRepoImpl implements ProgrammerRepo {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void setProgrammerAsAString(String idKey, String programmer) {
        redisTemplate.opsForValue().set(idKey, programmer);
        redisTemplate.expire(idKey, 10, TimeUnit.SECONDS);

    }

    @Override
    public String getProgrammerAsAString(String idKey) {
        return (String) redisTemplate.opsForValue().get(idKey);
    }

}
