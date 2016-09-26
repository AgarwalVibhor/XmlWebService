package com.tcs.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.tcs.model.Student;
import com.tcs.model.StudentList;

@Controller
public class StudentController {
	

	public StudentList createStudentList()
	{
		StudentList studentList = null;
		
		Student s1 = new Student(1, "Vibhor", "Agarwal", "vibhor@gmail.com", "7678890988");
		Student s2 = new Student(2, "Renu", "Agarwal", "renu@gmail.com", "7678890922");
		Student s3 = new Student(3, "Swati", "Agarwal", "swati@gmail.com", "7678890944");
		Student s4 = new Student(4, "Aman", "Agarwal", "aman@gmail.com", "7678890955");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		studentList = new StudentList(list);
		return studentList;
	}
	
	@RequestMapping(value = "/student/{id}.spring", method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public Student getStudentById(@PathVariable int id)
	{
		StudentList studentList = createStudentList();
		
		List<Student> list = studentList.getStudentList();
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			Student student = itr.next();
			if(student.getId() == id)
			{
				return student;
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/students.spring", method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public StudentList getStudents()
	{
		StudentList list = createStudentList();
		return list;
	}

}
