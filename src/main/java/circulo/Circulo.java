package circulo;

import figura.Figura;

public class Circulo extends Figura {

    double radio = 0d;
    private final double PI = Math.PI;

    public Circulo(double radio) {

        super();
        this.radio = radio;

    }


    public Circulo(String nombre, double radio) {

        super(nombre);
        this.radio = radio;

    }


    public double getRadio() {

        return this.radio;

    }


    public double calcularArea() {

        return PI * Math.pow(radio, 2);

    }

}
