package com.bdqn.controller;

import com.bdqn.pojo.Student;
import com.bdqn.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller("/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Student> studentList = studentService.getStudentList();
        model.addAttribute("list",studentList);
        return "index";
    }
}
