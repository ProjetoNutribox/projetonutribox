package com.generation.nutribox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório e não pode estar vazio")
	@Size(min = 2, max = 50, message = "O campo nome precisa ter entre 4 e 50 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo email é obrigatório e não pode estar vazio")
	@Size(min = 4, max = 50, message = "O campo email precisa ter entre 4 e 50 caracteres")
	private String email;
	
	@NotBlank(message = "O atributo senha é obrigatório e não pode estar vazio")
	@Size(min = 8, max = 500, message = "O campo senha precisa ter entre 4 e 50 caracteres")
	private String senha;
	
	@Size(min = 3, max = 5000, message = "O campo foto precisa ter entre 3 e 5000 caracteres")
	private String foto;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
