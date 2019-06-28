package com.globant.programanivelacion.springboot.modulo1;

import com.globant.programanivelacion.springboot.modulo1.component.TestComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Modulo1Application implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(Modulo1Application.class);

	@Autowired
	TestComponent testComponent;

	@Qualifier("get2")
	@Autowired
	Cristian cristian;

	public static void main(String[] args) {
		SpringApplication.run(Modulo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info(testComponent.saludo());
		LOG.info(String.valueOf(cristian.sumar(1,2)));
	}
}
