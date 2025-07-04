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
import modelo.TipoAlimento;
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
        Insumo i1 = new Insumo("Pan", 60);                // unidades (2 por hamburguesa)
        Insumo i2 = new Insumo("Carne", 400);            // gramos (150 g por hamburguesa)
        Insumo i3 = new Insumo("Lechuga", 900);           // gramos (30 g por ensalada)
        Insumo i4 = new Insumo("Tomate", 1200);           // gramos (40 g por uso aprox)
        Insumo i5 = new Insumo("Queso", 600);             // gramos (20–30 g por porción)
        Insumo i6 = new Insumo("Papas", 4000);            // gramos (200 g por papas fritas)
        Insumo i7 = new Insumo("Aceite", 1500);           // ml (50 ml por uso)
        Insumo i8 = new Insumo("Sal", 300);               // gramos (muy poco uso)
        Insumo i9 = new Insumo("Pimienta", 100);          // gramos (uso mínimo)
        Insumo i10 = new Insumo("Pollo", 2400);           // gramos (120 g por plato)
        Insumo i11 = new Insumo("Cebolla", 1500);         // gramos (uso general)
        Insumo i12 = new Insumo("Arroz", 3000);           // gramos (150 g por uso)
        Insumo i13 = new Insumo("Fideos", 3000);          // gramos (120–130 g por plato)
        Insumo i14 = new Insumo("Salsa", 1500);           // gramos (50–60 g por plato)
        Insumo i15 = new Insumo("Azúcar", 2000);          // gramos (general para postres)
        Insumo i16 = new Insumo("Harina", 3000);          // gramos (100 g por panqueque)
        Insumo i17 = new Insumo("Huevos", 50);            // unidades (1 porción ≈ 1 huevo)
        Insumo i18 = new Insumo("Leche", 3000);           // ml (150–200 ml por uso)
        Insumo i19 = new Insumo("Café", 500);             // gramos (10 g por café)
        Insumo i20 = new Insumo("Té", 200);               // gramos (5 g por té)
        Insumo i21 = new Insumo("Chocolate", 500);        // gramos (25 g por taza)
        Insumo i22 = new Insumo("Vino tinto", 3000);      // ml (150 ml por copa)
        Insumo i23 = new Insumo("Vino blanco", 3000);     // ml (150 ml por copa)
        Insumo i24 = new Insumo("Gaseosa", 5000);         // ml (250 ml por vaso)
        Insumo i25 = new Insumo("Agua", 5000);            // ml (500 ml por botella)
        Insumo i26 = new Insumo("Helado", 1500);          // gramos (100 g por copa)
        Insumo i27 = new Insumo("Frutilla", 1200);        // gramos (50–60 g por postre)
        Insumo i28 = new Insumo("Dulce de leche", 1000);  // gramos (50 g por postre)
        Insumo i29 = new Insumo("Pan de ajo", 40);        // unidades
        Insumo i30 = new Insumo("Jamón", 1000);           // gramos (50 g por tostado)
        Insumo i31 = new Insumo("Mozarella", 1500);       // gramos (60–80 g por pizza o tostado)
        Insumo i32 = new Insumo("Masa de pizza", 30);     // unidades (1 por pizza)
        Insumo i33 = new Insumo("Caramelo", 400);         // gramos (30 g por postre)
        Insumo i34 = new Insumo("Crema", 1500);           // gramos (70 g por postre)

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
        ingredientes1.add(new Ingrediente(2, i1)); // Pan (2 unidades)
        ingredientes1.add(new Ingrediente(150, i2)); // Carne (150 g)
        ingredientes1.add(new Ingrediente(40, i4)); // Tomate (40 g)
        Item item1 = new Item("Hamburguesa Clásica", 250, ingredientes1, new Cocina(), catPlatos, TipoAlimento.Plato_Principal);
        fachada.agregarItemACategoria(catPlatos, item1);

        List<Ingrediente> ingredientes2 = new ArrayList<>();
        ingredientes2.add(new Ingrediente(200, i6)); // Papas (200 g)
        ingredientes2.add(new Ingrediente(50, i7)); // Aceite (50 ml)
        ingredientes2.add(new Ingrediente(100, i8)); // Sal (100 g)
        Item item2 = new Item("Papas Fritas", 150.0f, ingredientes2, new Cocina(), catEntradas, TipoAlimento.Entrada);
        fachada.agregarItemACategoria(catEntradas, item2);

        List<Ingrediente> ingredientes3 = new ArrayList<>();
        ingredientes3.add(new Ingrediente(25, i21)); // Chocolate (25 g)
        ingredientes3.add(new Ingrediente(200, i18)); // Leche (200 ml)
        Item item3 = new Item("Chocolate Caliente", 120.0f, ingredientes3, new Bar(), catCafes, TipoAlimento.Café);
        fachada.agregarItemACategoria(catCafes, item3);

        List<Ingrediente> ingredientes4 = new ArrayList<>();
        ingredientes4.add(new Ingrediente(100, i26)); // Helado (100 g)
        ingredientes4.add(new Ingrediente(50, i27)); // Frutilla (50 g)
        Item item4 = new Item("Copa Helada de Frutilla", 180.0f, ingredientes4, new Cocina(), catPostres, TipoAlimento.Postre);
        fachada.agregarItemACategoria(catPostres, item4);

        List<Ingrediente> ingredientes5 = new ArrayList<>();
        ingredientes5.add(new Ingrediente(150, i22)); // Vino tinto (150 ml)
        Item item5 = new Item("Vino Tinto Reserva", 320.0f, ingredientes5, new Bar(), catVinos, TipoAlimento.Vino);
        fachada.agregarItemACategoria(catVinos, item5);

        List<Ingrediente> ingredientes6 = new ArrayList<>();
        ingredientes6.add(new Ingrediente(250, i24)); // Gaseosa (250 ml)
        Item item6 = new Item("Gaseosa Cola", 100.0f, ingredientes6, new Bar(), catBebidas, TipoAlimento.Refresco);
        fachada.agregarItemACategoria(catBebidas, item6);

        List<Ingrediente> ingredientes7 = new ArrayList<>();
        ingredientes7.add(new Ingrediente(30, i3)); // Lechuga (30 g)
        ingredientes7.add(new Ingrediente(40, i4)); // Tomate (40 g)
        ingredientes7.add(new Ingrediente(20, i5)); // Queso (20 g)
        Item item7 = new Item("Ensalada Fresca", 160.0f, ingredientes7, new Cocina(), catEntradas, TipoAlimento.Entrada);
        fachada.agregarItemACategoria(catEntradas, item7);

        List<Ingrediente> ingredientes8 = new ArrayList<>();
        ingredientes8.add(new Ingrediente(150, i12)); // Arroz (150 g)
        ingredientes8.add(new Ingrediente(120, i10)); // Pollo (120 g)
        Item item8 = new Item("Arroz con Pollo", 280.0f, ingredientes8, new Cocina(), catPlatos, TipoAlimento.Plato_Principal);
        fachada.agregarItemACategoria(catPlatos, item8);

        List<Ingrediente> ingredientes9 = new ArrayList<>();
        ingredientes9.add(new Ingrediente(10, i19)); // Café (10 g)
        Item item9 = new Item("Café Solo", 90.0f, ingredientes9, new Bar(), catCafes, TipoAlimento.Café);
        fachada.agregarItemACategoria(catCafes, item9);

        List<Ingrediente> ingredientes10 = new ArrayList<>();
        ingredientes10.add(new Ingrediente(50, i28)); // Dulce de leche (50 g)
        ingredientes10.add(new Ingrediente(100, i16)); // Harina (100 g)
        Item item10 = new Item("Panqueque de Dulce de Leche", 210.0f, ingredientes10, new Cocina(), catPostres, TipoAlimento.Postre);
        fachada.agregarItemACategoria(catPostres, item10);

