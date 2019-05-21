package autowiringandannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("luckFortune")
	private GetFortune getFortune;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "never-mind cup is ours";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return getFortune.getFortune();
	}

}
