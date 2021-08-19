package com.twishish;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenTest {

	@Test
	public void evenTest() {
		OddEven meo = new OddEven();
        assertEquals("Even number", true, meo.isEvenNumber(14));
	}
	
	@Test
	public void oddTest() {
		OddEven meo = new OddEven();
        assertEquals("Odd number", true, meo.isOddNumber(13));
	}

}
