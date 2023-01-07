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
public class Escalador extends Ciclista implements Serializable{
    
    private String aceleracionpromedio;
    private String gradorampa;

    public String getAceleracionpromedio() {
        return aceleracionpromedio;
    }

    public void setAceleracionpromedio(String aceleracionpromedio) {
        this.aceleracionpromedio = aceleracionpromedio;
    }

    public String getGradorampa() {
        return gradorampa;
    }

    public void setGradorampa(String gradorampa) {
        this.gradorampa = gradorampa;
    }


    public Escalador(String aceleracionpromedio, String gradorampa, String ID, String Nombre, String TiempoAcumulado) {
        super(ID, Nombre, TiempoAcumulado);
        this.aceleracionpromedio = aceleracionpromedio;
        this.gradorampa = gradorampa;
    }

    @Override
    public String imprimir () {
       
         return " ("+" Aceleracion Promedio : "+aceleracionpromedio+" "+"Grado de rampa soportada: "+gradorampa+")";
    }
    
     public String imprimirTipo(){
        return "Es un Escalador.";
    }

    @Override
    public String toString(){
                                
        return "( "+"Identificador: "+ID+" Nombre: "+" "+Nombre+" Tiempo acumulado: "+TiempoAcumulado+" Aceleración Promedio: "+aceleracionpromedio+" Grado de Rampa Soportada: "+gradorampa+" )";
    }
}
