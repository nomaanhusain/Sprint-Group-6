package com.healthCare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthCare.model.DiagnosticTest;


public interface DiagnosticTestDAO extends JpaRepository<DiagnosticTest, Integer> {
	
}
