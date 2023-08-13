package com.bayu.student.service;

import com.bayu.student.dto.CreateStudentRequest;
import com.bayu.student.dto.CreateStudentResponse;
import com.bayu.student.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    CreateStudentResponse save(CreateStudentRequest request);

    List<StudentDTO> getAllStudents();

}
