package com.taskmgmtsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EntityScan("com.taskmgmtsystem.taskentities")
@EnableJpaRepositories(basePackages = "com.taskmgmtsystem.taskdao")
public class TaskmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmgmtApplication.class, args);
	}

}
