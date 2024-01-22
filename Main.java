import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
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


