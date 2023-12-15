package aplicacion;

import aplicacion.*;
import presentacion.InterfazUsuario;
import dominio.*;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) {
        GestorCartas gestorCartas = new GestorCartas();

        ManejadorCSV manejadorCSV = new ManejadorCSV();


        String rutaArchivo = "../cartas.csv";
        try {
            List<Carta> cartasCargadas = manejadorCSV.cargarCartasDesdeCSV(rutaArchivo);
            for (Carta carta : cartasCargadas) {
                gestorCartas.agregarCarta(carta);
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar las cartas desde el archivo CSV.");
        }

        InterfazUsuario interfazUsuario = new InterfazUsuario(gestorCartas);


        interfazUsuario.mostrarMenu();

        try {
            manejadorCSV.guardarCartasCSV(gestorCartas.obtenerCartas(), rutaArchivo);
        } catch (IOException e) {
            System.out.println("No se pudo guardar las cartas en el archivo CSV.");
        }
    }
}