package edu.ifba.cadlivro.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.ifba.cadlivro.model.Livros;
import edu.ifba.cadlivro.service.ILivrosService;

@Controller
public class LivrosController {

	@Autowired
	private ILivrosService service;
	
	@GetMapping("/livros/list")
	public String findAll(Model model) {
		model.addAttribute("livros", service.findAll());
		return "livros/list";
	}
	
	@GetMapping("/livros/delete/{id}")
	public String delete(@PathVariable(name = "id") Integer id) {
		service.delete(id);
		return "redirect:/livros/list";
	}
	
	@GetMapping("/livros/details/{id}")
	public String find(@PathVariable Integer id, Model model) {
		model.addAttribute("livros", service.find(id));
		model.addAttribute("mode", "view"); // para logica visual
		return "livros/registration-form";
	}
	
	@GetMapping({"/livros/save/{id}", "/livros/save"})
	public String loadRegistrationForm(@PathVariable(required = false)
		Integer id, Model model) {
		Livros p;
		String mode;
		if (id == null) {
			mode = "create";
			p = new Livros();
		} else {
			mode = "update";
			p = service.find(id);
		}
		model.addAttribute("livros", p);
		model.addAttribute("mode", mode);
		return "livros/registration-form";
	}
	
	@PostMapping("livros/save")
	public String save(@ModelAttribute Livros p) {
		p.setRegistration(new Date());
		service.save(p);
		return "redirect:/livros/list";
	}
	
}
