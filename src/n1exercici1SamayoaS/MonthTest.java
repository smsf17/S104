package n1exercici1SamayoaS;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MonthTest {
	
	 Month obj = new Month ();  

	 @Test
	 void testsize() {
		 obj.addMonth("enero");
		 obj.addMonth("febrero");
		 obj.addMonth("marzo");
		 obj.addMonth("abril");
		 obj.addMonth("mayo");
		 obj.addMonth("junio");
		 obj.addMonth("julio");
		 obj.addMonth("agosto");
		 obj.addMonth("septiembre");
		 obj.addMonth("octubre");
		 obj.addMonth("noviembre");
		 obj.addMonth("diciembre");
		 assertEquals("12 meses del año", 12, obj.size());  
	 }

	
	@Test
	void testaugust() {
		 obj.addMonth("enero");
		 obj.addMonth("febrero");
		 obj.addMonth("marzo");
		 obj.addMonth("abril");
		 obj.addMonth("mayo");
		 obj.addMonth("junio");
		 obj.addMonth("julio");
		 obj.addMonth("agosto");
		 obj.addMonth("septiembre");
		 obj.addMonth("octubre");
		 obj.addMonth("noviembre");
		 obj.addMonth("diciembre");
		assertEquals("agosto", obj.august2());
	}

}

