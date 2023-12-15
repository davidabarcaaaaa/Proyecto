// En el archivo InterfazUsuario.java
package presentacion;

import aplicacion.AdministradorDeCartas;
import java.util.Scanner;

public class InterfazUsuario {
    private AdministradorDeCartas adminCartas;
    private Scanner scanner;

    public InterfazUsuario() {
        adminCartas = new AdministradorDeCartas();
        scanner = new Scanner(System.in);
    }

    // Métodos para interactuar con el usuario
}
