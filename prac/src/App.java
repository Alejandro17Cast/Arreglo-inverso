
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static int tamaño=0; 
    public static Scanner leer= new Scanner(System.in); 
    public static int[] llenado()  {
        int prac[]= new int[tamaño]; 

        for(int i=0; i<prac.length; i++){
      System.out.println("\t\t Ingrese los valores["+(1+i)+"]");
        prac[i]=leer.nextInt(); 
       
      

      }

       return prac; }

public static void invertirarreglo(int [] prac){
    for(int i= prac.length-1; i>=0; i--){
     System.out.println(prac[i]);
          }
}

public static void main(String[] args) throws Exception {
       Scanner leer=new Scanner(System.in);


 while (true) {
    try {
        System.out.println("\t\tIngrese el tamaño del arreglo");
        tamaño=leer.nextInt();
            if (tamaño<1 || tamaño>16) {
      throw new Exception("Ingrese un valor mayor a 1 y menor que 16");
     }  
break; 
     
 } catch (InputMismatchException e) {
       System.out.println("Ingrese un valor permitido");
       leer.next(); 
   
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

 
}
leer.nextLine(); 
     int []prac=llenado(); 
     System.out.println("\t\t El arreglo invertido es: ");
     invertirarreglo(prac);
  


    }
}