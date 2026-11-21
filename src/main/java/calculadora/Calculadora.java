package calculadora;

public class Calculadora {

    /**
     * calculadora de operações matemáticas básicas.
     *
     * @author Gabriel Augusto Pereira Da Silva
     * @version 1.0
     */

    public double calc(int a, int b, String op) {

        /**
         * Realiza uma operação matemática entre dois números.
         *
         * @param a  primeiro número da operação
         * @param b  segundo número da operação
         * @param op operador matemático
         * @return resultado da operação
         * @throws IllegalArgumentException se a operação for inválida
         *                                  ou se ocorrer uma divisão por zero
         */

        switch (op) {
            case "+":
                return (double) a + b;

            case "-":
                return (double) a - b;

            case "/":

                validarDivisor(b);
                return (double) a / b;

            case "*":
                return (double) a * b;

            default:
                throw new IllegalArgumentException(
                        "Operação inválida. Use +, -, / ou *.");
        }
    }

    private void validarDivisor(int b) {
        /**
         * verifica se o divisor é diferente de 0
         * 
         * @param b divisor da operação
         * @throws illegalArgumentException se o divisor for 0
         */
        if (b == 0) {
            throw new IllegalArgumentException(
                    "Não é possível dividir por zero.");
        }

    }
}
