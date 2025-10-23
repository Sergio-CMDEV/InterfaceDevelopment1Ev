package model;

public class Pez extends Animal implements Nadador{
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void nadar() {
        System.out.println("Nada entre las algas");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pez no hace sonido");
    }
}
