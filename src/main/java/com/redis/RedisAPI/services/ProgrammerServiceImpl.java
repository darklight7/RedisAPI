package com.redis.RedisAPI.services;


import com.redis.RedisAPI.dao.ProgrammerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProgrammerServiceImpl implements ProgrammerService {

	@Autowired
	ProgrammerRepo repository;



	@Override
	public void setProgrammerAsString(String idKey, String programmer) {
		repository.setProgrammerAsAString(idKey,programmer);
		
	}

	@Override
	public String getProgrammerAsString(String key) {
		return 	repository.getProgrammerAsAString(key);
	}



}
