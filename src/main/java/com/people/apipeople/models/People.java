package com.people.apipeople.models;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class People {
	
	@NotNull
	private String id;
	
	@NotNull
	private String nome;
	
	private char gender;
	
	@NotNull
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date birthday;
	
	private String naturality;
	
	private String nationality;
	
	@NotNull
	@Size(min=11)
	private String cpf;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date created_at;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getNaturality() {
		return naturality;
	}
	public void setNaturality(String naturality) {
		this.naturality = naturality;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
}
