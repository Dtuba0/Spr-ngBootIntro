package com.tpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller farkı ResponseBody : methodun donus degerını json formatında cevap olarak hazırlanır
//json formati oop'ye uygun bir format xml formati ile de alabiliriz txt formati ilede alabiliriz
@RestController
@RequestMapping("/students")//https://localhost:8080/students....
public class StudentController {



}
