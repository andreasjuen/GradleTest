package de.gradlebuch;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class TestHelloWorld{
	HelloWorld oUT;
	
	@Before
	public void setUp(){
		oUT = new HelloWorld();
	}
	
	@Test
	public void testGenerateGreetingsData(){
		List<String> res = oUT.generateGreetingsData();
		assertEquals("Falsche Anzahl Eintraege", 1, res.size());
	}
}
