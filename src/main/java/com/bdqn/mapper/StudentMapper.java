package com.bdqn.mapper;

import com.bdqn.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> findStudent();
}
