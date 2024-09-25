package org.example;
import org.example.Ayudas.Proveedor;
import org.example.Ayudas.Repartidor;
import org.example.Modelos.Cliente;
import org.example.Modelos.Flor;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {



                // Crear listas dinámicas para manejar los objetos
                ArrayList<Flor> listaFlores = new ArrayList<>();
                ArrayList<Cliente> listaClientes = new ArrayList<>();
                ArrayList<Repartidor> listaRepartidores = new ArrayList<>();
                ArrayList<Proveedor> listaProveedores = new ArrayList<>();


                listaFlores.add(new Flor(1, "Rosa", 50, 10, "Rojo", "Radial", "Dulce", "Ninguna", "Abierto", 5000.0));

                listaClientes.add(new Cliente(1, "Ede", "Hamon", 46, 123455, "ede@hamom.com", "Toncacipa", "Sura", LocalDate.of(1978, 5, 2), 1500000L));

                listaRepartidores.add(new Repartidor(1, "Juanjose", 1234567, true, 80, true, true, true, true, true));

                listaProveedores.add(new Proveedor(1, "ExpoFlor", "Calle Cundinamarca", 1234567, "proveedor@example.com", "Flores", "Transferencia", true, "Colombia", 4.8));


                System.out.println("Lista de Flores:");
                for (Flor flor : listaFlores) {
                    flor.imprimirDatos();
                }


                System.out.println("\nLista de Clientes:");
                for (Cliente cliente : listaClientes) {
                    cliente.imprimirDatos();
                }


                System.out.println("\nLista de Repartidores:");
                for (Repartidor repartidor : listaRepartidores) {
                    repartidor.imprimirDatos();
                }

                System.out.println("\nLista de Proveedores:");
                for (Proveedor proveedor : listaProveedores) {
                    proveedor.imprimirDatos();
                }
            }
        }


