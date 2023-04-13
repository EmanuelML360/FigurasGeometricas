/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Emanuel
 */
public class Paralelepipedo implements FiguraGeometrica{
    
    private double altura;
    private double longitud;
    private double ancho;
    private double areaParalelepipedo;
    private double perimetroParalelepipedo;
    private double volumenParalelepipedo;
    
    
    public Paralelepipedo(double altura, double ancho, double longitud){
        this.altura = altura;
        this.ancho = ancho;
        this.longitud = longitud;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAncho(){
        return ancho;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public double getLongitud(){
        return longitud;
    }
    public void setLongitud(double longitud){
        this.longitud = longitud;
    }
    
    
    public double getAreaParalelepipedo(){
        return areaParalelepipedo;
    }
    public double getPerimetroParalelepipedo(){
        return perimetroParalelepipedo;
    }
    public double getVolumenParalelepipedo(){
        return volumenParalelepipedo;
    }
    @Override
    public void area(){
        areaParalelepipedo = 2*ancho*altura+2*ancho*longitud+2*ancho*longitud;
        perimetroParalelepipedo = 2*ancho+2*altura;
        volumenParalelepipedo = ancho*altura*longitud;
    }   
}
