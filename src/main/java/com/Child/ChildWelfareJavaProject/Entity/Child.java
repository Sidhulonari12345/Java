 package com.Child.ChildWelfareJavaProject.Entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
 public class Child {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private Integer age;
     private String bloodgroup;
     private String gender;
     private String imgname;
     private String location;
     private String studentname;

     @Lob
     private byte[] studentimages;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public byte[] getStudentimages() {
		return studentimages;
	}

	public void setStudentimages(byte[] studentimages) {
		this.studentimages = studentimages;
	}

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(Long id, Integer age, String bloodgroup, String gender, String imgname, String location,
			String studentname, byte[] studentimages) {
		super();
		this.id = id;
		this.age = age;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.imgname = imgname;
		this.location = location;
		this.studentname = studentname;
		this.studentimages = studentimages;
	}

	@Override
	public String toString() {
		return "Child [id=" + id + ", age=" + age + ", bloodgroup=" + bloodgroup + ", gender=" + gender + ", imgname="
				+ imgname + ", location=" + location + ", studentname=" + studentname + ", studentimages="
				+ Arrays.toString(studentimages) + "]";
	}
     
     

  
 
}