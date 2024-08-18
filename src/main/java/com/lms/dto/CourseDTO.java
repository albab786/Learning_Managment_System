package com.lms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDTO {
    private Long course_id;
    private String course_title;
    private String course_information;
    private String course_category;
}
