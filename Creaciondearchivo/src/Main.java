import com.formdev.flatlaf.FlatDarculaLaf;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;




public class Main {
    public static void main(String[] args) {

        Pantalla_Principal ventana_principal = new Pantalla_Principal();
        FlatDarculaLaf.setup();
        ventana_principal.pantalla();
        //CrearArchivo.crearArchivo();


    }
}
