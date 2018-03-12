package Actividad_1;
public class Banquero extends Cliente{
    
    String str;
    int edad;
    
    public Banquero(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    
    public void printInformacionCliente(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+numeroDeTelefono);
    }
    
    public void printTodalaInformacion(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+numeroDeTelefono);
        for(Hipoteca h: hipotecas){
            System.out.println(h);
        }
    }
}