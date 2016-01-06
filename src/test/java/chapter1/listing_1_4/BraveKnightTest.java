package chapter1.listing_1_4;

import org.junit.Assert;
import org.junit.Test;

import chapter1.listing_1_3.QuestException;
import chapter1.listing_1_3.RescueDamselQuest;

public class BraveKnightTest {

	@Test
	public void embarkTest() throws Exception, QuestException {
		Quest quest = new RescueDamselQuest();
		BraveKnight braveKnight = new BraveKnight(quest);
		String questType = braveKnight.embarkOnQuest();
		Assert.assertEquals("Request a Damsel Quest", questType);
		quest = new BuildRoundTableQuest();
		braveKnight = new BraveKnight(quest);
		questType = braveKnight.embarkOnQuest();
		Assert.assertEquals("Build round table", questType);
	}
}
