package com.bayu.school.client;

import com.bayu.school.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping(path = "/school/{school-id}")
    List<StudentDTO> findAllStudentsBySchool(@PathVariable(name = "school-id") Integer schoolId);

}
