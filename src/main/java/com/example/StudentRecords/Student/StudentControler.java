package com.example.StudentRecords.Student;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentControler {


    @GetMapping
    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Ajay Kumar",
                "ajaykumar@gmail.com",
                LocalDate.of(2000, Month.JANUARY,5),
                21
        ),
                new Student(
                        2L,
                        "pushpa",
                        "jiya@gmail.com",
                        LocalDate.of(2002, Month.JANUARY,5),
                        20
                ));
    }
}
