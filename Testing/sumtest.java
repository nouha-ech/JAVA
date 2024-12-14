package mathematic.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mathematics.code.Carre;

class sumtest {

	@Test
	void sumtestfive() {
		Carre cc = new Carre();
		int additres = cc.additioner(2, 3);
		assertEquals(5,additres);
	}
	
	@Test
	void sumtesten() {
		Carre cc = new Carre();
		int additres = cc.additioner(8, 3);
		assertEquals(10,additres);
	}

}
