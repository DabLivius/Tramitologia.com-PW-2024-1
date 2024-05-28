package com.tramitologia.service;

import java.util.List;

import com.tramitologia.model.ApplicationInfo;

public interface ApplicationInfoService {
	List<ApplicationInfo> getAllApplicationInfos();

	void saveApplication(ApplicationInfo applicationInfo);
}
