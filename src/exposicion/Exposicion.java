/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author David
 */
public class Exposicion {

     
    public static void main(String[] args) {
       // Crear una nueva ventana
        JFrame ventana = new JFrame("Ejemplo de Pestaña con Layout");

        // Crear un JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Crear el primer panel de la pestaña
        JPanel panel1 = new JPanel();
        // Agregar un BorderLayout al panel1
        panel1.setLayout(new BorderLayout());
        // Agregar componentes al panel1 con el BorderLayout
        panel1.add(new JButton("Norte"), BorderLayout.NORTH);
        panel1.add(new JButton("Centro"), BorderLayout.CENTER);
        panel1.add(new JButton("sur"), BorderLayout.SOUTH);
        
        panel1.add(new JButton("oeste"), BorderLayout.WEST);
        panel1.add(new JButton("este"), BorderLayout.EAST);
        // Crear el segundo panel de la pestaña
        JPanel panel2 = new JPanel();
        // Agregar un GridLayout al panel2
        panel2.setLayout(new GridLayout(2, 2));
        // Agregar componentes al panel2 con el GridLayout
        panel2.add(new JButton("Botón 1"));
        panel2.add(new JButton("Botón 2"));
        panel2.add(new JButton("Botón 3"));
        panel2.add(new JButton("Botón 4"));
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.add(new JButton("Botón 1 "));
        panel3.add(new JButton("Botón 2 "));
        panel3.add(new JButton("Botón 3 "));
        panel3.add(new JButton("Botón 4 "));
        
        JPanel panel4 = new JPanel();
        JTextField textField = new JTextField(20);
        JLabel label = new JLabel("Texto ingresado: ");

        // Agregar un KeyListener al JTextField
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                    System.out.println("Tecla presionada: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                    System.out.println("Tecla liberada: " + e.getKeyChar());
            }

            @Override
            public void keyTyped(KeyEvent e) {
                    // Se llama cuando se genera un carácter de tecla
                char character = e.getKeyChar();
                    // Actualizar el texto del JLabel con el carácter ingresado
                label.setText("Texto ingresado: " + character);
            }
        });
        panel4.add(label);
        panel4.add(textField); 
        
        // Agregar los paneles a las pestañas
        tabbedPane.addTab("border layout", panel1);
        tabbedPane.addTab("GridLayout", panel2);
        tabbedPane.addTab("FlowLayout", panel3);
        tabbedPane.addTab("KEYLISTENER", panel4);
        // Agregar el JTabbedPane a la ventana
        ventana.add(tabbedPane);

        // Configurar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setVisible(true);
    
    }
}
    

