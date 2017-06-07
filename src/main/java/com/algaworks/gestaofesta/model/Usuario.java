
package com.algaworks.gestaofesta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario  {
	@Id
	@GeneratedValue
	private Long idUsuario;
	private String nome;
	private String email;
	private Date dtNascimento;
	private Float salario;
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	

}
