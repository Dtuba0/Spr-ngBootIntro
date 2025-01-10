package com.tpe.domain;

import java.time.LocalDateTime;

public class Student {

    private Long id;
    private String name;
    private String lastname;
    private Integer grade;
    private String email;
    private LocalDateTime createDate=LocalDateTime.now();

}
