package com.wangbr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangbr.Model.HelloModel;
import com.wangbr.entity.CertEntity;
import com.wangbr.mapper.ICertRepository;
import com.wangbr.service.TransactionTestService;

@Controller
@RequestMapping(value = "/")
public class Hello  {
	@Autowired
	ICertRepository certRepo;
	@Autowired
	TransactionTestService testService;
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public String getUser(HelloModel hello) throws Exception {
		List<CertEntity> qryCerts = certRepo.qryCert();
		CertEntity certEntity = qryCerts.get(0);
		testService.insertTo();
		return "王";
	}
	public ICertRepository getCertRepo() {
		return certRepo;
	}
	public void setCertRepo(ICertRepository certRepo) {
		this.certRepo = certRepo;
	}
	public TransactionTestService getTestService() {
		return testService;
	}
	
	public void setTestService(TransactionTestService testService) {
		this.testService = testService;
	}
	
	
	
	
	
	
}