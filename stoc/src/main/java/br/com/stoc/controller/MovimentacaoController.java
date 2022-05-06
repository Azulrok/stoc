package br.com.stoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.stoc.repository.MovimentacaoRepository;




@Controller
public class MovimentacaoController {

		//cria uma instãncia do nosso repositório
		@Autowired
		private MovimentacaoRepository movimentacaoRepository;
		
		@GetMapping({"/Movimentacao"}) //é o nome que eu quiser colocar
	    public String home(ModelMap model) { 			
	    	   
			
		
			 return "Movimentacao.html"; //é o nome do arquivo real	
	    	    	
	    }
		
		@GetMapping({"/Movimentacao/Movimentacao"}) //é o nome que eu quiser colocar
	    public String listarfuncionario(ModelMap model) { 			
	    	   
			 //o findAll lista todos atores 
			 model.addAttribute("pedido",movimentacaoRepository.findAll());
			 return "Movimentacao/Movimentacao"; //é o nome do arquivo real	
	    	    	
	    }
	
	}