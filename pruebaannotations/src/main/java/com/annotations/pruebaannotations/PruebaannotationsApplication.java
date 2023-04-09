package com.annotations.pruebaannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PruebaannotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaannotationsApplication.class, args);
		// Indicamos la ruta del contexto XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Construimos un bean del contenedor
		Empleados Maria = context.getBean("EmpleadoDirector", Empleados.class);

		// usamos el bean
		System.out.println(Maria.getDocumentoDirector());
		System.out.println(Maria.getResponsabilidades());

		//cerramos el contexto XML
		context.close();

	}

}
