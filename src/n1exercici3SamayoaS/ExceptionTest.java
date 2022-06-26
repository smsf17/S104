package n1exercici3SamayoaS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionTest {

	Exception obj = new Exception ();

	 @Test
	 void testIndexOutBoundsException() {
		 
		 obj.addMonth("enero");
		 obj.addMonth("febrero");
		 obj.addMonth("marzo");
		 obj.addMonth("abril");
		 obj.addMonth("mayo");
		 obj.addMonth("junio");
		 obj.addMonth("julio");
		 Assertions.assertThrows(IndexOutOfBoundsException.class,
				 () -> obj.august2());  
	 }


}

