package chapter1.listing_1_3;

/**
 * Hello world!
 * 
 */
public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		quest = new RescueDamselQuest();
	}

	public String embarkOnQuest() throws QuestException {
		return quest.embark();
	}
}