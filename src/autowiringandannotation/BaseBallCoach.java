package autowiringandannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	@Autowired
	@Qualifier("luckFortune")
	private GetFortune getFortune;

//	public BaseBallCoach(GetFortune getFortune) {
//		super();
//		this.getFortune = getFortune;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "I am base ball coach";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return getFortune.getFortune();
	}

}
