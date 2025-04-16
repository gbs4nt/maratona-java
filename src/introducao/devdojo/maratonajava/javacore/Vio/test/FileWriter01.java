package introducao.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file, true)){
            fw.write("O devDojo é lindo, é o melhor curso do brasillllll\n Continunando\n" );
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
