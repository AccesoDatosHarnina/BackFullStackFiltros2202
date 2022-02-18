package com.example.backfullstack2201.modelo;

import java.util.Objects;

public class Student {
    private final Integer id;
    private  String name;
    private float aportacion;
    private float valoracion;
    private int edad;

    public Student(Integer id, String name, float aportacion, float valoracion, int edad) {
        this.id = id;
        this.name = name;
        this.aportacion = aportacion;
        this.valoracion = valoracion;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.aportacion, aportacion) == 0 && Float.compare(student.valoracion, valoracion) == 0 && edad == student.edad && Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, aportacion, valoracion, edad);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAportacion() {
        return aportacion;
    }

    public void setAportacion(float aportacion) {
        this.aportacion = aportacion;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
