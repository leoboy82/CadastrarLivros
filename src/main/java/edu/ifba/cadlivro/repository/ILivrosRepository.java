package edu.ifba.cadlivro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifba.cadlivro.model.Livros;

public interface ILivrosRepository 
	extends JpaRepository<Livros, Integer> {

}
