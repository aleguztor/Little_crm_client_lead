package com.oportunities.contacts.oportunities.entity;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="users")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String lastName;
	private int tlf;
	private String email;
	private int numberOfCalls;
	
	private String date;
	
	private String oportunityType;
	
	private String clientType;
	
	private boolean isCliente;
	private boolean isOportunidad;
	private boolean isContacto;
	
	public User() {
		super();
	}
	
	public User(String name, String lastName, String email, int numtlf) {
		this.tlf=numtlf;
		this.name=name;
		this.lastName=lastName;
		this.email=email;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public int getTlf() {
		return tlf;
	}
	public String getEmail() {
		return email;
	}
	public int getNumberOfCalls() {
		return numberOfCalls;
	}
	public String getDate() {
		return date;
	}
	public String getOportunityType() {
		return oportunityType;
	}
	public String getClientType() {
		return clientType;
	}
	public boolean isCliente() {
		return isCliente;
	}
	public boolean isOportunidad() {
		return isOportunidad;
	}
	public boolean isContacto() {
		return isContacto;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void settlf(int numCalls) {
		this.tlf = numCalls;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNumberOfCalls(int number) {
		this.numberOfCalls = number;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setOportunityType(String oportunityType) {
		this.oportunityType = oportunityType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public void setCliente(boolean isCliente) {
		this.isCliente = isCliente;
	}
	public void setOportunidad(boolean isOportunidad) {
		this.isOportunidad = isOportunidad;
	}
	public void setContacto(boolean isContacto) {
		this.isContacto = isContacto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}

	
}
