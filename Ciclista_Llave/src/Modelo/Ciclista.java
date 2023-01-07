package Modelo;

import java.io.Serializable;

    public abstract class Ciclista implements Serializable{
    
        protected String ID;
        protected String Nombre;
        protected String TiempoAcumulado;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTiempoAcumulado() {
        return TiempoAcumulado;
    }

    public void setTiempoAcumulado(String TiempoAcumulado) {
        this.TiempoAcumulado = TiempoAcumulado;
    }

    public Ciclista(String ID, String Nombre, String TiempoAcumulado) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.TiempoAcumulado = TiempoAcumulado;
    }



    protected String imprimir(){
                                
        return "( "+"Identificador: "+ID+" Nombre: "+" "+Nombre+" Tiempo acumulado: "+TiempoAcumulado+" )";
    }
        
        
    }  
