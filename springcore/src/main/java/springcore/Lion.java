package springcore;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

	public void sound() {
		System.out.println("sound is roarS");
		
	}

}
