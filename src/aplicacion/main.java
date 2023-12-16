package aplicacion;

import aplicacion.*;
import presentacion.InterfazUsuario;
import dominio.*;

import java.io.IOException;
import java.util.List;

/**
 * Clase principal del programa de gestión de cartas.
 * Esta clase contiene el método main, punto de entrada de la aplicación.
 */
public class main {
    /**
     * El método main inicia la aplicación.
     * Carga las cartas desde un archivo CSV, permite la interacción del usuario a través de una interfaz
     * y finalmente guarda las cartas de vuelta en el archivo CSV.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        GestorCartas gestorCartas = new GestorCartas();

        ManejadorCSV manejadorCSV = new ManejadorCSV();

        // Ruta del archivo CSV donde se almacenan las cartas
        String rutaArchivo = "../cartas.csv";
        try {
            // Cargar cartas existentes desde el archivo CSV
            List<Carta> cartasCargadas = manejadorCSV.cargarCartasDesdeCSV(rutaArchivo);
            for (Carta carta : cartasCargadas) {
                gestorCartas.agregarCarta(carta);
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar las cartas desde el archivo CSV.");
        }

        // Creación y visualización de la interfaz de usuario
        InterfazUsuario interfazUsuario = new InterfazUsuario(gestorCartas);
        interfazUsuario.mostrarMenu();

        try {
            // Guardar las cartas en el archivo CSV
            manejadorCSV.guardarCartasCSV(gestorCartas.obtenerCartas(), rutaArchivo);
        } catch (IOException e) {
            System.out.println("No se pudo guardar las cartas en el archivo CSV.");
        }
    }
}
