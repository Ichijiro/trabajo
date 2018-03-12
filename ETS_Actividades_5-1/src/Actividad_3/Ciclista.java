package Actividad_3;
public class Ciclista {
    private final int AMATEUR=1;
    private final int SEMIPROFESIONAL=2;
    private final int PROFESIONAL=3;
    private final int _tipo;
    
    public Ciclista(int tipo){
        _tipo=tipo; 
        elegir(tipo);}
    
    public void elegir(int tipo){
        if(tipo==AMATEUR){
            System.out.println("Amateur");
        }
        if(tipo==SEMIPROFESIONAL){
            System.out.println("Semiprofesional");
        }
        if(tipo==PROFESIONAL){
            System.out.println("Profesional");
        }
        else{
            throw new IllegalArgumentException("Tipo de dato incorrecto");
        }
    }
    
    public int getTipo(){return _tipo;}
}