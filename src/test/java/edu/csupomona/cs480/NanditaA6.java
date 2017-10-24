package edu.csupomona.cs480;

import java.io.IOException;

import org.junit.Test;

import edu.csupomona.cs480.controller.WebController;
import junit.framework.TestCase;

public class NanditaA6 extends TestCase {
	protected void setUp() throws Exception {
		super.setUp();
		}

		protected void tearDown() throws Exception {
		super.tearDown();
		}
	
	
	public void test() throws IOException{ 
		String expected = "LATEST NEWS HEADLINES" + "\n" +
				"<a href=\"/wiki/Czech_legislative_election,_2017\" title=\"Czech legislative election, 2017\">Czech legislative election</a>\n" + 
				"<a href=\"/wiki/Jacinda_Ardern\" title=\"Jacinda Ardern\">Jacinda Ardern</a>\n" + 
				"<a href=\"/wiki/Lincoln_in_the_Bardo\" title=\"Lincoln in the Bardo\">Lincoln in the Bardo</a>\n" + 
				"<a href=\"/wiki/Battle_of_Marawi\" title=\"Battle of Marawi\">Battle of Marawi</a>\n" + 
				"<a href=\"/wiki/Battle_of_Raqqa_(2017)\" title=\"Battle of Raqqa (2017)\">Battle of Raqqa</a>\n" + 
				"<a href=\"/wiki/GW170817\" title=\"GW170817\">first observation</a>\n" + 
				"<a href=\"/wiki/Portal:Current_events\" title=\"Portal:Current events\">Other recent events</a>\n" +
				"<a href=\"/wiki/Deaths_in_2017\" title=\"Deaths in 2017\">Recent deaths</a>" ; 
				
		String actual = WebController.nandita(); 
		assertEquals(actual,expected); 
	}
}
