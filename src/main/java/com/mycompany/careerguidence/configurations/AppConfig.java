package com.mycompany.careerguidence.configurations;

import org.springframework.context.annotation.ComponentScan; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.web.servlet.config.annotation.EnableWebMvc; 

@Configuration 
@ComponentScan("com.mycompany.careerguidence") 
@EnableWebMvc 

public class AppConfig {
 
}
