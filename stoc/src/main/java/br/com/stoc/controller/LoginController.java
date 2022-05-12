package br.com.stoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
	@GetMapping({"/home"}) //é o nome que eu quiser colocar
    public String home(ModelMap model) { 			
    	   
		
	
		 return "home.html"; //é o nome do arquivo real	
    	    	
    }
	@GetMapping({"/login"}) //é o nome que eu quiser colocar
    public String login(ModelMap model) { 			
    	   
		
	
		 return "login.html"; //é o nome do arquivo real	
    	    	
    }

	@GetMapping({"/recuperar_senha"}) //é o nome que eu quiser colocar
    public String recuperar(ModelMap model) { 			
    	   
		
	
		 return "recuperar_senha.html"; //é o nome do arquivo real	
    	    	
    }
}