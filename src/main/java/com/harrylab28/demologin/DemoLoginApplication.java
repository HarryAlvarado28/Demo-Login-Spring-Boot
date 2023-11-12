package com.harrylab28.demologin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLoginApplication {
	private static Logger logger = LoggerFactory.getLogger(DemoLoginApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoLoginApplication.class, args);
		logger.trace("Mensaje desde un TRACE");
		logger.debug("Mensaje desde un DEBUG");
		logger.info("Mensaje desde un INFO");
		logger.warn("Mensaje desde un WARN");
		logger.error("Mensaje desde un ERROR");
	}
}
