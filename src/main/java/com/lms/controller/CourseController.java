package com.lms.controller;

import com.lms.dto.CourseDTO;
import com.lms.dto.CustomResponse;
import com.lms.entity.Course;
import com.lms.service.CourseService;
import com.lms.utility.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addcourse(@RequestBody CourseDTO course) {
        ApiResponse response = courseService.addDetails(course);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping("getAllDetails")
    public CustomResponse getAllCourses(@RequestBody CourseDTO course) {

        return courseService.getAllDetails(course);
    }


}


