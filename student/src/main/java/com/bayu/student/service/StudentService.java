package com.bayu.student.service;

import com.bayu.student.dto.CreateStudentRequest;
import com.bayu.student.dto.CreateStudentResponse;

public interface StudentService {

    CreateStudentResponse save(CreateStudentRequest request);
}
