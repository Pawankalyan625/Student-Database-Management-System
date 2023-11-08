package org.studentmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  int id;
  
  @Column(name = "name")
  String name;
  
  @Column(name = "address")
  String address;
  
  public Student() {}
  
  public Student(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String toString() {
    return "Student [id=" + this.id + ", name=" + this.name + ", address=" + this.address + "]";
  }
  
  public org.studentmanagement.entity.Student orElse(Object object) {
    return null;
  }
}
