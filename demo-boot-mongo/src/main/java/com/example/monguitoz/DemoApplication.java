package com.example.monguitoz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.monguitoz.data.Person;
import com.example.monguitoz.data.PersonRep;

@SpringBootApplication(scanBasePackages = { "com.example.monguitoz" })
@EnableMongoRepositories(basePackages = "com.example.monguitoz")
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PersonRep repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		System.out.println("teste");

		Person per = new Person();
		per.setAge(31);
		per.setFname("guilherme");
		per.setLname("cintão!");
		repository.save(per);
	}

}
