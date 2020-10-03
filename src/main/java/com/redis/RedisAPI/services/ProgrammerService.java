package com.redis.RedisAPI.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.redis.RedisAPI.model.Programmer;

public interface ProgrammerService {
	
	// String
		void setProgrammerAsString(String idKey, String programmer);

		String getProgrammerAsString(String key);
		

		

}
