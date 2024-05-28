package com.tramitologia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramitologia.model.Application;
import com.tramitologia.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Override
	public List<Application> getAllApplications() {
		return applicationRepository.findAll();
	}

	@Override
	public void saveApplication(Application application) {
		this.applicationRepository.save(application);
		
	}
	
}
