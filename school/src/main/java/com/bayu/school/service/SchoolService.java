package com.bayu.school.service;

import com.bayu.school.dto.CreateSchoolRequest;
import com.bayu.school.dto.CreateSchoolResponse;
import com.bayu.school.dto.SchoolDTO;

import java.util.List;

public interface SchoolService {

    CreateSchoolResponse save(CreateSchoolRequest request);

    List<SchoolDTO> getAllSchools();
}
