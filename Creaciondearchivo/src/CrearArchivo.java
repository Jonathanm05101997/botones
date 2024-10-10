import javax.swing.*;
import java.io.File;
import java.io.IOException;


import java.io.File;

public class CrearArchivo {
    public static CrearArchivo main;

    public static void crearArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Archivo");

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            try {
                if (fileToSave.createNewFile()) {
                    System.out.println("Archivo creado exitosamente: " + fileToSave.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                System.err.println("Error al crear el Archivo: "+ e.getMessage());
            }
        }else {
            System.out.println("Operacion Cancelada por el usuario.");
        }


    }
}
