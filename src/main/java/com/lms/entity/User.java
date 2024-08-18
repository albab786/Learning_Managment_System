package com.lms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String mob_no;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserAddress> address;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private Boolean is_active;
}
