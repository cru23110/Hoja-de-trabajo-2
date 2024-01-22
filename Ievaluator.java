public interface Ievaluator {
    
    boolean esOperando(String c);

    boolean esOperador(String c);
    
    int evaluarExpresion(String expresion);
}