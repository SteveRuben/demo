package org.abodah.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DataSysApplication {

	private static final Logger log = LoggerFactory.getLogger(DataSysApplication.class);

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate expirationDate = LocalDate.of(2020, 10, 25);
		if (now.isBefore(expirationDate)) {
			SpringApplication.run(DataSysApplication.class, args);
		} else {
			log.info("APP VERSION EXPIRED ;(|");
		}
	}

}
