package chapter2.listing_2_1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class JugglerTest {

	@Test
	public void defaultConstructerTest() throws Exception, PerformanceException {
		ClassLoader cl = this.getClass().getClassLoader();
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(
				cl);
		Resource[] resources = resolver.getResources("classpath:META-INF/*.*");
		for (Resource resource : resources) {
			System.out.println(resource.getFilename());
		}

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-idol-listing_2_1.xml");

		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
		ctx.close();

	}

}
