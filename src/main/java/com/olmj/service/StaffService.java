package com.olmj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olmj.model.StaffModel;
import com.olmj.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	StaffRepository staffRepository;
	public void addStaff(StaffModel staffModel){
		staffRepository.addStaff(staffModel);
	}

}