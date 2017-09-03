package com.userfront.dao;

import java.util.List;

import com.userfront.model.Appointment;
import org.springframework.data.repository.CrudRepository;


public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
