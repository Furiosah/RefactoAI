package com.refactoai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplication(RefactoApplication.class).run(args);
    }
}
