package com.gianino.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	
	@Column(name="login", nullable = false)
	private String login;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="userName", nullable = false)
	private String userName;
	
	@Column(name="userWeight", nullable = false)
	private int userWeight;
	
	@Column(name="userHeight", nullable = false)
	private int userHeight;
	
}
