package Controlador;

import Modelo.Contrarrelojista;
import Modelo.Escalador;
import Modelo.Velocista;
import java.io.*;
import java.util.ArrayList;

    public class CRUD {
    
        public static ArrayList<Velocista> readFileTextVelocista() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("Velocista.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Velocista> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Velocista nuevo = (Velocista)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextVelocista(ArrayList<Velocista>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("Velocista.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<Escalador> readFileTextEscalador() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("Escalador.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Escalador> clientes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Escalador nuevo = (Escalador)entradaObjetos.readObject();
                clientes.add(nuevo);
                
            }
            
            return clientes;
        }
        
        public static void writeFileTextEscalador(ArrayList<Escalador>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("Escalador.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<Contrarrelojista> readFileTextContrarrelojista() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("Contrarrelojista.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Contrarrelojista> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Contrarrelojista nuevo = (Contrarrelojista)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextContrarrelojista(ArrayList<Contrarrelojista>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("Contrarrelojista.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
            
            int cantidad = participantes.size();
            
            salidaObjetos.writeInt(cantidad);
            
            for(int i=0;i<cantidad;i++){
                
                salidaObjetos.writeObject(participantes.get(i));
                
            }
            
            salidaObjetos.flush();
            salidaObjetos.close();
            
        }
        
              
}





