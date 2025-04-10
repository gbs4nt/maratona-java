package introducao.devdojo.maratonajava.javacore.Minterface.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; //todos os atributos são constates em interfaces

    void load(); //todos os métodos em interface são public e abstract

   default void checkPermission(){
       System.out.println("Fazendo checagem de permissões.");

   }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface ");
    }

}
