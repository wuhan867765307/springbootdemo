package com.bdqn.service.impl;

import com.bdqn.mapper.StudentMapper;
import com.bdqn.pojo.Student;
import com.bdqn.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStudentList() {
        return studentMapper.findStudent();
    }
}
