//Autor: MIGUEL ESCUDERO
//Version 1.0


package com.entornosexamen.Modelo;

import com.entornosexamen.Modelo.InicialesAlumno_Circulo;
import com.entornosexamen.Modelo.InicialesAlumno_Rectangulo;


public class Main {
    public static void main(String[] args) {

        //Declaramos objetoss
        InicialesAlumno_Circulo circulo1 = new InicialesAlumno_Circulo(3, " Verde ");
        InicialesAlumno_Rectangulo cuadrado1 = new InicialesAlumno_Rectangulo(3, 3, " rojo ");

        double area1 = getAreaCuadrado(cuadrado1);

        double area2 = getAreaCirculo(circulo1);

        double diferencia = calculoDiferencias(area1, area2);

        imprimirResultados(circulo1, cuadrado1, diferencia);



    }
    //Imprimir Resultado
    private static void imprimirResultados(InicialesAlumno_Circulo circulo1, InicialesAlumno_Rectangulo cuadrado1,
            double diferencia) {
        System.out.println(" Cuadrado: " + cuadrado1);
        System.out.println(" Circulo: " + circulo1);
        System.out.println(" Diferencia: " + diferencia);
    }
    //CalculoDiferencias
    private static double calculoDiferencias(double area1, double area2) {
        double diferencia = area1-area2;
        System.out.println(" Diferencia areas: " + diferencia);
        return diferencia;
    }
    //Calc
    private static double getAreaCirculo(InicialesAlumno_Circulo circulo1) {
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println(" Area circulo: " + area2);
        return area2;
    }

    private static double getAreaCuadrado(InicialesAlumno_Rectangulo cuadrado1) {
        double ladoA = cuadrado1.getLadoA();
        double ladoB = cuadrado1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println(" Area Cuadrado: " + area1);
        return area1;
    }
}
