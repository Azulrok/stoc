package br.com.stoc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.stoc.repository.PedidoRepository;

@Controller
public class PedidoController {
	
	//cria uma instãncia do nosso repositório
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping({"/consulta"}) //é o nome que eu quiser colocar
    public String home(ModelMap model) { 			
    	   
		
	
		 return "consulta.html"; //é o nome do arquivo real	
    	    	
    }
	
	@GetMapping({"/consulta/consulta"}) //é o nome que eu quiser colocar
    public String listarfuncionario(ModelMap model) { 			
    	   
		  
		 model.addAttribute("consulta",pedidoRepository.findAll());
		 return "consulta/consulta"; //é o nome do arquivo real	
    	    	
    }

}
