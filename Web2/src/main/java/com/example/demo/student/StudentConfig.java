//package com.example.demo.student;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return  args->{
//            Student manja=new Student(
//                    1L,
//                    "Manja",
//                    "manja@gmail.com",
//                    LocalDate.of(1999, Month.SEPTEMBER,29)
//            );
//            Student kini=new Student(
//                    "Kini",
//                    "kini@gmail.com",
//                    LocalDate.of(1989, Month.AUGUST,8)
//            );
//            studentRepository.saveAll(
//                    List.of( manja,kini)
//            );
//
//        };
//    }
//}
