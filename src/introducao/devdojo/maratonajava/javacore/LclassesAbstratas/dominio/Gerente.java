package introducao.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

public class Gerente extends Funcionario {
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    @Override
    public void calculaBonus(){
        this.salario = salario +salario *0.15;
    }


    public Gerente(String nome, double salario) {
        super(nome, salario);

    }
}
