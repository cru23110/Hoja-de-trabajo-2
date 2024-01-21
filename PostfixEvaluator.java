public class PostfixEvaluator {
    public static int evaluarExpresion(String expresion) {
        CustomStack<Integer> pila = new CustomStack<>();

        String[] elementos = expresion.split(" ");

        for (String elemento : elementos) {
            if (esOperando(elemento)) {
                pila.push(Integer.parseInt(elemento));
            } else if (esOperador(elemento)) {
                int operandoB = pila.pop();
                int operandoA = pila.pop();
                int resultado = Operaciones.aplicarOperacion(operandoA, operandoB, elemento);
                pila.push(resultado);
            }
        }

        return pila.pop();
    }

}
