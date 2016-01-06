package chapter2.listing_2_2;

import chapter2.listing_2_1.Juggler;
import chapter2.listing_2_1.PerformanceException;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem){
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException{
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
