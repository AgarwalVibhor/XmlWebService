package com.tcs.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentList {
	
	@XmlElement(name = "student")
	private List<Student> studentList;
	
	
	public StudentList() {
		super();
	}

	public StudentList(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	

}
