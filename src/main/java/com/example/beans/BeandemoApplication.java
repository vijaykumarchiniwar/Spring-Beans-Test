package com.example.beans;

import com.example.beans.bean.MyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.example.beans")
public class BeandemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeandemoApplication.class, args);
	}

}
