/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import figurasgeometricas.*;
import java.awt.Font;
/**
 *
 * @author Emanuel
 */
public class ventana extends JFrame{
    JMenuBar barra;
    
    JMenu menu_esfera;
    JMenu menu_paralelepipedo;
    JMenu menu_cono;
    JMenu menu_cilindro;
    
    JMenuItem menuItem_perimetro;
    JMenuItem menuItem_area;
    JMenuItem menuItem_volumen;
    JMenuItem menuItem_perimetro1;
    JMenuItem menuItem_area1;
    JMenuItem menuItem_volumen1;
    JMenuItem menuItem_perimetro2;
    JMenuItem menuItem_area2;
    JMenuItem menuItem_volumen2;
    JMenuItem menuItem_perimetro3;
    JMenuItem menuItem_area3;
    JMenuItem menuItem_volumen3;
    JLabel resultado;
    
    public ventana(){
        crearMenu();
    }
    private void crearMenu(){
        barra = new JMenuBar();
        menu_esfera = new JMenu("Esfera");
        menu_paralelepipedo = new JMenu("Paralelepipedo");
        menu_cono = new JMenu("Cono");
        menu_cilindro = new JMenu("Cilindro");
        
        menuItem_perimetro = new JMenuItem("Perimetro");
        menuItem_area = new JMenuItem("Area");
        menuItem_volumen = new JMenuItem("Volumen");
        menuItem_perimetro1 = new JMenuItem("Perimetro");
        menuItem_area1 = new JMenuItem("Area");
        menuItem_volumen1 = new JMenuItem("Volumen");
        menuItem_perimetro2 = new JMenuItem("Perimetro");
        menuItem_area2 = new JMenuItem("Area");
        menuItem_volumen2 = new JMenuItem("Volumen");
        menuItem_perimetro3 = new JMenuItem("Perimetro");
        menuItem_area3 = new JMenuItem("Area");
        menuItem_volumen3 = new JMenuItem("Volumen");
        
        resultado = new JLabel("");
        
        menu_esfera.add(menuItem_perimetro);
        menu_esfera.add(menuItem_area);
        menu_esfera.add(menuItem_volumen);
        
        menu_paralelepipedo.add(menuItem_perimetro1);
        menu_paralelepipedo.add(menuItem_area1);
        menu_paralelepipedo.add(menuItem_volumen1);
        
        menu_cono.add(menuItem_perimetro2);
        menu_cono.add(menuItem_area2);
        menu_cono.add(menuItem_volumen2);
        
        menu_cilindro.add(menuItem_perimetro3);
        menu_cilindro.add(menuItem_area3);
        menu_cilindro.add(menuItem_volumen3);
        
        barra.add(menu_esfera);
        barra.add(menu_paralelepipedo);
        barra.add(menu_cono);
        barra.add(menu_cilindro);
        
        resultado = new JLabel("0");
        resultado.setBounds(10,10,10,10);
        resultado.setFont(new Font("Serif", Font.PLAIN, 20));
        add(resultado);
        
        
        setJMenuBar(barra);
        
        //Eventos menu
        menuItem_area.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
                Esfera esfera = new Esfera(numero);
                esfera.area();
                resultado.setText("El area de la esfera es: " + esfera.getAreaEsfera());
                
            }
        });
        menuItem_volumen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
                Esfera esfera = new Esfera(numero);
                esfera.area();
                resultado.setText("El volumen de la esfera es: " + esfera.getVolumenEsfera());
                
            }
        });
        menuItem_perimetro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
                Esfera esfera = new Esfera(numero);
                esfera.area();
                resultado.setText("El perimetro de la circunferencia de la esfera es: " + esfera.getPerimetroEsfera());
                
            }
        });
        
        menuItem_area1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String ancho;
                double numero;
                ancho= JOptionPane.showInputDialog("Ingrese el ancho: ");
                numero = Double.parseDouble(ancho);
                
                String altura;
                double numero1;
                altura= JOptionPane.showInputDialog("Ingrese la altura: ");
                numero1 = Double.parseDouble(altura);
                
                String longitud;
                double numero2;
                longitud= JOptionPane.showInputDialog("Ingrese la longitud: ");
                numero2 = Double.parseDouble(longitud);
                
                Paralelepipedo paralelepipedo = new Paralelepipedo(numero1, numero, numero2);
                paralelepipedo.area();
                resultado.setText("El area del paralelepipedo es: " + paralelepipedo.getAreaParalelepipedo());
                
            }
        });
        menuItem_volumen1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String ancho;
                double numero;
                ancho= JOptionPane.showInputDialog("Ingrese el ancho: ");
                numero = Double.parseDouble(ancho);
                
                String altura;
                double numero1;
                altura= JOptionPane.showInputDialog("Ingrese la altura: ");
                numero1 = Double.parseDouble(altura);
                
                String longitud;
                double numero2;
                longitud= JOptionPane.showInputDialog("Ingrese la longitud: ");
                numero2 = Double.parseDouble(longitud);
                
                Paralelepipedo paralelepipedo = new Paralelepipedo(numero1, numero, numero2);
                paralelepipedo.area();
                resultado.setText("El volumen del paralelepipedo es: " + paralelepipedo.getVolumenParalelepipedo());
                
            }
        });
        menuItem_perimetro1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String ancho;
                double numero;
                ancho= JOptionPane.showInputDialog("Ingrese el ancho: ");
                numero = Double.parseDouble(ancho);
                
                String altura;
                double numero1;
                altura= JOptionPane.showInputDialog("Ingrese la altura: ");
                numero1 = Double.parseDouble(altura);
                
                double numero2 = 0;
                
                Paralelepipedo paralelepipedo = new Paralelepipedo(numero1, numero, numero2);
                paralelepipedo.area();
                resultado.setText("El perimetro de la base del paralelepipedo es: " + paralelepipedo.getPerimetroParalelepipedo());
                
            }
        });
        
        menuItem_area2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
                
                String altura;
                double numero1;
                altura= JOptionPane.showInputDialog("Ingrese la altura: ");
                numero1 = Double.parseDouble(altura);
               
                
                Cono cono = new Cono(numero1, numero);
                cono.area();
                resultado.setText("El area del cono es: " + cono.getAreaCono());
                
            }
        });
        menuItem_volumen2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
                
                String altura;
                double numero1;
                altura= JOptionPane.showInputDialog("Ingrese la altura: ");
                numero1 = Double.parseDouble(altura);
                
                
                Cono cono = new Cono(numero1, numero);
                cono.area();
                resultado.setText("El volumen del cono es: " + cono.getVolumenCono());
                
            }
        });
        menuItem_perimetro2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
             
                double numero1=0;
                
               Cono cono = new Cono(numero1,numero);
               cono.area();
               resultado.setText("El perimetro de la base del cono es: " + cono.getPerimetroCono());
            }
        });
        
         menuItem_area3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
                
                String altura;
                double numero1;
                altura= JOptionPane.showInputDialog("Ingrese la altura: ");
                numero1 = Double.parseDouble(altura);
               
                
                Cilindro cilindro = new Cilindro(numero1, numero);
                cilindro.area();
                resultado.setText("El area del cilindro es: " + cilindro.getAreaCilindro());
                
            }
        });
        menuItem_volumen3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
                
                String altura;
                double numero1;
                altura= JOptionPane.showInputDialog("Ingrese la altura: ");
                numero1 = Double.parseDouble(altura);
               
                
                Cilindro cilindro = new Cilindro(numero1, numero);
                cilindro.area();
                resultado.setText("El volumen del cilindro es: " + cilindro.getVolumenCilindro());
               
            }
        });
        menuItem_perimetro3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String radio;
                double numero;
                radio= JOptionPane.showInputDialog("Ingrese el radio: ");
                numero = Double.parseDouble(radio);
            
                double numero1 = 0;
               
                
                Cilindro cilindro = new Cilindro(numero1, numero);
                cilindro.area();
                resultado.setText("El perimetro de la base del cilindro es: " + cilindro.getPerimetroCilindro());
               
            }
        });
        
   
    }


}
