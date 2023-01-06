package ciclistallave;

    public abstract class Ciclista {
    
        private int ID;
        private String Nombre;
        private int TiempoAcumulado = 0;

    public Ciclista(int ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }
       

    public String getNombre() {
        return Nombre;
    }

    public int getTiempoAcumulado() {
        return TiempoAcumulado;
    }

    public void setID(int ID) {
        this.ID = ID;
    }



    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTiempoAcumulado(int TiempoAcumulado) {
        this.TiempoAcumulado = TiempoAcumulado;
    }

    protected String imprimir(){
                                
        return "( "+"Identificador: "+ID+" Nombre: "+" "+Nombre+" Tiempo acumulado: "+TiempoAcumulado+" )";
    }
        
        
    }  
