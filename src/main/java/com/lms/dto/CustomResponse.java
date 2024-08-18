package com.lms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class CustomResponse {

    private Object data;
    private String message;
    private Integer responseCode;

    public CustomResponse(Object data, String message, Integer responseCode) {
        this.data = data;
        this.message = message;
        this.responseCode = responseCode;
    }
}
