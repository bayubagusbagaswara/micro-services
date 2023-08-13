package com.bayu.student.service.impl;

import com.bayu.student.dto.CreateStudentRequest;
import com.bayu.student.dto.CreateStudentResponse;
import com.bayu.student.entity.Student;
import com.bayu.student.repository.StudentRepository;
import com.bayu.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public CreateStudentResponse save(CreateStudentRequest request) {
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setSchoolId(request.getSchoolId());

        studentRepository.save(student);

        return CreateStudentResponse.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .schoolId(student.getSchoolId())
                .build();
    }

}
