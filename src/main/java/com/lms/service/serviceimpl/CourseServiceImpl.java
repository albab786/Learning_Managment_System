package com.lms.service.serviceimpl;

import com.lms.dto.CourseDTO;
import com.lms.dto.CustomResponse;
import com.lms.entity.Course;
import com.lms.repository.CourseRepository;
import com.lms.service.CourseService;
import com.lms.utility.ApiResponse;
import com.lms.utility.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public ApiResponse addDetails(CourseDTO course) {
        Course c=new Course();
        c.setCourse_category(course.getCourse_category());
        c.setCourse_information(course.getCourse_information());
        c.setCourse_title(course.getCourse_title());
        courseRepository.save(c);
        return new ApiResponse(Constant.CREATED_MSG,Constant.SUCCESS_CODE,Constant.STATUS_MSG);
    }

    @Override
    public CustomResponse getAllDetails(CourseDTO course) {
        Long courseId=course.getCourse_id();
        if(courseId!=null){
            Course c=courseRepository.findById(courseId).get();
            return  new CustomResponse(courseRepository.findById(courseId),HttpStatus.OK.getReasonPhrase(),HttpStatus.OK.value());
        }
      return   new CustomResponse(courseRepository.findAll(), HttpStatus.OK.getReasonPhrase(),HttpStatus.OK.value());
    }
    @Override
    public ApiResponse updateDetails(Long id, CourseDTO course) {
        Course existingCourse = courseRepository.findById(id).orElse(null);
        if (existingCourse != null) {
            existingCourse.setCourse_title(course.getCourse_title());
            existingCourse.setCourse_information(course.getCourse_information());
            existingCourse.setCourse_category(course.getCourse_category());
            courseRepository.save(existingCourse);
            return new ApiResponse(Constant.CREATED_MSG, Constant.SUCCESS_CODE, Constant.STATUS_MSG);
        } else {
            return new ApiResponse(Constant.FAILURE_CODE, Constant.FAILURE_CODE, Constant.STATUS_MSG);
        }
    }

}
