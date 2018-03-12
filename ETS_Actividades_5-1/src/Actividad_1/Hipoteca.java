package Actividad_1;
public class Hipoteca {

    int numero;
    double dinero;
    int hola=2;
    
    public Hipoteca(int numero, double dinero){
        this.numero=numero;
        this.dinero=dinero;
        this.hola=hola+numero;
    }
    
    public String toString(){
        return "Numero del cliente: "+numero+" Su hipoteca: "+dinero+" hola "+hola;
    }
    
}