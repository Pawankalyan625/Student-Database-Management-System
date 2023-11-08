package org.studentmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.studentmanagement.entity.Student;
import org.studentmanagement.service.StudentService;

@Controller
public class StudentController {
  @Autowired
  private StudentService studentService;
  
  @RequestMapping({"/"})
  public String home() {
    return "index";
  }
  
  @RequestMapping({"/myform"})
  public String register(@ModelAttribute Student student) {
    if (student.getName() != null && student.getAddress() != null)
      this.studentService.saveData(student); 
    return "Register";
  }
  
  @RequestMapping({"/getdata"})
  public String getData(Model model) {
    List<Student> student = this.studentService.getData();
    model.addAttribute("data", student);
    return "list";
  }
  
  @RequestMapping({"/about"})
  public String contact() {
    return "contact";
  }
  
  @RequestMapping({"/delete/{id}"})
  public String delete(@PathVariable int id) {
    this.studentService.delete(id);
    return "redirect:/authentication";
  }
  
  @RequestMapping({"/successSaved"})
  public String successSaved() {
    return "authentication";
  }
  
  @RequestMapping({"/authentication"})
  public String authentication() {
    return "authentication";
  }
}
