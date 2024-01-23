/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @author Juan Marcos Cruz Melara, 23110 
 * @description puebas unitarias de JUnit del sistema
 * @date creación 19/01/2024 última modificación 23/01/2024
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PostfixTest {
    private PostfixEvaluator postfix;

    @Before
    public void setUp() {
        postfix = new PostfixEvaluator();
    }
    
    @Test
    public void testEvaluateExpressionWithEmptyOperators() {
        int result = postfix.evaluarExpresion("");
        //al no realizarse una operacion postfix la calculadora devuelve cero
        assertEquals(0, result);
    }

    @Test
    public void testEvaluateExpressionDivideByZero() {
        int result = postfix.evaluarExpresion("6 0 / 3 + *");
        //al no realizarse una operacion postfix la calculadora devuelve cero
        assertEquals(0, result);
    }

    //En estos test se evalua que puede pasar en diferentes situaciones
    @Test
    public void testEvaluarExpresion_UnSoloOperando() {
        PostfixEvaluator postfixEvaluator = new PostfixEvaluator();
        String expresion = "42";
        int resultado = postfixEvaluator.evaluarExpresion(expresion);
        assertEquals(42, resultado);
    }

    @Test
    public void testEvaluarExpresion_ConLetras() {
        PostfixEvaluator postfixEvaluator = new PostfixEvaluator();
        String expresion = "A B + C *";
        int resultado = postfixEvaluator.evaluarExpresion(expresion);
        assertEquals(20, resultado);
    }
    
    @Test
    public void testEvaluarExpresion_LetrasYOperaciones() {
        PostfixEvaluator postfixEvaluator = new PostfixEvaluator();
        String expresion = "X Y * Z +";
        int resultado = postfixEvaluator.evaluarExpresion(expresion);
        assertEquals(13, resultado);
    }
}

