package com.example.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("Nonso", "Admin"));
		repository.save(new User("Dami", "User"));
		repository.save(new User("Dimeji", "Admin"));
		repository.save(new User("Onyinyechi", "User"));
		
		for (User user : repository.findAll()) {
			log.info(user.toString());
		}
	}
	
}
