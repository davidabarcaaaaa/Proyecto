package dominio;

import java.io.Serializable;

public class CartaBronce extends Carta implements Serializable {
    public CartaBronce(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro, 1), 30),
                Math.min(Math.max(pase, 1), 30),
                Math.min(Math.max(fisico, 1), 30),
                Math.min(Math.max(velocidad, 1), 30),
                Math.min(Math.max(defensa, 1), 30),
                Math.min(Math.max(regate, 1), 30));
    }

    @Override
    public String toCSV() {
        return "Bronce," + super.toCSV();
    }

    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new CartaBronce(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}

