package com.tramitologia.service;

import java.util.List;

import com.tramitologia.model.Application;

public interface ApplicationService {
	List<Application>getAllApplications();

	void saveApplication(Application application);
}
