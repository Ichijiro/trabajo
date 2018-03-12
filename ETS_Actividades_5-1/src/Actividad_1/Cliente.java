package Actividad_1;
import java.util.ArrayList;
public class Cliente {
    
    String numeroDeTelefono;
    ArrayList <Hipoteca> hipotecas=new ArrayList<>();
    
    public Cliente(String numeroDeTelefono){
        super();
        this.numeroDeTelefono=numeroDeTelefono;
        anadirHipoteca(1, 45.98);
    }
    
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono=numeroDeTelefono;
    }
    
    public void anadirHipoteca(int numero, double dinero){
        Hipoteca hipoteca=new Hipoteca(numero,dinero);
        hipotecas.add(hipoteca);
    }
}