package introducao.devdojo.maratonajava.javacore.Minterface.test;

import introducao.devdojo.maratonajava.javacore.Minterface.dominio.DataLoader;
import introducao.devdojo.maratonajava.javacore.Minterface.dominio.DatabaseLoader;
import introducao.devdojo.maratonajava.javacore.Minterface.dominio.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DataLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

    }
}
