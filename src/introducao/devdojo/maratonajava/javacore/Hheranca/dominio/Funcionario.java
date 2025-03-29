package introducao.devdojo.maratonajava.javacore.Hheranca.dominio;



public class Funcionario extends Pessoa {
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

    }
    public void relatioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o pagamento de "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
