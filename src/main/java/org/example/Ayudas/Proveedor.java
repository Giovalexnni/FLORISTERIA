package org.example.Ayudas;

public class Proveedor {

    private Integer id;
    private String nombre;
    private String direccion;
    private Integer telefono;
    private String email;
    private String tipoProducto;
    private String metodoPago;
    private Boolean escofiable;
    private String paisOrigen;
    private Double calificacion;

    public Proveedor() {
    }

    public Proveedor(Integer id, String nombre, String direccion, Integer telefono, String email, String tipoProducto, String metodoPago, Boolean escofiable, String paisOrigen, Double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoProducto = tipoProducto;
        this.metodoPago = metodoPago;
        this.escofiable = escofiable;
        this.paisOrigen = paisOrigen;
        this.calificacion = calificacion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Boolean getEscofiable() {
        return escofiable;
    }

    public void setEscofiable(Boolean escofiable) {
        this.escofiable = escofiable;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", tipoProducto='" + tipoProducto + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", escofiable=" + escofiable +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }}

