package com.bayu.school.service.impl;

import com.bayu.school.dto.CreateSchoolRequest;
import com.bayu.school.dto.CreateSchoolResponse;
import com.bayu.school.dto.SchoolDTO;
import com.bayu.school.repository.SchoolRepository;
import com.bayu.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Override
    public CreateSchoolResponse save(CreateSchoolRequest request) {
        return null;
    }

    @Override
    public List<SchoolDTO> getAllSchools() {
        return null;
    }
}
