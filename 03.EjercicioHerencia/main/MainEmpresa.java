package main;

import model.*;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Ana", 1500, 5);
        empleados[1] = new EmpleadoPorHoras("Luis", 40, 15);

        for (Empleado e : empleados) {
            e.mostrarInformacion();
            System.out.println("");
        }
    }
}
