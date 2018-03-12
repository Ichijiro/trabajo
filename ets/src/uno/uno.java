package uno;
import java.util.Arrays;
public class uno {
    
    public static void main(String[] args) {
        //declarar.
        int[] uno={1,1,1};
        int[] dos={2,2,2};
        int[] tres=new int[uno.length+dos.length];
        
        //Importar datos.
        for (int i = 0; i < tres.length; i++) {
            if(i<uno.length){tres[i]=uno[i];}
            if(i>=uno.length){tres[i]=dos[i-uno.length];}
        }
        
        //Resultado.
        System.out.println(Arrays.toString(tres));
        }
    
}