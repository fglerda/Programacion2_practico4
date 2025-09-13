/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt4_poo;

public class PT4_POO {

    public static void main(String[] args) {

        // Crear empleados ficticios con ambos constructores
        Empleado e1 = new Empleado(101, "Ana Gómez", "Analista", 1500000.0);
        Empleado e2 = new Empleado("Luis Pérez", "Desarrollador");
        Empleado e3 = new Empleado("Carla Ruiz", "Tester");

        // Aplicar métodos sobrecargados
        e1.actualizarSalario(10); // 10% de aumento
        e2.actualizarSalario(1000000); // aumento fijo

        // Mostrar información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
