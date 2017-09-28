package jnuttest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddint {

	@Test
	public void test() {
		jutest ob = new jutest();
		int res = ob.addint(100, 200);
		assertEquals(300,res);
	}

}
