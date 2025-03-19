package com.entornosexamen.Modelo;

public class InicialesAlumno_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    public InicialesAlumno_Rectangulo () {}

    public InicialesAlumno_Rectangulo (int id, double ladoA, double ladoB, String Color) {
        this.id= id;
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.color=color;
    }

    public InicialesAlumno_Rectangulo ( double ladoA, double ladoB, String Color) {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.color=color;
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLadoA() {
		return this.ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return this.ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    @Override
    public String toString(){
        return " id= " + id + " ladoA= " + ladoA + " ladoB= " + ladoB +  "color=" + color  ;
    }

    
    
}
