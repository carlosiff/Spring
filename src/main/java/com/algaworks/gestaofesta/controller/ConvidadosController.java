package com.algaworks.gestaofesta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.gestaofesta.model.Convidado;
import com.algaworks.gestaofesta.repository.Convidados;



@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	
	@Autowired
	private Convidados convidados;
	
	@GetMapping("")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados",convidados.findAll());
		mv.addObject(new Convidado());
		return mv;
	}
	
	@PostMapping("")
	public String salvar(Convidado convidado) {
	this.convidados.save(convidado);
	return "redirect:/convidados";
	}
	
	@RequestMapping(value ="/excluir/{id}")
	public String excluirConvidadoByPathVariable(@PathVariable Long id, HttpServletRequest request, 
					HttpServletResponse response) {
		
		this.convidados.delete(id);
		return "redirect:/convidados";
		
		/*ModelAndView mv = new ModelAndView("ListaConvidados");
		String message = "Convidado foi apagado com sucesso.";
		mv.addObject("message", message);
		mv.addObject(new Convidado());
		mv.addObject("convidados", convidados.findAll());
		return mv;*/
	}
	
	@RequestMapping(value ="/alterar/{id}")
	public ModelAndView alterarConvidadoByPathVariable(@PathVariable Long id, HttpServletRequest request, 
			HttpServletResponse response) {
	ModelAndView mv = new ModelAndView("ListaConvidados");
	mv.addObject("convidados", convidados.findAll());
	Convidado convidado = convidados.findOne(id);
	mv.addObject(convidado);
	return mv;
	}

}
