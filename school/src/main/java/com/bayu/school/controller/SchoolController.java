package com.bayu.school.controller;

import com.bayu.school.dto.CreateSchoolRequest;
import com.bayu.school.dto.CreateSchoolResponse;
import com.bayu.school.dto.SchoolDTO;
import com.bayu.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateSchoolResponse save(@RequestBody CreateSchoolRequest request) {
        return schoolService.save(request);
    }

    @GetMapping
    public ResponseEntity<List<SchoolDTO>> getAllSchools() {
        List<SchoolDTO> allSchools = schoolService.getAllSchools();
        return ResponseEntity.ok(allSchools);
    }

}
