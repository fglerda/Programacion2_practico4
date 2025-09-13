/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt4_poo;

public class Empleado {

    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto (id automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // salario por defecto
        totalEmpleados++;
    }

    // Método sobrecargado: actualizar salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        }
    }

    // Método sobrecargado: actualizar salario por monto fijo
    public void actualizarSalario(int montoFijo) {
        if (montoFijo > 0) {
            this.salario += montoFijo;
        }
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario + "]";
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
