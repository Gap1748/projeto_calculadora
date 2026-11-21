package calculadora;

public class Calculadora {

    public double calc(int a, int b, String op) {

        switch (op) {
            case "+":
                return (double) a + b;

            case "-":
                return (double) a - b;

            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException(
                            "Não é possível dividir por zero.");
                }

                return (double) a / b;

            case "*":
                return (double) a * b;

            default:
                throw new IllegalArgumentException(
                        "Operação inválida. Use +, -, / ou *.");
        }
    }
}
