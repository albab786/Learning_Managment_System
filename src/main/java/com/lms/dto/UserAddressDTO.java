package com.lms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddressDTO {
    private Long address_id;
    private String house_no;
    private String city;
    private int zipcode;
    private String street;
}
