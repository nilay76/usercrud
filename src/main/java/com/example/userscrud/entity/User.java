package com.example.userscrud.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min=2, message="name should have atleast 2 characters.")
	private String name;
	
	@NotBlank(message="email is blank, please enter valid email address.")
	@JsonProperty("email_address")
	private String email;
	
	@JsonIgnore
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Post> posts;

	public User(){}

	public User(Long id, String name, String email, String password, List<Post> posts) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.posts = posts;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}