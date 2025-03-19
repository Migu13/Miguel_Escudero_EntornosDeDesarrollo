//Autor: MIGUEL ESCUDERO
//Version 1.0


package com.entornosexamen.Modelo;

public class InicialesAlumno_Circulo {
    private int id;
    private double radio;
    private String color;
    
    //Constructor basico
    public InicialesAlumno_Circulo () {}


    //Constructor
    public InicialesAlumno_Circulo (int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }
    //Constructor sin double
    public InicialesAlumno_Circulo (int id, String color) {
        this.id = id;
        this.color = color;
    }
    //getters and setters
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    //toString
    @Override
    public String toString(){
        return " id= " + id + " radio= " + radio + " color= " + color ;
    }
    //CalcularAreaCirculo
    private static double getAreaCirculo(InicialesAlumno_Circulo circulo1) {
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println(" Area circulo: " + area2);
        return area2;
    }



}
