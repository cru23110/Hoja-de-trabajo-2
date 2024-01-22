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
        assertEquals(0, result);
    }

    public void testEvaluateExpressionDivideByZero() {
        int result = postfix.evaluarExpresion("6 0 / 3 + *");
        assertEquals(0, result);
    }
}
