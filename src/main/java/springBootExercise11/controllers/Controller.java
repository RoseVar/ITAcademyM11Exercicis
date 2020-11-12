package springBootExercise11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootExercise11.services.BasicService;

@RestController
public class Controller {
	
	@Autowired
	BasicService basicService;
	
	@GetMapping("/")
	public String saludoBasico(){
		//return basicService.saludoBase();
		return "HELLO WORD";
	}

	
	@GetMapping("/{nombre}")
	public String saludoEspecial(@PathVariable(name="nombre") String nombre) {
	    return basicService.saludoEspecial(nombre);
	}
	
	
}

