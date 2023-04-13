/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Emanuel
 */
public class Cono implements FiguraGeometrica{
    
    private double altura;
    private double radio;
    private double generatris;
    static final double PI = 3.14159265;
    private double areaCono;
    private double perimetroCono;
    private double volumenCono;
    
    
    public Cono(double altura, double radio){
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
    
    public double getAreaCono(){
        return areaCono;
    }
    public double getPerimetroCono(){
        return perimetroCono;
    }
    public double getVolumenCono(){
        return volumenCono;
    }
    @Override
    public void area(){
        generatris = Math.sqrt((radio*radio)+(altura*altura));
        areaCono = PI*radio*radio + 2*PI*generatris;
        perimetroCono = 2*PI*radio;
        volumenCono = radio*radio*PI*altura*0.3333;
    }   
}
