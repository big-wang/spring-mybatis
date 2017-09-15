package com.wangbr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangbr.entity.CertEntity;
import com.wangbr.mapper.ICertRepository;

@Service
public class TransactionTestService {
	@Autowired
	ICertRepository certRepo;
	
	public boolean insertTo() throws Exception{
		CertEntity certEnt=new CertEntity();
		certEnt.setCertnum("23455");
		certEnt.setName("xxmei");
		certRepo.insertCert(certEnt);
		return true;
	}
	
}
