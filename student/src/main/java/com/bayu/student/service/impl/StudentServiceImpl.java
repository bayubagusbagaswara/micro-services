package com.bayu.student.service.impl;

import com.bayu.student.dto.CreateStudentRequest;
import com.bayu.student.dto.CreateStudentResponse;
import com.bayu.student.dto.StudentDTO;
import com.bayu.student.entity.Student;
import com.bayu.student.repository.StudentRepository;
import com.bayu.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

        CreateStudentResponse response = new CreateStudentResponse();
        response.setId(student.getId());
        response.setFirstName(student.getFirstName());
        response.setLastName(student.getLastName());
        response.setEmail(student.getEmail());
        response.setSchoolId(student.getSchoolId());

        return response;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(student -> {
                    StudentDTO studentDTO = new StudentDTO();
                    student.setId(student.getId());
                    student.setFirstName(student.getFirstName());
                    student.setLastName(student.getLastName());
                    student.setEmail(student.getEmail());
                    student.setSchoolId(student.getSchoolId());
                    return studentDTO;
                })
                .toList();
    }

}
