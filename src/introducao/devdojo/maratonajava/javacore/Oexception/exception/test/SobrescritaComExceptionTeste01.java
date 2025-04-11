package introducao.devdojo.maratonajava.javacore.Oexception.exception.test;

import introducao.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import introducao.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import introducao.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

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
