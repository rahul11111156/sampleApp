package com.example.Sample.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Students")
public class User {
	
	@Id
	String firtName;
	String lastname;
	String age;
	String userName;
	String password;
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [firtName=" + firtName + ", lastname=" + lastname + ", age=" + age + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	public User(String firtName, String lastname, String age, String userName, String password) {
		super();
		this.firtName = firtName;
		this.lastname = lastname;
		this.age = age;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		super();
	}
	
	
	
	

}
