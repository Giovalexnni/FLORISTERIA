package org.example.Ayudas;

public class Repartidor {

    private Integer id;
    private String nombre;
    private Integer telefono;
    private Boolean manejoFlores;
    private Integer fuerzaFisica;
    private Boolean puntualidad;
    private Boolean responsabilidad;
    private Boolean actitud;
    private Boolean conduccion;
    private Boolean conoceRutas;

    public Repartidor() {
    }

    public Repartidor(Integer id, String nombre, Integer telefono, Boolean manejoFlores, Integer fuerzaFisica, Boolean puntualidad, Boolean responsabilidad, Boolean actitud, Boolean conduccion, Boolean conoceRutas) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.manejoFlores = manejoFlores;
        this.fuerzaFisica = fuerzaFisica;
        this.puntualidad = puntualidad;
        this.responsabilidad = responsabilidad;
        this.actitud = actitud;
        this.conduccion = conduccion;
        this.conoceRutas = conoceRutas;
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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Boolean getManejoFlores() {
        return manejoFlores;
    }

    public void setManejoFlores(Boolean manejoFlores) {
        this.manejoFlores = manejoFlores;
    }

    public Integer getFuerzaFisica() {
        return fuerzaFisica;
    }

    public void setFuerzaFisica(Integer fuerzaFisica) {
        this.fuerzaFisica = fuerzaFisica;
    }

    public Boolean getPuntualidad() {
        return puntualidad;
    }

    public void setPuntualidad(Boolean puntualidad) {
        this.puntualidad = puntualidad;
    }

    public Boolean getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(Boolean responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public Boolean getActitud() {
        return actitud;
    }

    public void setActitud(Boolean actitud) {
        this.actitud = actitud;
    }

    public Boolean getConduccion() {
        return conduccion;
    }

    public void setConduccion(Boolean conduccion) {
        this.conduccion = conduccion;
    }

    public Boolean getConoceRutas() {
        return conoceRutas;
    }

    public void setConoceRutas(Boolean conoceRutas) {
        this.conoceRutas = conoceRutas;
    }

    public void imprimirDatos() {
        System.out.println("Repartidor [ID=" + id + ", Nombre=" + nombre + ", Telefono=" + telefono + "]");
    }
}