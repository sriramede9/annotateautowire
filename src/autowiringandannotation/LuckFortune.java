package autowiringandannotation;

import org.springframework.stereotype.Component;

@Component
public class LuckFortune implements GetFortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day keep reading till you understand";
	}

}
