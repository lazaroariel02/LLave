/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Lazaro
 */
public class Velocista extends Ciclista implements Serializable{
    
    private String potenciapromedio;
    private String velocidadpromedio;

    public String getPotenciapromedio() {
        return potenciapromedio;
    }

    public void setPotenciapromedio(String potenciapromedio) {
        this.potenciapromedio = potenciapromedio;
    }

    public String getVelocidadpromedio() {
        return velocidadpromedio;
    }

    public void setVelocidadpromedio(String velocidadpromedio) {
        this.velocidadpromedio = velocidadpromedio;
    }

    public Velocista(String potenciapromedio, String velocidadpromedio, String ID, String Nombre, String TiempoAcumulado) {
        super(ID, Nombre, TiempoAcumulado);
        this.potenciapromedio = potenciapromedio;
        this.velocidadpromedio = velocidadpromedio;
    }

    
    @Override
    protected String imprimir () {;
        return "("+"Potencia Promedio : "+potenciapromedio+" "+"Velocidad Promedio: "+velocidadpromedio+")";
    }
    
    public String imprimirTipo(){
        return "Es un velocista.";
    }

    @Override
    public String toString(){
                                
        return "( "+"Identificador: "+ID+" Nombre: "+" "+Nombre+" Tiempo acumulado: "+TiempoAcumulado+" Potencia Promdedio: "+potenciapromedio+" Velocidad Promedio: "+velocidadpromedio+" )";
    }
}
