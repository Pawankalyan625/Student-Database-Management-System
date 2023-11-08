package org.studentmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studentmanagement.entity.Student;
import org.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
  @Autowired
  private StudentRepository studentRepository;
  
  public void saveData(Student student) {
    this.studentRepository.save(student);
  }
  
  public List<Student> getData() {
    return this.studentRepository.findAll();
  }
  
  public void addStudent(Student student) {
    this.studentRepository.save(student);
  }
  
  public void delete(int id) {
    this.studentRepository.deleteById(Integer.valueOf(id));
  }
}
