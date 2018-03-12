package Actividad_2;
public class Voluntario extends Persona{
    
    String idVoluntario;

    public Voluntario(String idVoluntario, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idVoluntario=idVoluntario;
    }
    
    public void setidVoluntario(String idVoluntario){this.idVoluntario=idVoluntario;}
    public String getidVoluntario(){return idVoluntario;}
    public void mostrarNombreApellidosYFicha(){
        System.out.println("El nombre es: "+getNombre());
        System.out.println("El apellido es: "+getApellidos());
        System.out.println("La edad es: "+getEdad());
    }
}