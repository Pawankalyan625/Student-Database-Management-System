package org.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {}
