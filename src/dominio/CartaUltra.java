package dominio;

import java.io.Serializable;

/**
 * Clase CartaUltra, que extiende de la clase Carta y representa una carta ultra.
 * Implementa Serializable para permitir su serialización.
 */
public class CartaUltra extends Carta implements Serializable {

    /**
     * Constructor para crear una nueva carta ultra.
     * Cada atributo está limitado entre 91 y 99.
     *
     * @param tiro      Puntuación de tiro de la carta (entre 91 y 99).
     * @param pase      Puntuación de pase de la carta (entre 91 y 99).
     * @param fisico    Puntuación física de la carta (entre 91 y 99).
     * @param velocidad Puntuación de velocidad de la carta (entre 91 y 99).
     * @param defensa   Puntuación de defensa de la carta (entre 91 y 99).
     * @param regate    Puntuación de regate de la carta (entre 91 y 99).
     */
    public CartaUltra(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro, 91), 99),
                Math.min(Math.max(pase, 91), 99),
                Math.min(Math.max(fisico, 91), 99),
                Math.min(Math.max(velocidad, 91), 99),
                Math.min(Math.max(defensa, 91), 99),
                Math.min(Math.max(regate, 91), 99));
    }

    /**
     * Convierte el objeto CartaUltra a una cadena en formato CSV.
     * @return Cadena que representa la carta ultra en formato CSV.
     */
    @Override
    public String toCSV() {
        return "Ultra," + super.toCSV();
    }

    /**
     * Genera una representación en cadena de la carta ultra.
     * @return Cadena que representa la carta ultra.
     */
    @Override
    public String toString() {
        return "CartaUltra{" +
                "tiro=" + getTiro() +
                ", pase=" + getPase() +
                ", fisico=" + getFisico() +
                ", velocidad=" + getVelocidad() +
                ", defensa=" + getDefensa() +
                ", regate=" + getRegate() +
                '}';
    }

    /**
     * Crea una instancia de CartaUltra a partir de una cadena en formato CSV.
     * @param csvLine La línea CSV que representa la carta ultra.
     * @return Una instancia de CartaUltra basada en los datos de la línea CSV.
     */
    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new CartaUltra(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}
