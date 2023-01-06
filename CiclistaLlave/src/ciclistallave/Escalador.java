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
public class Escalador extends Ciclista{
    
    private float aceleracionpromedio;
    private float gradorampa;

    public Escalador(float aceleracionpromedio, String Nombre,int ID, float gradorampa ) {
        super(ID, Nombre);
        this.aceleracionpromedio = aceleracionpromedio;
        this.gradorampa = gradorampa;
    }

    public float getAceleracionpromedio() {
        return aceleracionpromedio;
    }

   

    public float getGradorampa() {
        return gradorampa;
    }

    public void setGradorampa(float gradorampa) {
        this.gradorampa = gradorampa;
    }
    
    @Override
    public String imprimir () {
       
         return " ("+" Aceleracion Promedio : "+aceleracionpromedio+" "+"Grado de rampa soportada: "+gradorampa+")";
    }
    
     public String imprimirTipo(){
        return "Es un Escalador.";
    }

    void setSumaTiempos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
