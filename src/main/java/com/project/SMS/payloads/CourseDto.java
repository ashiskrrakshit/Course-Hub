package com.project.SMS.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
	private int id;
	private String name;
	private String description;
	private String firstName;
	private String lastName;
}
