package main.java.com.refactoai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "main.java.com.refactoai")

public class RefactoApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplication(RefactoApplication.class).run(args);
    }
}
