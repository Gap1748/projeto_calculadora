package calculadora;

public class Calculadora {

    public double calc(int a, int b, String op) {

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

        if (b == 0) {
            throw new IllegalArgumentException(
                    "Não é possível dividir por zero.");
        }

    }
}
