package com.people.apipeople.models;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class People {
	
	@NotNull
	private String id;
	
	@NotNull
	private String name;
	
	@Size(min=1)
	private String gender;
	
//	@Email(message = "Email should be valid")
	private String email;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date birthday;
	
	private String naturalness;
	
	private String nationality;
	
	@NotNull
//	@Indexed(unique = true, name = "people_cpf_unique")
	@Size(min=11)
//	@CPF(message="invalide CPF")
	private String cpf;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date created_at;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date updated_at;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public @Size(min = 1) String getGender() {
		return gender;
	}
	public void setGender(String gender) {
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
		return naturalness;
	}
	public void setNaturality(String naturality) {
		this.naturalness = naturality;
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
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}
