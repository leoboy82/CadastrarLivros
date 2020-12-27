package edu.ifba.cadlivro.service;

import java.util.List;

import edu.ifba.cadlivro.model.Livros;

public interface ILivrosService {
	
	void save(Livros p);
	
	void delete(Integer id);
	
	Livros find(Integer id);
	
	List<Livros> findAll();

}
