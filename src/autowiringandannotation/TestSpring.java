package autowiringandannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("AnnotateApplicationContext.xml");
		
	Coach bbCoach=context.getBean("cricketCoach",Coach.class);
		
	System.out.println(bbCoach.getDailyWorkout()+"\t"+bbCoach.getFortune());
	
	context.close();
	
	}

}
