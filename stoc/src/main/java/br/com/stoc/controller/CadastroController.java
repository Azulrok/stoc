package br.com.stoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

 




@Controller
public class CadastroController {
	@GetMapping({"/cadastro"}) //é o nome que eu quiser colocar
    public String home(ModelMap model) { 			
    	   
		
	
		 return "cadastro.html"; //é o nome do arquivo real	
    	    	
    }
}

