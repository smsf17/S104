package n1excercici2SamayoaS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {
	
	@ParameterizedTest
	@CsvSource({
		"47994164, H",
		"44018141, M",
		"23817169, W",
		"23843011, S",
		"24080216, K",
		"38416793, P",
		"37367832, P",
		"36973657, F",
		"23782879, M",
		"44008499, T",	
	})

	void testletraDni(int dni, String letra ) {
		CalculoDni aux = new CalculoDni(dni);
		String resultado = aux.letraDni(dni);
		assertEquals(letra, resultado);	
	}
}
