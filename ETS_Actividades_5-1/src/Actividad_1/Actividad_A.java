package Actividad_1;
public class Actividad_A {
    
    public static void main(String[]args){
        Actividad_1.Banquero aplicar=new Actividad_1.Banquero("987654321");
        Actividad_1.Cliente crear=new Actividad_1.Cliente("123456789");;
        aplicar.edad=19;
        aplicar.str="Hola";
        aplicar.printTodalaInformacion();
    }
    
}