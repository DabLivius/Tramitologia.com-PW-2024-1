package com.tramitologia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramitologia.model.ApplicationInfo;
import com.tramitologia.repository.ApplicationInfoRepository;

@Service
public class ApplicationInfoServiceImpl implements ApplicationInfoService{
	
	@Autowired
	private ApplicationInfoRepository applicationInfoRepository;
	
	@Override
	public List<ApplicationInfo> getAllApplicationInfos() {
		return applicationInfoRepository.findAll();
	}

	@Override
	public void saveApplication(ApplicationInfo applicationInfo) {
		this.applicationInfoRepository.save(applicationInfo);
		
	}
	
}
