package chapter1.listing_1_3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DamselRescuingKnightTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DamselRescuingKnightTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DamselRescuingKnightTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws QuestException 
     */
    public void testApp() throws QuestException
    {
    	DamselRescuingKnight damselRescuingKnight = new DamselRescuingKnight();
    	String questName = damselRescuingKnight.embarkOnQuest();
    	
        assertEquals("Request a Damsel Quest", questName);
    }
}
