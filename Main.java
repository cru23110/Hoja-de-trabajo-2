/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @author Juan Marcos Cruz Melara, 23110 
 * @description clase principal que se encarga de mostrar el resultado de la operación postfix
 * @date creación 19/01/2024 última modificación 23/01/2024
 */

 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));

            String linea;
            PostfixEvaluator postfixEvaluator = new PostfixEvaluator();

            while ((linea = br.readLine()) != null) {
                int resultado = postfixEvaluator.evaluarExpresion(linea);
                System.out.println("Resultado: " + resultado);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error, no existe el archivo datos.txt en el folder: " );
            e.printStackTrace();
        }
    }
}


