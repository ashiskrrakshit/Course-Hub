package com.project.SMS.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	
}
