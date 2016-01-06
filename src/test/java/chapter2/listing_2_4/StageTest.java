package chapter2.listing_2_4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import chapter2.listing_2_1.Performer;

public class StageTest {

	@Test
	public void singletonStageTest() throws Throwable {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-idol-listing_2_4.xml");

		Stage stage = (Stage) ctx.getBean("theStage");
		System.out.println(stage.toString());
		ctx.close();
	}
}
