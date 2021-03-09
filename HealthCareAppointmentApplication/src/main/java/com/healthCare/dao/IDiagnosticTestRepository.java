package com.healthCare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthCare.model.DiagnosticTest;


public interface IDiagnosticTestRepository extends JpaRepository<DiagnosticTest, Integer>{
	public List<DiagnosticTest> findByCenterId(int centerId);
}
