package com.thuan.springboot.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thuan.springboot.jdbc.service.JournalService;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(SpringBootJdbcApplication.class);

	@Autowired
	private JournalService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("@@ Inserting Data....");
		service.insertData();
		log.info("@@ findAll() call...");
		service.findAll().forEach(entry -> log.info(entry.toString()));
	}

}
