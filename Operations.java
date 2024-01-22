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
                if(operandoB == 0){
                    throw new ArithmeticException();
                }
                return operandoA / operandoB; 
            default:
                throw new IllegalArgumentException("No deberias haber entrado aqui" + operador);
        }
    }
}
