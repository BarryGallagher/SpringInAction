package chapter2.listing_2_2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import chapter2.listing_2_1.Performer;

public class PoeticJugglerTest {

	@Test
	public void poeticJugglerTest() throws Throwable {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-idol-listing_2_2.xml");

		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
		ctx.close();
	}

}
