package introducao.devdojo.maratonajava.javacore.Ycoleções.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if(this.getClass()!=obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber !=null && serialNumber.equals(smartphone.serialNumber);
    }

    //se x.equals(y) == true, y.hashCode() == x.hashCode()
    //y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem qe ser true
    // se x.equals(y) == false
    //y.hashCode()!= x.hashCode() x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return serialNumber==null ? 0:this.serialNumber.hashCode();

    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
