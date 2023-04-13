/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Emanuel
 */

public class Cilindro implements FiguraGeometrica{
    
    private double altura;
    private double radio;
    static final double PI = 3.14159265;
    private double areaCilindro;
    private double perimetroCilindro;
    private double volumenCilindro;
    
    
    public Cilindro(double altura, double radio){
        this.altura = altura;
        this.radio = radio;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getAreaCilindro(){
        return areaCilindro;
    }
    public double getPerimetroCilindro(){
        return perimetroCilindro;
    }
    public double getVolumenCilindro(){
        return volumenCilindro;
    }
    @Override
    public void area(){
        areaCilindro = PI*radio*radio + 2*radio*PI*altura;
        perimetroCilindro = 2*PI*radio;
        volumenCilindro = radio*radio*PI*altura;
    }   
}

