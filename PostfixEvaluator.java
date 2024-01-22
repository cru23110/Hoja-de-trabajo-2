public class PostfixEvaluator implements Ievaluator {
    
    @Override
    public boolean esOperando(String c){
        boolean flag = true;
        int num = 0;
        try{
            num = Integer.parseInt(c);
            flag = true;
        } catch(Exception e){
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean esOperador(String c){
        boolean flag = true;
        if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")){
            flag = true;
        } else{
            flag = false;
        }
        return flag;
    }
    
    @Override
    public int evaluarExpresion(String expresion) {
        CustomStack<Integer> pila = new CustomStack<>();

        String[] elementos = expresion.split(" ");

        for (String elemento : elementos) {
            if (esOperando(elemento)) {
                pila.push(Integer.parseInt(elemento));
            } else if (esOperador(elemento)) {
                int operandoB = pila.pop();
                int operandoA = pila.pop();
                int resultado = Operations.aplicarOperacion(operandoA, operandoB, elemento);
                pila.push(resultado);
            }
        }

        return pila.pop();
    }
}

