package com.example.star.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
// @Alias("student")
public class Student implements Serializable {

	/**
	 * 学生
	 */
	private static final long serialVersionUID = -8137651000745771811L;

	private int id;
	private String name;
	private int age;

}
