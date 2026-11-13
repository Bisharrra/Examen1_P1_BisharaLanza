/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_p1_bisharalanza;

import java.util.Scanner;

/**
 *
 * @author bisha
 */
public class Examen1_P1_BisharaLanza {

    /**
     * @param args the command line arguments
     */
     static Scanner leer=new Scanner (System.in);
    public static void main(String[] args) {
        // TODO code application logic here
      int opcion= menu();
while (opcion!=4){
switch (opcion){
case 1:{
LaCaidaDeLaRam();
}
break;
case 2:{
EntendiendoALasMujeres();
}
break;
case 3:{
EstudiandoParaExamen();
}
break;
case 4:{
Salir();
}
}
break;
        
    }
opcion = menu();
}
    
    public static int menu (){
System.out.println("1. La caida de la Ram ");
System.out.println("2. Entendiendo a las mujeres ");
System.out.println("3. Estudiando para examen");
System.out.println("4. Salir  ");
int op = leer.nextInt();
return op;
    }
    public static void LaCaidaDeLaRam(){
        int n=0;
        System.out.println("ingrese n");
        n=leer.nextInt();
        
        
        
        if (n!=0 ){
        for (int i=0; i<=n; i++){
            System.out.println("ingrese x");
        int x=leer.nextInt();
        System.out.println("ingrese r");
        int r=leer.nextInt();
        while (r>=x){
        System.out.println("r no puede ser mayor o igual que x");
        System.out.println("ingrese r");
        r=leer.nextInt();
        }
        
        int Fx=0;
        int c=0;
        int acumx=0;  
        while (x != 0){ 
        int multx=1;
        Fx=x-1;
        
        

        acumx=x*Fx;
        
       
        
        
        
        System.out.println(acumx);
        
        }
        
        int Fr=0;
        int p=0;
        int acumr=0;  
        while (r != 0){
        
        int multr=1;
        Fr=r-1;
        
        acumr=r*Fr;
        
            
        
       
        
          
        System.out.println(acumr);  
            
            
        }
        
                
                
        
        
        }
        
        
        }
       
        else{     System.out.println("ingrese n");
                n=leer.nextInt();
        }
                
    }
    public static void EntendiendoALasMujeres(){
         System.out.println("ingrese el mensaje");
         String mensaje=leer.next();
         
         
       
             
         
             
         
         
    }
    public static void EstudiandoParaExamen(){
        System.out.println("ingrese un numero octal");
        int octal=leer.nextInt();
        
        if (octal<=0 || octal>=7){
            
        }
            
            
                
        
                
    }
    public static void Salir(){
        System.out.println("gracias por usar el programa");
    }
}
