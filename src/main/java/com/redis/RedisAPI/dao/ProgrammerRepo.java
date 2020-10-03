package com.redis.RedisAPI.dao;

public interface ProgrammerRepo {

    void setProgrammerAsAString(String idKey ,String programmer);

    String getProgrammerAsAString (String idKey);

}
