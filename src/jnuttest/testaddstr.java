package jnuttest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstr {

	@Test
	public void test() {
		jutest ob = new jutest();
		String res = ob.addstr("J ", "Unit");
		assertEquals("J Unit",res);
	}

}
