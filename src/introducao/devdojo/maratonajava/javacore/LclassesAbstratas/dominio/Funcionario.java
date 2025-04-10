package introducao.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
        //Para que seja possível a extensão da classe funcionario com a classe pessoa é preciso que
        // ao menos UMA das classes que se relacionam tenha o
        //método da classe que está se tentando extender, nesse caso
        //é preciso que pelo menos uma classe tenha o método imprime da classe pessoa.
    }
    @Override
    public void imprime(){
        System.out.println("Imprimindo");
    }

public abstract void calculaBonus();
}
