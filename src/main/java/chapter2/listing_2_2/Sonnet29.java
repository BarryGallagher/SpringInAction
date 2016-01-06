package chapter2.listing_2_2;

public class Sonnet29 implements Poem {

	private static String[] LINES = {
			"When,in disgrace with fortune and men's eyes,",
			"I all alone be weep my outcast state",
			"Andtroubledeafheavenwithmybootlesscries",
			"Andlookuponmyselfandcursemyfate,",
			"Wishingmeliketoonemorerichinhope,",
			"Featuredlikehim,likehimwithfriendspossess'd,",
			"Desiringthisman'sartandthatman'sscope,",
			"WithwhatImostenjoycontentedleast;",
			"Yetinthesethoughtsmyselfalmostdespising,",
			"HaplyIthinkonthee,andthenmystate,",
			"Liketothelarkatbreakofdayarising",
			"Fromsullenearth,singshymnsatheaven'sgate;",
			"Forthysweetloveremember'dsuchwealthbrings",
			"ThatthenIscorntochangemystatewithkings." };

	public Sonnet29() {
	}

	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}
}
