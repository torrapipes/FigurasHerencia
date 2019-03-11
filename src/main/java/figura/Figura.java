package figura;


public class Figura {

    String nombre = null;

    public Figura() {

        this.nombre = "Desconocido";

    }


    public Figura(String nombre) {

        this.nombre = nombre;

    }


    public String getNombre() {

        return nombre;

    }


    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

}
