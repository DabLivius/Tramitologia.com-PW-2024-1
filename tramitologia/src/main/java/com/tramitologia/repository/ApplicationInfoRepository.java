package com.tramitologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tramitologia.model.ApplicationInfo;

@Repository
public interface ApplicationInfoRepository extends JpaRepository<ApplicationInfo, Long>{

}
