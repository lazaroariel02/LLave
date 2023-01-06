/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclistallave;
import java.util.Scanner;
/**
 *
 * @author Lazaro
 */
public class Velocista extends Ciclista{
    
    private double potenciapromedio;
    private double velocidadpromedio;

    public Velocista(int ID, String Nombre, double potenciapromedio, double velocidadpromedio) {
        super(ID, Nombre);
        this.potenciapromedio=potenciapromedio;
        this.velocidadpromedio=velocidadpromedio;
    }

  

    public double getPotenciapromedio() {
        return potenciapromedio;
    }

    public void setPotenciapromedio(double potenciapromedio) {
        this.potenciapromedio = potenciapromedio;
    }

    public double getVelocidadpromedio() {
        return velocidadpromedio;
    }

    public void setVelocidadpromedio(double velocidadpromedio) {
        this.velocidadpromedio = velocidadpromedio;
    }
    
    @Override
    protected String imprimir () {;
        return "("+"Potenia Promedio : "+potenciapromedio+" "+"Velocidad Promedio: "+velocidadpromedio+")";
    }
    
    public String imprimirTipo(){
        return "Es un velocista.";
    }

    void setSumaTiempos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
