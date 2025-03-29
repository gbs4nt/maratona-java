package introducao.devdojo.maratonajava.javacore.Hheranca.test;

import introducao.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import introducao.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import introducao.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Aogiri-la-longe");
        endereco.setCep("1000-7");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kaneki-ken");
        pessoa.setCpf("Hai-ka-reaper");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda genio");
        funcionario.setCpf("33-33");
        funcionario.setSalario(19238);
        funcionario.setEndereco(endereco);
        System.out.println("---------");
        funcionario.imprime();

    }

}
