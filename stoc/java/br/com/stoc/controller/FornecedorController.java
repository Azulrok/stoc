
package br.com.stoc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.stoc.model.FornecedorModel;
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
		
			
			
			@GetMapping(value = "/cadastrarfornecedor")
			public ModelAndView cadastrarfornecedor(FornecedorModel fonecedor) {
				ModelAndView mv = new ModelAndView("/cadastrarfornecedor");

				return mv;

			}
}