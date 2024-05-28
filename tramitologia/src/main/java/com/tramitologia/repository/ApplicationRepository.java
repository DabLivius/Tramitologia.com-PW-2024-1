package com.tramitologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tramitologia.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>{

}
