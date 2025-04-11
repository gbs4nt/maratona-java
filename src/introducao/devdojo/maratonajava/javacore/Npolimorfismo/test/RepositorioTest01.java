package introducao.devdojo.maratonajava.javacore.Npolimorfismo.test;

import introducao.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancodeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
