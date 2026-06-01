package com.tarea;

public class Gato extends Mamiferos{
    public Gato(String nombre, String raza, String tipoAnimal, String fechaNacimiento, double peso, double alturaSalto) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipoAnimal = tipoAnimal;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.alturaSalto = alturaSalto;
    }
    double alturaSalto;
    @Override
    public void comunicarse() {
        System.out.println("Miau miau");
    }
}
