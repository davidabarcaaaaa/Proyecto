package aplicacion;

import dominio.Carta;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase ManejadorCSV se encarga de la gestión de cartas mediante archivos CSV.
 * Proporciona funcionalidades para guardar y cargar cartas en y desde un archivo CSV.
 */
public class ManejadorCSV {

    /**
     * Guarda una lista de cartas en un archivo CSV.
     *
     * @param cartas       La lista de cartas a guardar.
     * @param rutaArchivo  La ruta del archivo CSV donde se guardarán las cartas.
     * @throws IOException Si ocurre un error de entrada/salida al escribir en el archivo.
     */
    public void guardarCartasCSV(List<Carta> cartas, String rutaArchivo) throws IOException {
        try (PrintWriter pw = new PrintWriter(new File(rutaArchivo))) {
            for (Carta carta : cartas) {
                pw.println(carta.toCSV());
            }
        }
    }

    /**
     * Carga una lista de cartas desde un archivo CSV.
     *
     * @param rutaArchivo  La ruta del archivo CSV desde donde se cargarán las cartas.
     * @return             Una lista de cartas cargadas desde el archivo.
     * @throws IOException Si ocurre un error de entrada/salida al leer el archivo.
     */
    public List<Carta> cargarCartasDesdeCSV(String rutaArchivo) throws IOException {
        List<Carta> cartas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                Carta carta = Carta.fromCSV(line);
                cartas.add(carta);
            }
        }
        return cartas;
    }
}
