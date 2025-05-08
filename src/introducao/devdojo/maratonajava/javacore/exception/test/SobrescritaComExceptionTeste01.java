package introducao.devdojo.maratonajava.javacore.exception.test;

import introducao.devdojo.maratonajava.javacore.exception.dominio.Funcionario;
import introducao.devdojo.maratonajava.javacore.exception.dominio.LoginInvalidoException;
import introducao.devdojo.maratonajava.javacore.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
try {
    funcionario.salvar();
}catch(LoginInvalidoException | FileNotFoundException e){
    e.printStackTrace();
}
    }
}
