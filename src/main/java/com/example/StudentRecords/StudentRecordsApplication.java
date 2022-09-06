package com.example.StudentRecords;

import com.example.StudentRecords.Student.Student;
import org.springframework.beans.factory.parsing.PassThroughSourceExtractor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class StudentRecordsApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentRecordsApplication.class, args);
	}

}
