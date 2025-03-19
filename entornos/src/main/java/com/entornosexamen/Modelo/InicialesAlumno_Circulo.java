package com.entornosexamen.Modelo;

public class InicialesAlumno_Circulo {
    private int id;
    private double radio;
    private String color;

    public InicialesAlumno_Circulo () {}

    public InicialesAlumno_Circulo (int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    public InicialesAlumno_Circulo (int id, String color) {
        this.id = id;
        this.color = color;
    }

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

    @Override
    public String toString(){
        return " id= " + id + " radio= " + radio + " color= " + color ;
    }



}
