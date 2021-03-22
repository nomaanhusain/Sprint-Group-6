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
	
	public void testAddNewAppointment() {
		Optional<Appointment> dt=Optional.ofNullable(new Appointment(1, "2021-03-23" , "False", null, null, null, null));
		when(appointmentDao.save(dt.get())).thenReturn(dt.get());
		when(appointmentDao.findById(dt.get().getAppointmentId())).thenReturn(dt);
		assertEquals(dt.get().getAppointmentId(), appointmentService.addAppointment(dt.get()).getAppointmentId());
	}
}
