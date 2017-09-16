package com.example.pc_38.evaluacionuno;

import java.io.Serializable;

/**
 * Created by PC-38 on 16/9/2017.
 */

public class Estudiantes implements Serializable{
    private String nombre, codigo, materia;
    private double parcial1, Parcial2, Parcial3, Promedio;

    public Estudiantes(String nombre, String codigo, String materia, double parcial1, double parcial2, double parcial3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        Parcial2 = parcial2;
        Parcial3 = parcial3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return Parcial2;
    }

    public void setParcial2(double parcial2) {
        Parcial2 = parcial2;
    }

    public double getParcial3() {
        return Parcial3;
    }

    public void setParcial3(double parcial3) {
        Parcial3 = parcial3;
    }

    public double getPromedio() {
        double res = ((parcial1*0.3) + (Parcial2*0.3)+(Parcial3*0.4));
        return res;
    }

    public void setPromedio(double promedio) {
        Promedio = promedio;
    }
}
