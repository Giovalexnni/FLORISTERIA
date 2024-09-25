package org.example.Modelos;

import java.time.LocalDate;

public class Cliente {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer telefono;
    private String correo;
    private String direccion;
    private String ips;
    private LocalDate fechaNacimiento;
    private Long salario;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido, Integer edad, Integer telefono, String correo, String direccion, String ips, LocalDate fechaNacimiento, Long salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ips = ips;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    public void imprimirDatos() {
        System.out.println("Cliente [ID=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + "]");
    }
}
