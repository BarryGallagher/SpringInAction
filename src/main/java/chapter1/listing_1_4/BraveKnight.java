package chapter1.listing_1_4;

import chapter1.listing_1_3.Knight;

public class BraveKnight implements Knight {
	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest; //Quest is injected
							//Constructor injection
							//Quest provided a constuction time
	}

	public String embarkOnQuest() {
		return quest.embark();
	}
}
