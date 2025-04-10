package introducao.devdojo.maratonajava.javacore.Minterface.dominio;

public class DatabaseLoader implements DataLoader{
    @Override
   public void load(){
        System.out.println("Carregando os dados do banco de dados");
    }

}
