package com.healthCare.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.healthCare.dao.AppointmentDAO;
import com.healthCare.dao.DiagnosticTestDAO;
import com.healthCare.model.Appointment;
import com.healthCare.model.DiagnosticTest;
import com.healthCare.service.IAppointmentService;

@SpringBootTest
public class TestAppointmentService {

	@MockBean
	private AppointmentDAO appointmentDao;
	@Autowired
	private IAppointmentService appointmentService;
	
}
