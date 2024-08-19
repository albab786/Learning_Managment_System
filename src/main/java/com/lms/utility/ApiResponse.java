package com.lms.utility;

import lombok.Data;

@Data

public class ApiResponse {

    private String msg;
    private String statusCode;
    private Object data;

    private  String statusMessage;

    public ApiResponse(String msg, String statusCode, String statusMessage) {
        this.msg = msg;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public ApiResponse(String msg, String statusCode, Object data) {
        this.msg = msg;
        this.statusCode = statusCode;
        this.data = data;
    }
}
