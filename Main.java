import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));

            String linea;
            while ((linea = br.readLine()) != null) {
                int resultado = PostfixEvaluator.evaluarExpresion(linea);
                System.out.println("Resultado: " + resultado);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

