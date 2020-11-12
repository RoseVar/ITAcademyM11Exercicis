package springBootExercise11.services;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

	public String saludoBase() {
		return "HELLO WORD";
	}

	public String saludoEspecial(String nombre) {
		return "Hello, " + nombre;
	}
}
