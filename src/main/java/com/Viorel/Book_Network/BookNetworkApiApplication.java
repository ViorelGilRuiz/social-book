package com.Viorel.Book_Network;

import com.Viorel.Book_Network.role.Role;
import com.Viorel.Book_Network.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

import static org.springframework.boot.SpringApplication.run;

@EnableJpaAuditing
@EnableAsync
@SpringBootApplication
public class BookNetworkApiApplication {

	public static void main(String[] args) {
		run(BookNetworkApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(RoleRepository roleRepository) {
		return args -> {
			if (roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(Role.builder().name("USER").build());
			}
		};
	}
}