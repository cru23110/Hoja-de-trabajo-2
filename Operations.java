public class Operations {
    public static int aplicarOperacion(int operandoA, int operandoB, String operador) {
        switch (operador) {
            case "+":
                return operandoA + operandoB;
            case "-":
                return operandoA - operandoB;
            case "*":
                return operandoA * operandoB;
            case "/":
                return operandoA / operandoB;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
