/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclistallave;

import java.util.Scanner;
import javax.swing.JOptionPane;
import ciclistallave.Ciclista;
import java.util.Vector;
/**
 *
 * @author Lazaro
 */
public class EquipoCiclista {
    
    private String Nombre;
    private static double SumaTiempos;
    private String Pais;
    
    Vector Ciclistas;

    public EquipoCiclista(String Nombre, String Pais) {
        this.Nombre = Nombre;
        this.Pais = Pais;
        Ciclistas = new Vector();
    }
    
    public String getNombre() {
        return Nombre;
    }

    public static double getSumaTiempos() {
        return SumaTiempos;
    }

    public String getPais() {
        return Pais;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public static void setSumaTiempos(int SumaTiempos) {
        EquipoCiclista.SumaTiempos = SumaTiempos;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
    public String imprimirdatos (){
        return "("+"Nombre del equipo: "+Nombre+ "Suma de los Tiempos: "+SumaTiempos+"Pais: "+Pais+")";
    }
    
    public void addCiclista(Ciclista ciclista){
        
        Ciclistas.add(ciclista);
    }       
    
    
    public double SumaTotal(){
        double SumaTotal = SumaTiempos;
        return SumaTotal;
    }
    
    public String[] ListaNombre(){
        
        Scanner in = new Scanner(System.in);
        
        int k = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte la cantidad de nombres que desea agregar a la lista:"));
        
        String []NombreCiclistas = new String[k];
        
        for (int i=0; i<=NombreCiclistas.length; i++){
            
           NombreCiclistas[i]=Nombre;
            
        }
        
    return NombreCiclistas;
    
    }
    
    protected void datosCiclista(String ID){
        Scanner in = new Scanner (System.in);
        String nombreCiclista = in.next();
        for(int i=0; i<Ciclistas.size();i++){
         
            Ciclista c = (Ciclista) Ciclistas.elementAt(i);
            
            if(c.getNombre().equals(nombreCiclista)){
                System.out.println(c.getNombre());
            }
        }
        
    }

    void addCiclista(Velocista velocista1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void addCiclista(Contrarrelojista contrarrelojista1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
