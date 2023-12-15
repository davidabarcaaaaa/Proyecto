package aplicacion;

import dominio.Carta;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManejadorCSV {

    public void guardarCartasCSV(List<Carta> cartas, String rutaArchivo) throws IOException {
        try (PrintWriter pw = new PrintWriter(new File(rutaArchivo))) {
            for (Carta carta : cartas) {
                pw.println(carta.toCSV());
            }
        }
    }

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
