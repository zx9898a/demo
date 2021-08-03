package com.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private Long id;
	private String name;
	private String email;
	private Integer age;
}
