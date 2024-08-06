package tests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // genereaza automat getter, setter toString si un constructor cu paramteri
@NoArgsConstructor // genereaza un constructor fara parametri (constructor default)
@AllArgsConstructor // genereaza un constructor cu toti parametrii
public class Person {

	private String name;
	private String email;
	private int age;
	
	
}
