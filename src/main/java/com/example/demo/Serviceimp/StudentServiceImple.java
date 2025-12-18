package com.example.demo.service;
import org.springframework.stereotypes.Service;
import com.example.demo.service.StudentService;
import com.example.demo.service.Student;
@Service
public class StudentServiceImple implements Student{
    public Student saveStudent(Student student)
    {
        private final (StudentRepository studentrepository){
            this.StudentRepository=studentrepository;
        }
    }
    @Autowired
    StudentRepository studentrepository;

    public Student saveStudent(Student student){
        return studentrepository.save(student);
    }
}
