package tadsPalindromo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromoTest {
	
	private static Palindromo palindromo;
	
	@BeforeClass
	public static void setUpClass() {
		palindromo = new Palindromo();
	}
	
	@Test
	public void testHifen() {
		String strTeste = "Socorram-me subi no onibus em Marrocos";
        assertTrue(palindromo.ehPalindromo(strTeste));
	}
	
	@Test
	public void testEspacos() {
		String strTeste = "Anotaram a data da maratona";
        assertTrue(palindromo.ehPalindromo(strTeste));
	}

}
