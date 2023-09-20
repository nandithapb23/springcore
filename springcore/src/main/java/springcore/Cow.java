package springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//to tell ioc conatiner that we are making cow as default entity
public class Cow implements Animal{

	public void sound() {
		System.out.println("sound is mooooo");
		
	}

}
