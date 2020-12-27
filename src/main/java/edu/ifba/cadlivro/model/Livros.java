package edu.ifba.cadlivro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Livros")
@Getter
@Setter
public class Livros {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "autor")
	private String autor;
	
	@Column(name = "editora")
	private String editora;
	
	@Column(name = "quantidade")
	private Integer quantity;
	
	@Column(name = "registro")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date registration;
}
