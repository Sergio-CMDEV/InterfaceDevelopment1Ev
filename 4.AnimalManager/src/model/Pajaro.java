package model;

public class Pajaro extends Animal implements Volador {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println("Pio Pio");
    }
    @Override
    public void volar() {
        System.out.println(nombre + " está volando alto.");
    }
}
