import java.util.EmptyStackException;

public class PostfixEvaluator implements Ievaluator {

    public boolean esOperando(String c) {
        boolean flag = true;
        int num = 0;
        try {
            num = Integer.parseInt(c);
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean esOperador(String c) {
        boolean flag = true;
        if (c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public int evaluarExpresion(String expresion) {
        CustomStack<Integer> pila = new CustomStack<>();

        String[] elementos = expresion.split(" ");

        try {
            for (String elemento : elementos) {
                if (esOperando(elemento)) {
                    pila.push(Integer.parseInt(elemento));
                } else if (esOperador(elemento)) {

                    try {
                        int operandoB = pila.pop();
                        int operandoA = pila.pop();

                        int resultado = Operations.aplicarOperacion(operandoA, operandoB, elemento);
                        pila.push(resultado);
                    } catch (EmptyStackException em) {
                        System.out.println("No es posible realizar la operación por falta de operadores");
                        return 0;
                    }

                } else {
                    System.out.println("Caracter invalido, corrija sus datos");
                    return 0;
                }
            }

            return pila.pop();
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir por cero");
            return 0; // devuelve 0 porque no se realizó ninguna operación
        }
    }

}
