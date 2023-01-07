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
public class Contrarrelojista extends Ciclista implements Serializable{

    private String velocidadmaxima;

    public String getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(String velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    public Contrarrelojista(String velocidadmaxima, String ID, String Nombre, String TiempoAcumulado) {
        super(ID, Nombre, TiempoAcumulado);
        this.velocidadmaxima = velocidadmaxima;
    }

    
    @Override
    public String imprimir(){
        return " ("+" Velocidad Máxima: "+velocidadmaxima+" )";
    }
    
     public String imprimirTipo(){
        return "Es un contrarrelojista.";
    }

    @Override
         public String toString(){
                                
        return "( "+"Identificador: "+ID+" Nombre: "+" "+Nombre+" Tiempo acumulado: "+TiempoAcumulado+" Velocidad Máxima: "+velocidadmaxima+" )";
    }
}
