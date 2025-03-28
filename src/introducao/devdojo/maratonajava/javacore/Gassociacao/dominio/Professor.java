package introducao.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;



    public void imprime(){
        System.out.println("--------");
        System.out.println("Nome do professor: "+getNome());
        System.out.println("--------");
        System.out.println("Especialidade: "+getEspecialidade());
        System.out.println("--------");
        if (this.seminarios==null) return;
     for(Seminario seminario:this.seminarios){
         System.out.println("Seminários em que ele estará disponível: ");
         System.out.println(seminario.getTitulo());
         System.out.println("Local: "+seminario.getLocal().getEndereco());
         if(seminario.getAlunos()==null) continue;
         System.out.println("Alunos cadastrados: ");
         for(Aluno aluno: seminario.getAlunos()){
             System.out.println("Aluno: "+ aluno.getNome()+ " Idade: "+aluno.getIdade()+" anos");

         }
     }
    }
    public Professor(String nome) {
        this.nome = nome;
    }


    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }
    public Seminario[] getSeminarios(){
        return seminarios;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public void setNome(String nome){
        this.nome=nome;

    }
    public String getNome(){
        return  nome;
    }
}
