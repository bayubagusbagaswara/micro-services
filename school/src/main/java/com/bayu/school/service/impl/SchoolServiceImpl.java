package com.bayu.school.service.impl;

import com.bayu.school.dto.CreateSchoolRequest;
import com.bayu.school.dto.CreateSchoolResponse;
import com.bayu.school.dto.SchoolDTO;
import com.bayu.school.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Override
    public CreateSchoolResponse save(CreateSchoolRequest request) {
        return null;
    }

    @Override
    public List<SchoolDTO> getAllSchools() {
        return null;
    }
}
