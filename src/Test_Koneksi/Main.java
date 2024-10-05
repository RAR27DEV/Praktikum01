/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Koneksi;

/**
 *
 * @author rama
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {

   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
        createAndShowGUI();
    });
    }

    private static void createAndShowGUI() {
       JFrame frame = new JFrame("Aplikasi Koneksi Database");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Utama panel = new Utama();
       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);
    }
    
}
