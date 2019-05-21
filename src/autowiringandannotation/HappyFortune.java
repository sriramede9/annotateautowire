package autowiringandannotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements GetFortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Live love laugh leave";
	}

}
