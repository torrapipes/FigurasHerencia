package circulo;

public class Circulo {

    double radio = 0d;
    String nombre = null;
    private final double PI = Math.PI;

    public Circulo(double radio) {

        this.radio = radio;

    }


    public Circulo(String nombre, double radio) {

        this.radio = radio;
        this.nombre = nombre;

    }


    public String getNombre() {

        return this.nombre;

    }


    public double getRadio() {

        return this.radio;

    }


    public double calcularArea() {

        return PI * Math.pow(radio, 2);

    }

}
