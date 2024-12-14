package mathematic.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mathematics.code.Carre;

class unitest {

		@Test
		public void  testCalculerCarre() {
			Carre obj1 = new Carre();
			int output_f = obj1.calculerCarre(4);
			Assertions.assertEquals(16, output_f);
		}
		
		
		@Test
		public void  testCarrthree() {
			Carre obj1 = new Carre();
			int output_f = obj1.calculerCarre(3);
			Assertions.assertEquals(10, output_f);
		}
		
		
		@Test
		public void  testCarrten() {
			Carre obj1 = new Carre();
			int output_f = obj1.calculerCarre(10);
			Assertions.assertEquals(1, output_f);
		}


}
