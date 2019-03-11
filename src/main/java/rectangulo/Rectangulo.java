package rectangulo;

import figura.Figura;

public class Rectangulo extends Figura {

    String nombre = null;
    double base = 0d;
    double altura = 0d;

    public Rectangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;

    }


    public Rectangulo(String nombre, int base, int altura) {

        this.nombre = nombre;
        this.base = base;
        this.altura = altura;

    }


    public String getNombre() {

        return this.nombre;

    }


    public double getBase() {

        return this.base;

    }


    public double getAltura() {

        return this.altura;

    }



    public double calcularArea() {

        return this.getBase() * this.getAltura();

    }

}
