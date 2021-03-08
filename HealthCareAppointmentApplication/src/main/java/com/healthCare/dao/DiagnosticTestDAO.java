package com.healthCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthCare.model.DiagnosticTest;

public interface DiagnosticTestDAO extends JpaRepository<DiagnosticTest, Integer> {

}