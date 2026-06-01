package com.tarea;

public class Perro extends Mamiferos {
    public Perro(String nombre, String raza, String tipoAnimal, String fechaNacimiento, double peso, String lugarEntrenamiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipoAnimal = tipoAnimal;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.lugarEntrenamiento = lugarEntrenamiento;
    }
    String lugarEntrenamiento;
    @Override
    public void comunicarse() {
        System.out.println("Guau guau");
    }
}
