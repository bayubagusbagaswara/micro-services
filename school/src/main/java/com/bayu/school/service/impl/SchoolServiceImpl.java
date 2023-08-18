package com.bayu.school.service.impl;

import com.bayu.school.client.StudentClient;
import com.bayu.school.dto.CreateSchoolRequest;
import com.bayu.school.dto.CreateSchoolResponse;
import com.bayu.school.dto.FullSchoolResponse;
import com.bayu.school.dto.SchoolDTO;
import com.bayu.school.entity.School;
import com.bayu.school.repository.SchoolRepository;
import com.bayu.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private StudentClient studentClient;

    @Override
    public CreateSchoolResponse save(CreateSchoolRequest request) {
        School school = new School();
        school.setName(request.getName());
        school.setEmail(request.getEmail());

        schoolRepository.save(school);
        CreateSchoolResponse response = new CreateSchoolResponse();
        response.setId(school.getId());
        response.setName(school.getName());
        response.setEmail(school.getEmail());

        return response;
    }

    @Override
    public List<SchoolDTO> getAllSchools() {
        return schoolRepository.findAll().stream()
                .map(school -> {
                    SchoolDTO dto = new SchoolDTO();
                    dto.setId(school.getId());
                    dto.setName(school.getName());
                    dto.setEmail(school.getEmail());
                    return dto;
                })
                .toList();
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        School school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        // find all the students from the student microservice
        return null;
    }
}