// ... Items del 1 al 10 previos ... (ya presentes)
        List<Ingrediente> ingredientes11 = new ArrayList<>();
        ingredientes11.add(new Ingrediente(50, i30)); // Jamón (50 g)
        ingredientes11.add(new Ingrediente(60, i31)); // Mozzarella (60 g)
        Item item11 = new Item("Tostado de Jamón y Queso", 200.0f, ingredientes11, new Cocina(), catEntradas, TipoAlimento.Entrada);
        fachada.agregarItemACategoria(catEntradas, item11);

        List<Ingrediente> ingredientes12 = new ArrayList<>();
        ingredientes12.add(new Ingrediente(1, i32)); // Masa de pizza (1 unidad)
        ingredientes12.add(new Ingrediente(80, i31)); // Mozzarella (80 g)
        ingredientes12.add(new Ingrediente(50, i14)); // Salsa (50 g)
        Item item12 = new Item("Pizza Margarita", 300.0f, ingredientes12, new Cocina(), catPlatos, TipoAlimento.Plato_Principal);
        fachada.agregarItemACategoria(catPlatos, item12);

        List<Ingrediente> ingredientes13 = new ArrayList<>();
        ingredientes13.add(new Ingrediente(30, i33)); // Caramelo (30 g)
        ingredientes13.add(new Ingrediente(100, i26)); // Helado (100 g)
        Item item13 = new Item("Helado con Caramelo", 160.0f, ingredientes13, new Cocina(), catPostres, TipoAlimento.Postre);
        fachada.agregarItemACategoria(catPostres, item13);

        List<Ingrediente> ingredientes14 = new ArrayList<>();
        ingredientes14.add(new Ingrediente(500, i25)); // Agua (500 ml)
        Item item14 = new Item("Agua Mineral", 70.0f, ingredientes14, new Bar(), catBebidas, TipoAlimento.Agua);
        fachada.agregarItemACategoria(catBebidas, item14);

        List<Ingrediente> ingredientes15 = new ArrayList<>();
        ingredientes15.add(new Ingrediente(150, i23)); // Vino blanco (150 ml)
        Item item15 = new Item("Vino Blanco Chardonnay", 330.0f, ingredientes15, new Bar(), catVinos, TipoAlimento.Vino);
        fachada.agregarItemACategoria(catVinos, item15);

        List<Ingrediente> ingredientes16 = new ArrayList<>();
        ingredientes16.add(new Ingrediente(5, i20)); // Té (5 g)
        ingredientes16.add(new Ingrediente(150, i18)); // Leche (150 ml)
        Item item16 = new Item("Té con Leche", 100.0f, ingredientes16, new Bar(), catCafes, TipoAlimento.Café);
        fachada.agregarItemACategoria(catCafes, item16);

        List<Ingrediente> ingredientes17 = new ArrayList<>();
        ingredientes17.add(new Ingrediente(120, i13)); // Fideos (120 g)
        ingredientes17.add(new Ingrediente(60, i14)); // Salsa (60 g)
        Item item17 = new Item("Fideos con Salsa", 260.0f, ingredientes17, new Cocina(), catPlatos, TipoAlimento.Plato_Principal);
        fachada.agregarItemACategoria(catPlatos, item17);

        List<Ingrediente> ingredientes18 = new ArrayList<>();
        ingredientes18.add(new Ingrediente(1, i1)); // Pan (1 unidad)
        ingredientes18.add(new Ingrediente(1, i29)); // Pan de ajo (1 unidad)
        Item item18 = new Item("Pan de Ajo", 120.0f, ingredientes18, new Cocina(), catEntradas, TipoAlimento.Entrada);
        fachada.agregarItemACategoria(catEntradas, item18);

        List<Ingrediente> ingredientes19 = new ArrayList<>();
        ingredientes19.add(new Ingrediente(70, i34)); // Crema (70 g)
        ingredientes19.add(new Ingrediente(60, i27)); // Frutilla (60 g)
        Item item19 = new Item("Frutillas con Crema", 190.0f, ingredientes19, new Cocina(), catPostres, TipoAlimento.Postre);
        fachada.agregarItemACategoria(catPostres, item19);

        List<Ingrediente> ingredientes20 = new ArrayList<>();
        ingredientes20.add(new Ingrediente(2, i8)); // Sal (2 g)
        ingredientes20.add(new Ingrediente(1, i9)); // Pimienta (1 g)
        Item item20 = new Item("Sal y pimienta", 50.0f, ingredientes20, new Cocina(), catEntradas, TipoAlimento.Entrada);
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
