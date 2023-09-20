package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {

	@Autowired
	@Qualifier("cow")//in primary and qualifier the prioroty will be given for qualifier only
	private Animal animal;
	
	void animalsound() {
		System.out.println("animal is making sound");
		animal.sound();
	}
}
