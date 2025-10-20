package model;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, 0); 
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado por horas: " + getNombre());
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: " + tarifaPorHora + "€");
        System.out.println("Salario total: " + calcularSalario() + "€");
    }
}
