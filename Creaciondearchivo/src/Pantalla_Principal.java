import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Pantalla_Principal {

    public void pantalla() {
        JFrame frame = new JFrame("Mi Ventana");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Establecer el layout a null para usar setBounds
        frame.setVisible(true);

        JLabel label = new JLabel("");
        label.setBounds(10, 10, 100, 30); // Ajustar tamaño del JLabel
        frame.add(label);

        JButton boton = new JButton("Cargar Archivo");
        boton.setBounds(50, 50, 150, 50); // Ajustar tamaño y posición del botón
        frame.add(boton);

        // Añadir ActionListener al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                CrearArchivo.crearArchivo();
                label.setText("¡Botón presionado!");
            }
        });

        // Hacer visible el JFrame
        frame.setVisible(true);
    }

}
