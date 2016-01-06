package chapter1.listing_1_5;

import static org.mockito.Mockito.*;

import org.junit.Test;

import chapter1.listing_1_3.QuestException;
import chapter1.listing_1_4.BraveKnight;
import chapter1.listing_1_4.Quest;

public class BraveKnightTest {
	
	@Test
	public void knightShouldEmbarkOnQuest() throws QuestException {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}