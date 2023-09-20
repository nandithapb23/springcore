package springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")//by default the scope of the object will be singleton,if i want to create multiplr
//objects for a single class then we shd change scope from singleton to prototype
public class Person {

	@Autowired
	@Qualifier("bike")
	private Item item;
	
	void itemused() {
		item.used();
	}
}
