package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getStudentList(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail=studentRepository.findStudentByEmail(student.getEmail());
//        System.out.println(student);
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentID) {
        if(studentRepository.existsById(studentID)){
            studentRepository.deleteById(studentID);
        }
        else{
            throw new IllegalStateException("NO student with given ID"+studentID);
        }
    }

    @Transactional
    public void updateStudent(Long studentID, String name, String email) {
        Student student=studentRepository.findById(studentID).orElseThrow(
                ()->new IllegalStateException("No student with student ID"+studentID));

            if(name!=null && name.length()>0 &&
                    !Objects.equals(student.getName(),name)){
                student.setName(name);
            }
            if(email!=null && email.length()>0 &&
                    !Objects.equals(student.getEmail(),email)){
                Optional<Student> student1=studentRepository.findStudentByEmail(email);
                if(student1.isPresent()){
                    throw new IllegalStateException("Email already taken");
                }
                else{
                    student.setEmail(email);
                }
            }
        }


}
