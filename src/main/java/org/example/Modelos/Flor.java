package org.example.Modelos;

public class Flor {

    private Integer id;
    private String nombre;
    private Integer Petalos;
    private Integer hojas;
    private String color;
    private String simetriaForma;
    private String fragancia;
    private String enfermedades;
    private String boton;
    private Double precio;

    public Flor() {
    }

    public Flor(Integer id, String nombre, Integer petalos, Integer hojas, String color, String simetriaForma, String fragancia, String enfermedades, String boton, Double precio) {
        this.id = id;
        this.nombre = nombre;
        Petalos = petalos;
        this.hojas = hojas;
        this.color = color;
        this.simetriaForma = simetriaForma;
        this.fragancia = fragancia;
        this.enfermedades = enfermedades;
        this.boton = boton;
        this.precio = precio;
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

    public Integer getPetalos() {
        return Petalos;
    }

    public void setPetalos(Integer petalos) {
        Petalos = petalos;
    }

    public Integer getHojas() {
        return hojas;
    }

    public void setHojas(Integer hojas) {
        this.hojas = hojas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSimetriaForma() {
        return simetriaForma;
    }

    public void setSimetriaForma(String simetriaForma) {
        this.simetriaForma = simetriaForma;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Flor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Petalos=" + Petalos +
                ", hojas=" + hojas +
                ", color='" + color + '\'' +
                ", simetriaForma='" + simetriaForma + '\'' +
                ", fragancia='" + fragancia + '\'' +
                ", enfermedades='" + enfermedades + '\'' +
                ", boton='" + boton + '\'' +
                ", precio=" + precio +
                '}';

    }}
