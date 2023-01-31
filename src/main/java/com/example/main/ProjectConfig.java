package com.example.main;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {
        "com.example.controllers",
        "com.example.repositories",
})
@EnableJpaRepositories("com.example.repositories")
@EntityScan("com.example.models")
public class ProjectConfig {
}
