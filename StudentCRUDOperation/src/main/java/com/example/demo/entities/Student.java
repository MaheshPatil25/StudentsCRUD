package com.example.demo.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     int studentid;
	@Column
	String sname;
	@Column
	String city;
	@Column
	String email;
	@Column
	String contactno;
	
	
	
	public Student() {
		super();
	}



	public Student(int studentid, String sname, String city, String email, String contactno) {
		super();
		this.studentid = studentid;
		this.sname = sname;
		this.city = city;
		this.email = email;
		this.contactno = contactno;
	}



	public Student(String sname, String city, String email, String contactno) {
		super();
		this.sname = sname;
		this.city = city;
		this.email = email;
		this.contactno = contactno;
	}



	public int getStudentid() {
		return studentid;
	}



	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getContactno() {
		return contactno;
	}



	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
	
}
