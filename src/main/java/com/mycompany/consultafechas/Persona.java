
package com.mycompany.consultafechas;

import java.time.LocalDate;

public class Persona {
    
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaFallecido;
    private LocalDate fechaMatrimonio;
    private LocalDate fechaGraduacion;
    private LocalDate fechaGanadorLoteria;
    private double montoGanado;
    private double montoAlMorir;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento, LocalDate fechaFallecido, LocalDate fechaMatrimonio, LocalDate fechaGraduacion, LocalDate fechaGanadorLoteria, double montoGanado, double montoAlMorir) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaFallecido = fechaFallecido;
        this.fechaMatrimonio = fechaMatrimonio;
        this.fechaGraduacion = fechaGraduacion;
        this.fechaGanadorLoteria = fechaGanadorLoteria;
        this.montoGanado = montoGanado;
        this.montoAlMorir = montoAlMorir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaFallecido() {
        return fechaFallecido;
    }

    public void setFechaFallecido(LocalDate fechaFallecido) {
        this.fechaFallecido = fechaFallecido;
    }

    public LocalDate getFechaMatrimonio() {
        return fechaMatrimonio;
    }

    public void setFechaMatrimonio(LocalDate fechaMatrimonio) {
        this.fechaMatrimonio = fechaMatrimonio;
    }

    public LocalDate getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(LocalDate fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }

    public LocalDate getFechaGanadorLoteria() {
        return fechaGanadorLoteria;
    }

    public void setFechaGanadorLoteria(LocalDate fechaGanadorLoteria) {
        this.fechaGanadorLoteria = fechaGanadorLoteria;
    }

    public double getMontoGanado() {
        return montoGanado;
    }

    public void setMontoGanado(double montoGanado) {
        this.montoGanado = montoGanado;
    }

    public double getMontoAlMorir() {
        return montoAlMorir;
    }

    public void setMontoAlMorir(double montoAlMorir) {
        this.montoAlMorir = montoAlMorir;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", fechaFallecido=" + fechaFallecido + ", fechaMatrimonio=" + fechaMatrimonio + ", fechaGraduacion=" + fechaGraduacion + ", fechaGanadorLoteria=" + fechaGanadorLoteria + ", montoGanado=" + montoGanado + ", montoAlMorir=" + montoAlMorir + '}';
    }
    
    
}
