import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class Start {
 
    public static void main(String[] args) throws IOException {
 
        String ruta = "notasPepe.txt";
        String texto = "";
        String cont = "";
        float contenidoFloat = 0.0f;
 
        float totalN = 0;
        float suma = 0.0f;
        float media = 0.0f;
 
        File file = new File(ruta);
 
        if (file.exists()) {
 
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
 
            try {
                while (texto != null) {
                    texto = br.readLine();
 
                    if (texto != null) {
                      
                        System.out.println(texto);
                        cont = texto.substring((texto.indexOf(' ')));
                        contenidoFloat = Float.parseFloat(cont);
                        suma = suma + contenidoFloat;
                        totalN++;
                    }
                }
 
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error al leer el archivo");
            }
 
            media = suma / totalN;
            System.out.println("La nota media del alumno es: " + media);
 
        } else {
            System.err.println("El fichero no existe");
        }
 
    }
}