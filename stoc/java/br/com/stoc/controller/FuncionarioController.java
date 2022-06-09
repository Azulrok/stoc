package br.com.stoc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.stoc.repository.FuncionarioRepository;
import br.com.stoc.repository.UsuarioRepository;

@Controller
public class FuncionarioController {
	

	
	//cria uma instãncia do nosso repositório
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping({"/"}) //é o nome que eu quiser colocar
    public String home(ModelMap model) { 			
    	   
		
	
		 return "home.html"; //é o nome do arquivo real	
    	    	
    }

	@GetMapping({"/home/home"}) //é o nome que eu quiser colocar
	public String listarfuncionario(ModelMap model) { 			
	   
	 //o findAll lista todos atores 
	 model.addAttribute("home",funcionarioRepository.findAll());
	 return "home/home"; //é o nome do arquivo real	
	    	
}

	
	@GetMapping({"/lista_funcionarios"})
	public ModelAndView ListarFuncionario(ModelMap model) {
		// Lista todos os usuários
		ModelAndView mv = new ModelAndView("/lista_funcionarios");

		model.addAttribute("funcionarios", this.funcionarioRepository.findAll());

		return mv;

	}
	
	
	
	
	
	
	
	
}