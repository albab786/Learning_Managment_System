package com.lms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lms.entity.UserType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private long id;
    private String name;
    private String email;
    private String mob_no;
    private UserType userType;
}
