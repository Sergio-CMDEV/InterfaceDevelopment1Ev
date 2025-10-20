package model;

public class EmpleadoTiempoCompleto extends Empleado {
    private int horasExtra;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, int horasExtra) {
        super(nombre, salarioBase); 
        this.horasExtra = horasExtra;
    }
    @Override
    public double calcularSalario() {
        double pagoHorasExtra = horasExtra * 20;
        return getSalarioBase() + pagoHorasExtra;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Salario total: " + calcularSalario() + "€");
    }
}
