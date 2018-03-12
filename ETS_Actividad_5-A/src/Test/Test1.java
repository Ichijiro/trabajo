package Test;
public class Test1 {
    
    public static void main(String[] args) {
        int numero_1=(int)(Math.random()*100);
        int numero_2=(int)(Math.random()*100);
        int numero_3=(int)(Math.random()*100);
        int numero_4=(int)(Math.random()*100);
        int numero=(numero_1+numero_2)*(numero_3-numero_4);
        System.out.println("("+numero_1+" + "+numero_2+") x (? - "+numero_4+")= "+numero);
    }
    
}