
package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadora {

    @Test // anotação que serve para o metodo ser executado como um teste.
    void testarSoma() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.calc(10, 5, "+");

        assertEquals(15.0, resultado);// serve para comparar se resultado obtido no teste é igual ao resultado
                                      // esperado
    }

    @Test
    void testarSubtracao() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.calc(10, 5, "-");

        assertEquals(5.0, resultado);
    }

    @Test
    void testarMultiplicacao() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.calc(10, 5, "*");

        assertEquals(50.0, resultado);
    }

    @Test
    void testarDivisao() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.calc(10, 5, "/");

        assertEquals(2.0, resultado);
    }

    @Test
    void testarDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();

        assertThrows(IllegalArgumentException.class,
                () -> calculadora.calc(10, 0, "/"));
    }

    @Test
    void testarOperacaoInvalida() {
        Calculadora calculadora = new Calculadora();

        assertThrows(IllegalArgumentException.class,
                () -> calculadora.calc(10, 5, "%"));
    }
}
