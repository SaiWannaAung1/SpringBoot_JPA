package com.example.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.entity.User;

public class UserDto {

	Long id;
	
	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	String name;
	
	@NotNull
	@Size(min=5, message="Email must be at least 5 characters long")
	String email;

	String course;

	public UserDto(User user)
	{
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.course = user.getCourse().getName();
		
	}
	public UserDto(Long id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public UserDto()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public User getEntity()
	{
		User user = new User();
		user.setId(this.id);
		user.setEmail(this.email);
		user.setName(this.name);
		
		return user;
	}
	
}
