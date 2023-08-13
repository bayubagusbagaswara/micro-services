package com.bayu.student.service.impl;

import com.bayu.student.repository.StudentRepository;
import com.bayu.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

}
