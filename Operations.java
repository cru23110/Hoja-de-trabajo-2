/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @author Juan Marcos Cruz Melara, 23110 
 * @description clase que realiza la operación aritmetica que se necesite con los operandos mandados
 * @date creación 19/01/2024 última modificación 23/01/2024
 */

public class Operations {
    
    /** 
     * @param operandoA
     * @param operandoB
     * @param operador
     * @return int
     */
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
