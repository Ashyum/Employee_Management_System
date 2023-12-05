package com.ashyum.springboot;

import com.ashyum.springboot.model.Employee;
import com.ashyum.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Sam");
//		employee.setLastName("Altman");
//		employee.setEmailId("sam@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Elon");
//		employee1.setLastName("Musk");
//		employee1.setEmailId("elon@gmail.com");
//		employeeRepository.save(employee1);
	}
}
