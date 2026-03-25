package menu;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        String operacion;
        int resultado;
    //suma clasesuma = new suma();
    //resta claseresta = new resta();
    multiplicacion clasemultiplicacion = new multiplicacion();
    
        System.out.println("Elige que operacion deseas realizar");
        System.out.println("SUMA - RESTA - MULTIPLICACION");
        operacion = teclado.nextLine();
        
        String texto = operacion.toLowerCase();
        
        System.out.println("Ingrese el primer numero: ");
            int a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
            int b = teclado.nextInt();
            
            if("suma".equals(texto)){
                System.out.println("---------SUMA------------");
                //resultado = clasesuma.suma(a, b);
                //System.out.println("Resultado de la suma: " + resultado);  
            }
            else if("resta".equals(texto)){
                System.out.println("---------RESTA-----------");
                //resultado = claseresta.resta(a, b);
                //System.out.println("Resultado de la resta: " + resultado);       
            }
            else if("multiplicacion".equals(texto)){
                System.out.println("---------MULTIPLICACION-----------");
                resultado = clasemultiplicacion.multiplicacion(a, b);
                System.out.println("Resultado de la multiplicacion: " + resultado);}
            
            else{
                System.out.println("Lo siento pero nuestra calculadora no cuenta con esa operacion");}
    }
}