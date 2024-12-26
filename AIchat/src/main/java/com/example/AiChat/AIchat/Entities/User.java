package com.example.AiChat.AIchat.Entities;

import javax.management.relation.Role;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String lastName;
	private String email;
	private String password;

	@Enumerated(EnumType.STRING)
	private Role role;
}
