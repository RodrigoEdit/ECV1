package com.example.demo;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


import io.spring.guides.gs_producing_web_service.Dias;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {
    private static final Map<String, Dias> dia = new HashMap<>();

	@PostConstruct
	public void initData() {
		// lunes
		Dias Lunes = new Dias();
		Lunes.setName("Lunes");
		Lunes.setTraducion("Monday");

		dia.put(Lunes.getName(), Lunes);

		// Martes
		Dias Martes = new Dias();
		Martes.setName("Martes");
		Martes.setTraducion("Tuesday");
		
		dia.put(Martes.getName(), Martes);

		// Miercoles
		Dias Miercoles = new Dias();
		Miercoles.setName("Miercoles");
		Miercoles.setTraducion("Wednesday");
		
		dia.put(Miercoles.getName(), Miercoles);

		// Jueves
		Dias Jueves = new Dias();
		Jueves.setName("Jueves");
		Jueves.setTraducion("Thursday");
		
		dia.put(Jueves.getName(), Jueves);

		// Viernes
		Dias Viernes = new Dias();
		Viernes.setName("Viernes");
		Viernes.setTraducion("Friday");
		
		dia.put(Viernes.getName(), Viernes);

		// Sabado
		Dias Sabado = new Dias();
		Sabado.setName("Sabado");
		Sabado.setTraducion("Saturday");
		
		dia.put(Sabado.getName(), Sabado);

		// Domingo
		Dias Domingo = new Dias();
		Domingo.setName("Domingo");
		Domingo.setTraducion("Sunday");
		
		dia.put(Domingo.getName(), Domingo);

	}

	public Dias findDias(String name) {
		Assert.notNull(name, "The days name must not be null");
		return dia.get(name);
	}
}
