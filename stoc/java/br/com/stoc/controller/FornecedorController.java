
package br.com.stoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.stoc.repository.FornecedorRepository;







@Controller
public class FornecedorController {
	


			//cria uma instãncia do nosso repositório
			@Autowired
			private FornecedorRepository fornecedorRepository;
			
			@GetMapping({"/lista_fornecedores"}) //é o nome que eu quiser colocar
		    public String home(ModelMap model) { 			
		    	   
				
			
				 return "lista_fornecedores.html"; //é o nome do arquivo real	
		    	    	
		    }
			
			@GetMapping({"/lista_fornecedores/lista_fornecedores"}) //é o nome que eu quiser colocar
		    public String listarfuncionario(ModelMap model) { 			
		    	   
				 //o findAll lista todos atores 
				 model.addAttribute("lista_fornecedores",fornecedorRepository.findAll());
				 return "lista_fornecedores/lista_fornecedores"; //é o nome do arquivo real	
		    	    	
		    }
		
		}