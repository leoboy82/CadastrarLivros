package edu.ifba.cadlivro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.ifba.cadlivro.model.Livros;
import edu.ifba.cadlivro.repository.ILivrosRepository;
import edu.ifba.cadlivro.service.ILivrosService;

@Service
public class LivrosService implements ILivrosService {
	
	@Autowired
	private ILivrosRepository repository;

	@Override
	public void save(Livros p) {
		// TODO Auto-generated method stub
		repository.save(p);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Livros find(Integer id) {
		// TODO Auto-generated method stub
		Optional<Livros> p = repository.findById(id);
		return p.isPresent() ? p.get() : null;
	}

	@Override
	public List<Livros> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll(Sort.by("registration").descending());
	}

}
