package autowiringandannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimCoach implements Coach {

	private GetFortune getFortune;

	public SwimCoach(GetFortune fortune) {
		// TODO Auto-generated constructor stub
		this.getFortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim like a swan";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return getFortune.getFortune();
	}
	@Value("Sri Ram Ede")
	private String name;
	private int i;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Value("100")
	public void testsetInjection(int i) {
		this.i=i;
	}
	
	public int getsetInjection() {
		return i;
	}
	

}
