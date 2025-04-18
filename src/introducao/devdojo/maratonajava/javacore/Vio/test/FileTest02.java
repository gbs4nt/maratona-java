package introducao.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isArquivoCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isArquivoCreated);
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        fileArquivoDiretorio.renameTo(fileRenamed);
        File diretorioRenamed = new File("pasta2");
        fileDiretorio.renameTo(diretorioRenamed);
    }
}
