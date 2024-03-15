package com.prueba.endes.prueba_endes;

import java.util.LinkedList;
import java.util.List;

public class EmployeeManager {
	/*
	 * Modificamos la clase EmployeeManager para usar una lista dinámica (List<Employee>) en vez de arrays estáticos
	 * 
	 * @version 1.1
	 * @author Daniel Vilar Martínez
	 */
	private List<Employee> listaEmpleados = new LinkedList<Employee>();
	/**
	 * Modificamos el método addEmployee utilizando nuestra List listaEmpleados
	 * 
	 * @param empleado
	 * @return añade un empleado a listaEmpleados
	 */
	public boolean addEmployee(Employee empleado) {
		try {
			listaEmpleados.add(empleado);
			return true;
		} catch (Exception e) {
			System.out.println("No se ha podido añadir al empleado.");
			return true;
		}
	}
	/*
	 * Refactorizamos el método printEmployees utilizando un bucle for-each para iterar sobre la lista de empleados e imprimirla
	 * 
	 * @return muestra por consola la lista de empleados
	 */
	public void printEmployees() {
		System.out.println("List of employees");
		
		for (Employee e : listaEmpleados) System.out.println(e.getNombre()+", Years in company: "+e.getAnosAntiguedad());
	}
	
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee(new Employee("John Doe", 5));
		manager.addEmployee(new Employee("JaneSmith",2));
		manager.printEmployees();
	}
}
