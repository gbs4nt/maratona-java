package introducao.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file, true );
              BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("O devDojo é lindo, é o melhor curso do brasillllll" );
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
