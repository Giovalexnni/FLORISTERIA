package org.example;
import org.example.Ayudas.Proveedor;
import org.example.Ayudas.Repartidor;
import org.example.Modelos.Cliente;
import org.example.Modelos.Flor;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {





                Flor FlorUno=new Flor();
                Flor FlorDos=(new Flor(1, "Rosa", 50, 10, "Rojo", "Radial", "Dulce", "Ninguna", "Abierto", 5000.0));

                Cliente clienteUno=new Cliente();
               Cliente ClienteDos=(new Cliente(1, "Ede", "Hamon", 46, 123455, "ede@hamom.com", "Toncacipa", "Sura", LocalDate.of(1978, 5, 2), 1500000L));

               Repartidor RepartidorDos=new Repartidor();
               Repartidor RepartidoDos=new Repartidor(1, "Juanjose", 1234567, true, 80, true, true, true, true, true);


                Proveedor PorveedorUno=new Proveedor();
               Proveedor ProveedorDos=new Proveedor(1, "ExpoFlor", "Calle Cundinamarca", 1234567, "proveedor@example.com", "Flores", "Transferencia", true, "Colombia", 4.8);








        System.out.println("ID: " + FlorDos.getId());
        System.out.println("Nombre: " + FlorDos.getNombre());
        System.out.println("Pétalos: " + FlorDos.getPetalos());
        System.out.println("Hojas: " + FlorDos.getHojas());
        System.out.println("Color: " + FlorDos.getColor());
        System.out.println("Simetría de Forma: " + FlorDos.getSimetriaForma());
        System.out.println("Fragancia: " + FlorDos.getFragancia());
        System.out.println("Enfermedades: " + FlorDos.getEnfermedades());
        System.out.println("Botón: " + FlorDos.getBoton());
        System.out.println("Precio: " + FlorDos.getPrecio());

            }
        }


