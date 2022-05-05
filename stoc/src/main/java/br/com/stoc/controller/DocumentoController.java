package br.com.stoc.controller;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.stoc.repository.DocumentoRepository;


@Controller

public class DocumentoController {
	//cria uma instãncia do nosso repositório
	@Autowired
	private DocumentoRepository documentoRepository;
	
	@GetMapping({"/documento"}) //é o nome que eu quiser colocar
    public String home(ModelMap model) { 			
    	   
		
	
		 return "documento.html"; //é o nome do arquivo real	
    	    	
	}
}


