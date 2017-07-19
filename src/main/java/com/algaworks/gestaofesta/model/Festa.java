package com.algaworks.gestaofesta.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Festa {
	@Id
	@GeneratedValue
	private Long idFesta;
	@NotNull(message = "Usuario é Inválido ou Inexistente")
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	@NotEmpty(message="O nome é obrigatório!")
	private String nome;
	@NotNull(message = "Data é obrigatória")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE )
	private Date data;
	@NotNull(message = "O valor é obrigatória")
	private Float valor;
	public Long getIdFesta() {
		return idFesta;
	}
	public void setIdFesta(Long idFesta) {
		this.idFesta = idFesta;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	

}
