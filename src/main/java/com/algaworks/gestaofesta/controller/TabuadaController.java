package com.algaworks.gestaofesta.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.gestaofesta.form.TabuadaForm;



@Controller
@RequestMapping("/")
public class TabuadaController {


	@RequestMapping("/home")
	public String home(){
		return "home";
	}

	@RequestMapping("/tabuada")
	public ModelAndView tabuada(@ModelAttribute("tf") TabuadaForm tf){
		ModelAndView mv = new ModelAndView("tabuadaview");
		if (tf.getN1() == null) tf.setN1((float)0);
		if (tf.getN2() == null) tf.setN2((float)0);
		mv.addObject("resultado", tf.soma());
		return mv;
	}

}
