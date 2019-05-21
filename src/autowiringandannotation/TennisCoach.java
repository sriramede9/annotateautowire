package autowiringandannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private GetFortune getFortune;

	@Autowired @Qualifier("happyFortune")
	private void setFortuneObject(GetFortune getFortune) {
		this.getFortune = getFortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "explore the court and know your hand power";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return getFortune.getFortune();
	}

}
