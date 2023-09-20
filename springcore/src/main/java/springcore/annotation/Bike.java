package springcore.annotation;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Item{

	public void used() {
		System.out.println("used to ride");
		
	}

}
