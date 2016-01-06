package chapter2.listing_2_5;

import chapter2.listing_2_1.PerformanceException;
import chapter2.listing_2_1.Performer;

public class Instrumentalist implements Performer {
	public Instrumentalist(){
		
	}
	
	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();	
	}

	private String song;
	
	public void setSong(String song){
		this.song = song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument){
		this.instrument = instrument;
	}
	
	private int age;
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}
