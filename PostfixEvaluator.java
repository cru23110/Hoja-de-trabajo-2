public class PostfixEvaluator {
    
    public static boolean esOperando(String c){
        boolean flag = true;
        int num = 0;
        try{
            num = Integer.parseInt(c);
            flag = true;
        }catch(Exception e){
            flag = false;
        }
        return flag;
    }

    public static boolean esOperador(String c){
        boolean flag = true;
        if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
    
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
