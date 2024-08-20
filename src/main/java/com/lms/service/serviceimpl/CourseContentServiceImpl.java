package com.lms.service.serviceimpl;

import com.lms.dto.CourseContentDTO;
import com.lms.dto.CustomResponse;
import com.lms.entity.CourseContent;
import com.lms.repository.CourseContentRepository;
import com.lms.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CourseContentServiceImpl implements CourseContentService {
    @Autowired
    private CourseContentRepository courseContentRepository;
    @Override
    public CustomResponse addCourseContent(CourseContentDTO courseContentDTO) {
        CourseContent cc=new CourseContent();
        cc.setCourse_title(courseContentDTO.getCourse_title());
        cc.setLanguage(courseContentDTO.getLanguage());
        cc.setSkill_level(courseContentDTO.getSkill_level());
        cc.setCount_of_videos(courseContentDTO.getCount_of_videos());


        return new CustomResponse(courseContentRepository.save(cc),"SUCCESSFULL", HttpStatus.OK.value());
    }
}
