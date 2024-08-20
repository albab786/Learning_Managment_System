package com.lms.service;

import com.lms.dto.CourseDTO;
import com.lms.dto.CustomResponse;
import com.lms.utility.ApiResponse;

import java.util.List;

public interface CourseService {
    ApiResponse addDetails(CourseDTO course);

    CustomResponse getAllDetails(CourseDTO course);

    ApiResponse updateDetails(Long id, CourseDTO course);


}
