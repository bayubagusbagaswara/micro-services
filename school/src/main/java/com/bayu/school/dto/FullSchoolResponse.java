package com.bayu.school.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FullSchoolResponse {

    private String name; // school name

    private String email; // school email

    List<StudentDTO> students; // list of students
}
