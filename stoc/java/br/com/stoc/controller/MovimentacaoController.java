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
		
		@GetMapping({"/cadastraritem"}) //é o nome que eu quiser colocar
	    public String home(ModelMap model) { 			
	    	   
			
		
			 return "cadastraritem.html"; //é o nome do arquivo real	
	    	    	
	    }
		
		@GetMapping({"/alteraritem"}) //é o nome que eu quiser colocar
	    public String alterar(ModelMap model) { 			
	    	   
			
		
			 return "alteraritem.html"; //é o nome do arquivo real	
	    	    	
	    }
		
		@GetMapping({"/cadastrarfornecedor"}) //é o nome que eu quiser colocar
	    public String cadastrarfornecedor(ModelMap model) { 			
	    	   
			
		
			 return "cadastrarfornecedor.html"; //é o nome do arquivo real	
	    	    	
	    }
		
		
		
		
		@GetMapping({"/cadastraritem/cadastraritem"}) //é o nome que eu quiser colocar
	    public String listarfuncionario(ModelMap model) { 			
	    	   
			 //o findAll lista todos atores 
			 model.addAttribute("pedido",movimentacaoRepository.findAll());
			 return "cadastraritem/cadastraritem"; //é o nome do arquivo real	
	    	    	
	    }
	
	}