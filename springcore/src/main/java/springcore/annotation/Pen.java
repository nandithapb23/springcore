package springcore.annotation;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Item{

	public void used() {
		System.out.println("used to write");
		
	}

}
