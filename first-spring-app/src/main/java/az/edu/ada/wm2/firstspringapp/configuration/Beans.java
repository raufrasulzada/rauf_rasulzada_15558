package az.edu.ada.wm2.firstspringapp.configuration;

import org.springframework.context.annotation.Bean;

import az.edu.ada.wm2.firstspringapp.model.Person;
import org.springframework.stereotype.Component;

@Component
public class Beans {
  @Bean
	public Person defaultPerson() {
		return new Person("Default", "Person");
	}
}
