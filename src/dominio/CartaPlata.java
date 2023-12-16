package dominio;

import java.io.Serializable;

/**
 * Clase CartaPlata, que extiende de la clase Carta y representa una carta de plata.
 * Implementa Serializable para permitir su serialización.
 */
public class CartaPlata extends Carta implements Serializable {

    /**
     * Constructor para crear una nueva carta de plata.
     * Cada atributo está limitado entre 31 y 70.
     *
     * @param tiro      Puntuación de tiro de la carta (entre 31 y 70).
     * @param pase      Puntuación de pase de la carta (entre 31 y 70).
     * @param fisico    Puntuación física de la carta (entre 31 y 70).
     * @param velocidad Puntuación de velocidad de la carta (entre 31 y 70).
     * @param defensa   Puntuación de defensa de la carta (entre 31 y 70).
     * @param regate    Puntuación de regate de la carta (entre 31 y 70).
     */
    public CartaPlata(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro, 31), 70),
                Math.min(Math.max(pase, 31), 70),
                Math.min(Math.max(fisico, 31), 70),
                Math.min(Math.max(velocidad, 31), 70),
                Math.min(Math.max(defensa, 31), 70),
                Math.min(Math.max(regate, 31), 70));
    }

    /**
     * Convierte el objeto CartaPlata a una cadena en formato CSV.
     * @return Cadena que representa la carta de plata en formato CSV.
     */
    @Override
    public String toCSV() {
        return "Plata," + super.toCSV();
    }

    /**
     * Genera una representación en cadena de la carta de plata.
     * @return Cadena que representa la carta de plata.
     */
    @Override
    public String toString() {
        return "CartaPlata{" +
                "tiro=" + getTiro() +
                ", pase=" + getPase() +
                ", fisico=" + getFisico() +
                ", velocidad=" + getVelocidad() +
                ", defensa=" + getDefensa() +
                ", regate=" + getRegate() +
                '}';
    }

    /**
     * Crea una instancia de CartaPlata a partir de una cadena en formato CSV.
     * @param csvLine La línea CSV que representa la carta de plata.
     * @return Una instancia de CartaPlata basada en los datos de la línea CSV.
     */
    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new CartaPlata(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}
