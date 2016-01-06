package chapter2.listing_2_6;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import chapter2.listing_2_1.Performer;

public class kennyTest {
	
	@Test
	public void kennyPlayTheSax() throws Throwable{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-idol-listing_2_5.xml");

		Performer performer = (Performer) ctx.getBean("kenny");
		performer.perform();
		ctx.close();
	}
}
