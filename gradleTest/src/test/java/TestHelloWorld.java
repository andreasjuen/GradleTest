package de.gradlebuch;

import java.util.List;
import static org.junit.Assert.assertEquals;;
import static org.testng.AssertJUnit.*;
import org.testng.annotations.*;

public class TestHelloWorld{
	HelloWorld oUT;
	
	@BeforeTest
	public void setUp(){
		oUT = new HelloWorld();
	}
	
	@Test
	public void testGenerateGreetingsData(){
		List<String> res = oUT.generateGreetingsData();
		assertEquals("Falsche Anzahl Eintraege", 1, res.size());
	}
}

