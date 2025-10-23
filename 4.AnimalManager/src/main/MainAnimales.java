package main;

import model.*;

public class MainAnimales {
    public static void main(String [] args) {
        Animal[] animales = new Animal[] {
                new Gato("Dave, the magic cheese wizard",9),
                new Pajaro("Juan",2),
                new Pato("Lucas", 12),
                new Perro("Juan", 5),
                new Pez("Nemo", 2)
        };
        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.comer();
            animal.hacerSonido();
            System.out.println("--------------------------------");
        }
    }
}
