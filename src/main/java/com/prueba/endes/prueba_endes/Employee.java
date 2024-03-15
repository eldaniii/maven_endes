package com.prueba.endes.prueba_endes;

public class Employee {
	private String nombre;
	private int anosAntiguedad;
	
	public Employee(String nombre, int anosAntiguedad) {
		super();
		this.nombre = nombre;
		this.anosAntiguedad = anosAntiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnosAntiguedad() {
		return anosAntiguedad;
	}

	public void setAnosAntiguedad(int anosAntiguedad) {
		this.anosAntiguedad = anosAntiguedad;
	}
}
