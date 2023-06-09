import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalinTest {

    @Test
    void hacerCadaLetraMinuscula() {
        assertEquals("abcdefghijklmnñopqrstuvxyz", Palin.hacerCadaLetraMinuscula("ABCDEFGHIJKLMNÑOPQRSTUVXYZ"));
    }

    @Test
    void hacerCadenaIdonea() {
        assertEquals("hola", Palin.HacerCadenaIdonea("H##$o[¨[¨**L   ,.,-´{´0897895a"));
        assertEquals("", Palin.HacerCadenaIdonea("   3552352532$%#%#,.,---:;:$"));
    }

    @Test
    void esPalindromo() {
        assertEquals(true, Palin.esPalindromo("kerek"));
        assertEquals(false, Palin.esPalindromo("kerek*"));
        assertEquals(false, Palin.esPalindromo("KEREK1"));
        assertEquals(false, Palin.esPalindromo(""));
    }

}