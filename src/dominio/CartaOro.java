package dominio;

import java.io.Serializable;

/**
 * Clase CartaOro, que extiende de la clase Carta y representa una carta de oro.
 * Implementa Serializable para permitir su serialización.
 */
public class CartaOro extends Carta implements Serializable {

    /**
     * Constructor para crear una nueva carta de oro.
     * Cada atributo está limitado entre 71 y 90.
     *
     * @param tiro      Puntuación de tiro de la carta (entre 71 y 90).
     * @param pase      Puntuación de pase de la carta (entre 71 y 90).
     * @param fisico    Puntuación física de la carta (entre 71 y 90).
     * @param velocidad Puntuación de velocidad de la carta (entre 71 y 90).
     * @param defensa   Puntuación de defensa de la carta (entre 71 y 90).
     * @param regate    Puntuación de regate de la carta (entre 71 y 90).
     */
    public CartaOro(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro, 71), 90),
                Math.min(Math.max(pase, 71), 90),
                Math.min(Math.max(fisico, 71), 90),
                Math.min(Math.max(velocidad, 71), 90),
                Math.min(Math.max(defensa, 71), 90),
                Math.min(Math.max(regate, 71), 90));
    }

    /**
     * Convierte el objeto CartaOro a una cadena en formato CSV.
     * @return Cadena que representa la carta de oro en formato CSV.
     */
    @Override
    public String toCSV() {
        return "Oro," + super.toCSV();
    }

    /**
     * Genera una representación en cadena de la carta de oro.
     * @return Cadena que representa la carta de oro.
     */
    @Override
    public String toString() {
        return "CartaOro{" +
                "tiro=" + getTiro() +
                ", pase=" + getPase() +
                ", fisico=" + getFisico() +
                ", velocidad=" + getVelocidad() +
                ", defensa=" + getDefensa() +
                ", regate=" + getRegate() +
                '}';
    }

    /**
     * Crea una instancia de CartaOro a partir de una cadena en formato CSV.
     * @param csvLine La línea CSV que representa la carta de oro.
     * @return Una instancia de CartaOro basada en los datos de la línea CSV.
     */
    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new CartaOro(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}
