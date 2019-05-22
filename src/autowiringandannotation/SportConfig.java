package autowiringandannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("autowiringandannotation")
public class SportConfig {
//we can define bean inside config class
	
	@Bean
	public Coach swimCoach() {//method name == bean id
		SwimCoach mySwimCoach=new SwimCoach(getFortune());
		return mySwimCoach;
	}
	
	@Bean
	public GetFortune getFortune() {
		LuckFortune luckFortune=new LuckFortune();
		return luckFortune;
	}
	
	
}
