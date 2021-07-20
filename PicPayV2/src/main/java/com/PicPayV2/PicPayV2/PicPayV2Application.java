package com.PicPayV2.PicPayV2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PicPayV2Application {
	public static void main(String[] args) {
		SpringApplication.run(PicPayV2Application.class, args);

		System.out.println(new BCryptPasswordEncoder().encode("1"));
	}
}
