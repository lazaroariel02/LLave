/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclistallave;

/**
 *
 * @author Lazaro
 */
public class Contrarrelojista extends Ciclista{
    
    private double velocidadmaxima;

    public Contrarrelojista(double velocidadmaxima, String Nombre,int ID) {
        super(ID, Nombre);
        this.velocidadmaxima = velocidadmaxima;
    }

   

    public double getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(double velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }
    
    @Override
    public String imprimir(){
        return " ("+" Velocidad Máxima: "+velocidadmaxima+" )";
    }
    
     public String imprimirTipo(){
        return "Es un contrarrelojista.";
    }

    void setSumaTiempos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
