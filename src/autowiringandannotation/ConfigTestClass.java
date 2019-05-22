package autowiringandannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach criCoach = context.getBean("cricketCoach", Coach.class);

		System.out.println(criCoach.getDailyWorkout() + "\t" + criCoach.getFortune());

		Coach ccCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(
				ccCoach.getDailyWorkout() + "\t" + ccCoach.getFortune() + "\t" + ((SwimCoach) ccCoach).getName());
		
		System.out.println(((SwimCoach) ccCoach).getsetInjection());

		context.close();
	}

}
