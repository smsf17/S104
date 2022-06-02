package n1exercici3SamayoaS;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import n1excercici2SamayoaS.CalculoDni;

class ExceptionTest {

		Exception obj = new Exception();

		@Test
		void test1() {
			obj.addNumero(4);
			obj.addNumero(5);
			obj.addNumero(6);
			obj.addNumero(5);
			assertEquals(20, obj.sumaNumerosException());
			
		}