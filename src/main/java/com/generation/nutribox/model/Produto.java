package com.generation.nutribox.model;

import org.apache.logging.log4j.util.StringBuilderFormattable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório e não pode estar vazio")
	@Size(min = 3, max = 255, message = "O campo nome precisa ter entre 3 e 255 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo tamanho é obrigatório e não pode estar vazio")
	@Size(min = 3, max = 255, message = "O campo tamanho precisa ter entre 3 e 255 caracteres")
	private String tamanho;
	
	@NotNull(message = "O atributo preco é obrigatório e não pode estar vazio")
	@Positive
	private double preco;
	
	@NotNull(message = "O atributo quantidade é obrigatório e não pode estar vazio")
	@PositiveOrZero
	private Long quantidade;
	
	@Size(min = 3, max = 5000, message = "O campo foto precisa ter entre 3 e 5000 caracteres")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
