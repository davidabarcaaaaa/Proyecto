package dominio;

import java.io.Serializable;

public class CartaOro extends Carta implements Serializable {
    public CartaOro(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro,71), 90),
                Math.min(Math.max(pase, 71), 90),
                Math.min(Math.max(fisico, 71), 90),
                Math.min(Math.max(velocidad, 71), 90),
                Math.min(Math.max(defensa, 71), 90),
                Math.min(Math.max(regate, 71), 90));
    }
    @Override
    public String toCSV() {
        return "Oro," + super.toCSV();
    }

    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new CartaOro(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}