/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistema;

import java.util.ArrayList;
import java.util.List;
import modelo.Bar;
import modelo.Categoria;
import modelo.Cliente;
import modelo.Cocina;
import modelo.Comun;
import modelo.DeLaCasa;
import modelo.Dispositivo;
import modelo.Frecuente;
import modelo.Gestor;
import modelo.Ingrediente;
import modelo.Insumo;
import modelo.Item;
import modelo.Preferencial;
import modelo.TipoCliente;
import modelo.UnidadProcesadora;
import servicios.Fachada;
import vista.VentanaInicio;

/**
 *
 * @author Gerónimo
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cargarDatos();
        new VentanaInicio().setVisible(true);
    }

    private static void cargarDatos() {
        Fachada fachada = Fachada.getInstancia();
        //Código generado por ChatGPT
        // CARGA DE DATOS INICIALES
// Ordenado de lo más primitivo a lo más complejo

// === Dispositivos ===
        Dispositivo d1 = new Dispositivo(1);
        Dispositivo d2 = new Dispositivo(2);
        Dispositivo d3 = new Dispositivo(3);
        Dispositivo d4 = new Dispositivo(4);
        Dispositivo d5 = new Dispositivo(5);
        Dispositivo d6 = new Dispositivo(6);
        Dispositivo d7 = new Dispositivo(7);
        Dispositivo d8 = new Dispositivo(8);
        Dispositivo d9 = new Dispositivo(9);
        Dispositivo d10 = new Dispositivo(10);

        fachada.agregar(d1);
        fachada.agregar(d2);
        fachada.agregar(d3);
        fachada.agregar(d4);
        fachada.agregar(d5);
        fachada.agregar(d6);
        fachada.agregar(d7);
        fachada.agregar(d8);
        fachada.agregar(d9);
        fachada.agregar(d10);

// === Insumos ===
        Insumo i1 = new Insumo("Pan", 100);
        Insumo i2 = new Insumo("Carne", 80);
        Insumo i3 = new Insumo("Lechuga", 60);
        Insumo i4 = new Insumo("Tomate", 70);
        Insumo i5 = new Insumo("Queso", 90);
        Insumo i6 = new Insumo("Papas", 120);
        Insumo i7 = new Insumo("Aceite", 150);
        Insumo i8 = new Insumo("Sal", 200);
        Insumo i9 = new Insumo("Pimienta", 50);
        Insumo i10 = new Insumo("Pollo", 75);
        Insumo i11 = new Insumo("Cebolla", 65);
        Insumo i12 = new Insumo("Arroz", 110);
        Insumo i13 = new Insumo("Fideos", 130);
        Insumo i14 = new Insumo("Salsa", 85);
        Insumo i15 = new Insumo("Azúcar", 95);
        Insumo i16 = new Insumo("Harina", 100);
        Insumo i17 = new Insumo("Huevos", 90);
        Insumo i18 = new Insumo("Leche", 70);
        Insumo i19 = new Insumo("Café", 60);
        Insumo i20 = new Insumo("Té", 60);
        Insumo i21 = new Insumo("Chocolate", 50);
        Insumo i22 = new Insumo("Vino tinto", 40);
        Insumo i23 = new Insumo("Vino blanco", 40);
        Insumo i24 = new Insumo("Gaseosa", 100);
        Insumo i25 = new Insumo("Agua", 100);
        Insumo i26 = new Insumo("Helado", 30);
        Insumo i27 = new Insumo("Frutilla", 45);
        Insumo i28 = new Insumo("Dulce de leche", 40);
        Insumo i29 = new Insumo("Pan de ajo", 50);
        Insumo i30 = new Insumo("Jamón", 55);
        Insumo i31 = new Insumo("Mozarella", 50);
        Insumo i32 = new Insumo("Masa de pizza", 100);
        Insumo i33 = new Insumo("Caramelo", 28);
        Insumo i34 = new Insumo("Crema", 200);

        fachada.agregar(i1);
        fachada.agregar(i2);
        fachada.agregar(i3);
        fachada.agregar(i4);
        fachada.agregar(i5);
        fachada.agregar(i6);
        fachada.agregar(i7);
        fachada.agregar(i8);
        fachada.agregar(i9);
        fachada.agregar(i10);
        fachada.agregar(i11);
        fachada.agregar(i12);
        fachada.agregar(i13);
        fachada.agregar(i14);
        fachada.agregar(i15);
        fachada.agregar(i16);
        fachada.agregar(i17);
        fachada.agregar(i18);
        fachada.agregar(i19);
        fachada.agregar(i20);
        fachada.agregar(i21);
        fachada.agregar(i22);
        fachada.agregar(i23);
        fachada.agregar(i24);
        fachada.agregar(i25);
        fachada.agregar(i26);
        fachada.agregar(i27);
        fachada.agregar(i28);
        fachada.agregar(i29);
        fachada.agregar(i30);
        fachada.agregar(i31);
        fachada.agregar(i32);
        fachada.agregar(i33);
        fachada.agregar(i34);

// === Categorías ===
        Categoria catEntradas = new Categoria("Entradas");
        Categoria catPlatos = new Categoria("Platos principales");
        Categoria catPostres = new Categoria("Postres");
        Categoria catBebidas = new Categoria("Bebidas");
        Categoria catVinos = new Categoria("Vinos");
        Categoria catCafes = new Categoria("Cafés");

        fachada.agregar(catEntradas);
        fachada.agregar(catPlatos);
        fachada.agregar(catPostres);
        fachada.agregar(catBebidas);
        fachada.agregar(catVinos);
        fachada.agregar(catCafes);

// A continuación se agregarán Items con ingredientes específicos para cada uno.
// === Ingredientes e Items ===
        List<Ingrediente> ingredientes1 = new ArrayList<>();
        ingredientes1.add(new Ingrediente(1, i1)); // Pan
        ingredientes1.add(new Ingrediente(1, i2)); // Carne
        ingredientes1.add(new Ingrediente(1, i4)); // Tomate
        Item item1 = new Item("Hamburguesa Clásica", 250, ingredientes1, new Cocina(), catPlatos);
        fachada.agregarItemACategoria(catPlatos, item1);

        List<Ingrediente> ingredientes2 = new ArrayList<>();
        ingredientes2.add(new Ingrediente(1, i6)); // Papas
        ingredientes2.add(new Ingrediente(1, i7)); // Aceite
        Item item2 = new Item("Papas Fritas", 150.0f, ingredientes2, new Cocina(), catEntradas);
        fachada.agregarItemACategoria(catEntradas, item2);

        List<Ingrediente> ingredientes3 = new ArrayList<>();
        ingredientes3.add(new Ingrediente(1, i21)); // Chocolate
        ingredientes3.add(new Ingrediente(1, i18)); // Leche
        Item item3 = new Item("Chocolate Caliente", 120.0f, ingredientes3, new Bar(), catCafes);
        fachada.agregarItemACategoria(catCafes, item3);

        List<Ingrediente> ingredientes4 = new ArrayList<>();
        ingredientes4.add(new Ingrediente(1, i26)); // Helado
        ingredientes4.add(new Ingrediente(1, i27)); // Frutilla
        Item item4 = new Item("Copa Helada de Frutilla", 180.0f, ingredientes4, new Cocina(), catPostres);
        fachada.agregarItemACategoria(catPostres, item4);

        List<Ingrediente> ingredientes5 = new ArrayList<>();
        ingredientes5.add(new Ingrediente(1, i22)); // Vino tinto
        Item item5 = new Item("Vino Tinto Reserva", 320.0f, ingredientes5, new Bar(), catVinos);
        fachada.agregarItemACategoria(catVinos, item5);

        List<Ingrediente> ingredientes6 = new ArrayList<>();
        ingredientes6.add(new Ingrediente(1, i24)); // Gaseosa
        Item item6 = new Item("Gaseosa Cola", 100.0f, ingredientes6, new Bar(), catBebidas);
        fachada.agregarItemACategoria(catBebidas, item6);

        List<Ingrediente> ingredientes7 = new ArrayList<>();
        ingredientes7.add(new Ingrediente(1, i3)); // Lechuga
        ingredientes7.add(new Ingrediente(1, i4)); // Tomate
        ingredientes7.add(new Ingrediente(1, i5)); // Queso
        Item item7 = new Item("Ensalada Fresca", 160.0f, ingredientes7, new Cocina(), catEntradas);
        fachada.agregarItemACategoria(catEntradas, item7);

        List<Ingrediente> ingredientes8 = new ArrayList<>();
        ingredientes8.add(new Ingrediente(1, i12)); // Arroz
        ingredientes8.add(new Ingrediente(1, i10)); // Pollo
        Item item8 = new Item("Arroz con Pollo", 280.0f, ingredientes8, new Cocina(), catPlatos);
        fachada.agregarItemACategoria(catPlatos, item8);

        List<Ingrediente> ingredientes9 = new ArrayList<>();
        ingredientes9.add(new Ingrediente(1, i19)); // Café
        Item item9 = new Item("Café Solo", 90.0f, ingredientes9, new Bar(), catCafes);
        fachada.agregarItemACategoria(catCafes, item9);

        List<Ingrediente> ingredientes10 = new ArrayList<>();
        ingredientes10.add(new Ingrediente(1, i28)); // Dulce de leche
        ingredientes10.add(new Ingrediente(1, i16)); // Harina
        Item item10 = new Item("Panqueque de Dulce de Leche", 210.0f, ingredientes10, new Cocina(), catPostres);
        fachada.agregarItemACategoria(catPostres, item10);

// ... Items del 1 al 10 previos ... (ya presentes)
        List<Ingrediente> ingredientes11 = new ArrayList<>();
        ingredientes11.add(new Ingrediente(1, i30)); // Jamón
        ingredientes11.add(new Ingrediente(1, i31)); // Mozzarella
        Item item11 = new Item("Tostado de Jamón y Queso", 200.0f, ingredientes11, new Cocina(), catEntradas);
        fachada.agregarItemACategoria(catEntradas, item11);

        List<Ingrediente> ingredientes12 = new ArrayList<>();
        ingredientes12.add(new Ingrediente(1, i32)); // Masa de pizza
        ingredientes12.add(new Ingrediente(1, i31)); // Mozzarella
        ingredientes12.add(new Ingrediente(1, i14)); // Salsa
        Item item12 = new Item("Pizza Margarita", 300.0f, ingredientes12, new Cocina(), catPlatos);
        fachada.agregarItemACategoria(catPlatos, item12);

        List<Ingrediente> ingredientes13 = new ArrayList<>();
        ingredientes13.add(new Ingrediente(1, i33)); // Caramelo
        ingredientes13.add(new Ingrediente(1, i26)); // Helado
        Item item13 = new Item("Helado con Caramelo", 160.0f, ingredientes13, new Cocina(), catPostres);
        fachada.agregarItemACategoria(catPostres, item13);

        List<Ingrediente> ingredientes14 = new ArrayList<>();
        ingredientes14.add(new Ingrediente(1, i25)); // Agua
        Item item14 = new Item("Agua Mineral", 70.0f, ingredientes14, new Bar(), catBebidas);
        fachada.agregarItemACategoria(catBebidas, item14);

        List<Ingrediente> ingredientes15 = new ArrayList<>();
        ingredientes15.add(new Ingrediente(1, i23)); // Vino blanco
        Item item15 = new Item("Vino Blanco Chardonnay", 330.0f, ingredientes15, new Bar(), catVinos);
        fachada.agregarItemACategoria(catVinos, item15);

        List<Ingrediente> ingredientes16 = new ArrayList<>();
        ingredientes16.add(new Ingrediente(1, i20)); // Té
        ingredientes16.add(new Ingrediente(1, i18)); // Leche
        Item item16 = new Item("Té con Leche", 100.0f, ingredientes16, new Bar(), catCafes);
        fachada.agregarItemACategoria(catCafes, item16);

        List<Ingrediente> ingredientes17 = new ArrayList<>();
        ingredientes17.add(new Ingrediente(1, i13)); // Fideos
        ingredientes17.add(new Ingrediente(1, i14)); // Salsa
        Item item17 = new Item("Fideos con Salsa", 260.0f, ingredientes17, new Cocina(), catPlatos);
        fachada.agregarItemACategoria(catPlatos, item17);

        List<Ingrediente> ingredientes18 = new ArrayList<>();
        ingredientes18.add(new Ingrediente(1, i1)); // Pan
        ingredientes18.add(new Ingrediente(1, i29)); // Pan de ajo
        Item item18 = new Item("Pan de Ajo", 120.0f, ingredientes18, new Cocina(), catEntradas);
        fachada.agregarItemACategoria(catEntradas, item18);

        List<Ingrediente> ingredientes19 = new ArrayList<>();
        ingredientes19.add(new Ingrediente(1, i34)); // Crema
        ingredientes19.add(new Ingrediente(1, i27)); // Frutilla
        Item item19 = new Item("Frutillas con Crema", 190.0f, ingredientes19, new Cocina(), catPostres);
        fachada.agregarItemACategoria(catPostres, item19);

        List<Ingrediente> ingredientes20 = new ArrayList<>();
        ingredientes20.add(new Ingrediente(1, i8)); // Sal
        ingredientes20.add(new Ingrediente(1, i9)); // Pimienta
        Item item20 = new Item("Sal y Pimienta", 50.0f, ingredientes20, new Cocina(), catEntradas);
        fachada.agregarItemACategoria(catEntradas, item20);

// === Clientes ===
        String[] nombresClientes = {
            "Marcos Olivera", "Lucía Fernández", "Juan Pérez", "Camila Torres", "Diego Rodríguez",
            "Ana Martínez", "Pedro Gómez", "Valentina Ruiz", "Carlos Sánchez", "Florencia López",
            "Martín Castro", "Sofía Silva", "Gonzalo Méndez", "Julieta Ríos", "Andrés Vega",
            "Paula Cabrera", "Agustín Leal", "Mariana Duarte", "Rodrigo Acosta", "Laura Sosa",
            "Federico Ramos", "Daniela Paredes", "Sebastián Lima", "Micaela Pereyra", "Joaquín Nieto",
            "Natalia Fonseca", "Matías Olivera", "Rocío Barreto", "Hernán Viera", "Isabela Núñez"
        };

        for (int i = 0; i < nombresClientes.length; i++) {
            String nombre = nombresClientes[i];
            int id = i + 1;
            Cliente c = new Cliente(null, nombre, id, "pass" + id); // TipoCliente null por ahora

            TipoCliente tipo = switch (i % 4) {
                case 0 ->
                    new Comun(c);
                case 1 ->
                    new Frecuente(c);
                case 2 ->
                    new Preferencial(c);
                default ->
                    new DeLaCasa(c);
            };

            c.setTipoCliente(tipo); // Asignás el tipo ahora
            fachada.agregar(c);
        }

// === Gestores ===
        UnidadProcesadora[] unidades = {new Cocina(), new Bar()};
        String[] nombresGestores = {
            "Mario López", "Elena Díaz", "Tomás Cabrera", "Luciana Pérez", "Bruno Silva",
            "Clara Iglesias", "Julián Torres", "Marta Bianchi", "Esteban Varela", "Nadia Jiménez",
            "Ramiro Costa", "Viviana Reyes", "Damián Soto", "Emilia Cardozo", "Facundo Morales",
            "Gabriela Vidal", "Lautaro Britos", "Verónica Blanco", "Ezequiel Alonso", "Silvana Domínguez"
        };

        for (int i = 0; i < nombresGestores.length; i++) {
            UnidadProcesadora unidad = unidades[i % unidades.length];
            Gestor g = new Gestor("gestor" + (i + 1), "pass" + (i + 1), nombresGestores[i], unidad);
            fachada.agregar(g);
        }

    }

}
