package com.example.star.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.star.model.Student;

@Mapper
public interface StudentMapper {

	Student findStudentByUsername(String name);
}
