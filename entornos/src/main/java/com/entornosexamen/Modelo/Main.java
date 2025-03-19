package com.entornosexamen;

import com.entornosexamen.Modelo.InicialesAlumno_Circulo;
import com.entornosexamen.Modelo.InicialesAlumno_Rectangulo;


public class Main {
    public static void main(String[] args) {
        InicialesAlumno_Circulo circulo1 = new InicialesAlumno_Circulo(3, " Verde ");
        InicialesAlumno_Rectangulo cuadrado1 = new InicialesAlumno_Rectangulo(3, 3, " rojo ");

        double ladoA = cuadrado1.getLadoA();
        double ladoB = cuadrado1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println(" Area Cuadrado: " + area1);

        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println(" Area circulo: " + area2);

        double diferencia = area1-area2;
        System.out.println(" Diferencia areas: " + diferencia);

        System.out.println(" Cuadrado: " + cuadrado1);
        System.out.println(" Circulo: " + circulo1);
        System.out.println(" Diferencia: " + diferencia);



    }
}
