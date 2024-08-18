package com.lms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseContentDTO {
    private Long course_content_id;
    private String course_title;
    private String skill_level;
    private String language;
    private int count_of_videos;
}
