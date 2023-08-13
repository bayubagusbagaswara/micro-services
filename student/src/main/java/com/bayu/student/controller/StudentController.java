package com.bayu.student.controller;

import com.bayu.student.dto.CreateStudentRequest;
import com.bayu.student.dto.CreateStudentResponse;
import com.bayu.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateStudentResponse save(@RequestBody CreateStudentRequest request) {
        return studentService.save(request);
    }

}
