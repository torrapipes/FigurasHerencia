package main;

import circulo.Circulo;
import rectangulo.Rectangulo;

public class main {


    public static void main( String[] args ) {

            Rectangulo rectanguloConstructorSuper = new Rectangulo(4, 5);
            Rectangulo rectanguloConstructorLocal = new Rectangulo("rectángulo", 4, 5);

            Circulo circuloConstructorSuper = new Circulo(5);
            Circulo circuloConstructorLocal = new Circulo("círculo", 5);

    }


}
