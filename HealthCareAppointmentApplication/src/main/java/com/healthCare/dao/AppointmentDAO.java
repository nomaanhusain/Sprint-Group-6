package com.healthCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.healthCare.model.Appointment;

public interface AppointmentDAO extends JpaRepository<Appointment,Integer> {

}
