package springcore.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//to tell ioc container that we are making myconfiguartion class as xml file
@ComponentScan(basePackages = "springcore.annotation")//it is used to specify base package address
public class Myconfiguration {

}
