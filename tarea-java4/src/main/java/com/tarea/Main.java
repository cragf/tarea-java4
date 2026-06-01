package com.tarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sca = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);

        System.out.println("Ingrese los datos del perro:");
        System.out.print("Nombre: ");
        String nombrep = sca.nextLine();
        System.out.print("Raza: ");
        String razap = sca.nextLine();
        System.out.print("Tipo de animal: ");
        String tipoAnimalp = sca.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimientop = sca.nextLine();
        System.out.print("Peso: ");
        double pesop = sca.nextDouble(); sca.nextLine(); // Limpiar el buffer
        System.out.print("Lugar de entrenamiento: ");
        String lugarEntrenamiento = sca.nextLine();

        Perro perro1 = new Perro(nombrep, razap, tipoAnimalp, fechaNacimientop, pesop, lugarEntrenamiento);

        perro1.comunicarse();


 
        System.out.println("Ingrese los datos del gato:");
        System.out.print("Nombre: ");
        String nombreg = sca2.nextLine();
        System.out.print("Raza: ");
        String razag = sca2.nextLine();
        System.out.print("Tipo de animal: ");
        String tipoAnimalg = sca2.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimientog = sca2.nextLine();
        System.out.print("Peso: ");
        double pesog = sca2.nextDouble();
        System.out.print("Altura de salto: ");
        double alturaSalto = sca2.nextDouble();

        Gato gato1 = new Gato(nombreg, razag, tipoAnimalg, fechaNacimientog, pesog, alturaSalto);

        gato1.comunicarse();

        sca2.close();
        sca.close();
    }
}