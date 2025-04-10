package introducao.devdojo.maratonajava.javacore.Minterface.dominio;

public interface DataLoader {

    void load(); //todos os métodos em interface são public e abstract

   default void checkPermission(){
       System.out.println("Fazendo checagem de permissões.");
   }

}
