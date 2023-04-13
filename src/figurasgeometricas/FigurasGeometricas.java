/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas;
import figurasgeometricas.*;

/**
 *
 * @author Emanuel
 */
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class FigurasGeometricas{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ventana obj = new ventana();
        obj.setTitle("Menú figuras geometricas");
        obj.setSize(600, 200);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null); 
        
        
    }
    
}
