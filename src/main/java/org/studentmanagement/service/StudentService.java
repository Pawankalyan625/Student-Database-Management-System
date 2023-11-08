package org.studentmanagement.service;

import java.util.List;
import org.studentmanagement.entity.Student;

public interface StudentService {
  void saveData(Student paramStudent);
  
  List<Student> getData();
  
  void addStudent(Student paramStudent);
  
  void delete(int paramInt);
}
