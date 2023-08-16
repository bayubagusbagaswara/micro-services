package com.bayu.school.service;

import com.bayu.school.dto.CreateSchoolRequest;
import com.bayu.school.dto.CreateSchoolResponse;

public interface SchoolService {

    CreateSchoolResponse save(CreateSchoolRequest request);
}
