package dominio;

import java.io.Serializable;

/**
 * Clase CartaBronce, que extiende de la clase Carta y representa una carta de bronce.
 * Implementa Serializable para permitir su serialización.
 */
public class CartaBronce extends Carta implements Serializable {

    /**
     * Constructor para crear una nueva carta de bronce.
     * Cada atributo está limitado entre 1 y 30.
     *
     * @param tiro      Puntuación de tiro de la carta (entre 1 y 30).
     * @param pase      Puntuación de pase de la carta (entre 1 y 30).
     * @param fisico    Puntuación física de la carta (entre 1 y 30).
     * @param velocidad Puntuación de velocidad de la carta (entre 1 y 30).
     * @param defensa   Puntuación de defensa de la carta (entre 1 y 30).
     * @param regate    Puntuación de regate de la carta (entre 1 y 30).
     */
    public CartaBronce(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro, 1), 30),
                Math.min(Math.max(pase, 1), 30),
                Math.min(Math.max(fisico, 1), 30),
                Math.min(Math.max(velocidad, 1), 30),
                Math.min(Math.max(defensa, 1), 30),
                Math.min(Math.max(regate, 1), 30));
    }

    /**
     * Convierte el objeto CartaBronce a una cadena en formato CSV.
     * @return Cadena que representa la carta de bronce en formato CSV.
     */
    @Override
    public String toCSV() {
        return "Bronce," + super.toCSV();
    }

    /**
     * Genera una representación en cadena de la carta de bronce.
     * @return Cadena que representa la carta de bronce.
     */
    @Override
    public String toString() {
        return "CartaBronce{" +
                "tiro=" + getTiro() +
                ", pase=" + getPase() +
                ", fisico=" + getFisico() +
                ", velocidad=" + getVelocidad() +
                ", defensa=" + getDefensa() +
                ", regate=" + getRegate() +
                '}';
    }

    /**
     * Crea una instancia de CartaBronce a partir de una cadena en formato CSV.
     * @param csvLine La línea CSV que representa la carta de bronce.
     * @return Una instancia de CartaBronce basada en los datos de la línea CSV.
     */
    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new CartaBronce(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}
