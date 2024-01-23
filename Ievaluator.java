/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @author Juan Marcos Cruz Melara, 23110 
 * @description interfaz definida para crear la calculadora de operaciones postfix
 * @date creación 19/01/2024 última modificación 23/01/2024
 */

public interface Ievaluator {
    
    boolean esOperando(String c);

    boolean esOperador(String c);
    
    int evaluarExpresion(String expresion);
}