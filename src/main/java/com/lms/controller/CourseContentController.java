package com.lms.controller;

import com.lms.dto.CourseContentDTO;
import com.lms.dto.CourseDTO;
import com.lms.dto.CustomResponse;
import com.lms.service.CourseContentService;
import com.lms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courseContent")
public class CourseContentController {
    @Autowired
    private CourseContentService courseContentService;
    @PostMapping("/addCourse")
    public CustomResponse addCourse(@RequestBody CourseContentDTO courseContentDTO){
       return courseContentService.addCourseContent(courseContentDTO);
    }
}
