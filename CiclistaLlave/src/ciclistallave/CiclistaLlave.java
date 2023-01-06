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
public class CiclistaLlave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EquipoCiclista equipo1 = new EquipoCiclista("Cocodrilos","Matanzas");
      
       Velocista velocista1 = new Velocista(45345678, "Ramon", 12, 34);
       
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(11249871, "Alfredo", 115 );
       
       Escalador escalador1 = new Escalador(34857162, "Gerardo", 65, 48);
       
       equipo1.addCiclista(velocista1);
       equipo1.addCiclista(contrarrelojista1);
       equipo1.addCiclista(escalador1);
       velocista1.setSumaTiempos(452);
       contrarrelojista1.setSumaTiempos(364);
       escalador1.setSumaTiempos(325);
       equipo1.SumaTotal();
       equipo1.imprimirdatos();
       equipo1.ListaNombre();
    }
    
}
