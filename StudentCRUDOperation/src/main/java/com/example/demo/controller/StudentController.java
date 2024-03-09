package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {
    @Autowired
	StudentService sservice;
    
    @GetMapping("/getStudents")
    public List<Student> getStudents(){
    	return sservice.allstudent();
    }
    
    @PostMapping("/insertStudent")
    public Student insertStud(@RequestBody Student s) {
         
    	 return sservice.saveStu(s);
    }
    
    @PostMapping("/{id}/updatestu")
    public ResponseEntity<Student> updateStu(@PathVariable int id,@RequestBody Student s)
    {
    	s.setStudentid(id);
    	Student res=sservice.updatee(s);
    	return ResponseEntity.ok(res);
    }
    
    @DeleteMapping("/deletestudent")
	public void deleteStudent(@RequestParam("sid") int sid) {
		sservice.deleteStudent(sid);
	}
}
