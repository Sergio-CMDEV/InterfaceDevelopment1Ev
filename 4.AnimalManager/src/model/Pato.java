package model;

public class Pato extends Animal implements Volador, Nadador{
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void nadar() {
        System.out.println("Nada sobre el agua");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Cuaq Cuaq");
    }

    @Override
    public void volar() {

    }
}
