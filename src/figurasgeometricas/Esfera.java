/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public  class Esfera implements FiguraGeometrica{
    
    private double radio;
    private double areaEsfera;
    private double perimetroEsfera;
    private double volumenEsfera;
    
    static final double PI = 3.14159265;
    
    public Esfera(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
 
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getAreaEsfera(){
        return areaEsfera;
    }
    public double getPerimetroEsfera(){
        return perimetroEsfera;
    }
    public double getVolumenEsfera(){
        return volumenEsfera;
    }
    @Override
    public void area(){
        areaEsfera = 4*PI * radio * radio;
        perimetroEsfera = 2*PI*radio;
        volumenEsfera = 0.75*PI*radio*radio*radio;
        
        
    }   
}
