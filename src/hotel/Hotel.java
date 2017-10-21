/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jefersson
 */
public class Hotel {
public static Clientes h=new Clientes();
    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);

int opcion = 0;
  while(opcion!=5){
                
        System.out.println("-----Menu------");
System.out.println("1- Verificar habitaciones ocupadas \n2- Reservar habitacion \n3- Retirar Reservacion de habitacion \n4-Dinero en el hotel \n5-Salir");
        
        System.out.println("Ingrese Opcion: ");
        opcion=leer.nextInt();
         try {
        
        
        switch(opcion){
   
        case 1:
            System.out.print("");
            h.mostrarClientes();
            System.out.print("");
            h.Ocupadas();
            System.out.print("");
        break;
        
        
        case 2:
        int a = 0;
          
            while(a!=4){
            System.out.println("-------Tipo de habitacion------");
            System.out.println("1-Sencillas \n2-Dobles \n3-Suites \n4-Atras ");
            System.out.print("Ingrese opcion :");a=leer.nextInt();
                
                try{
                switch(a){
                
                
                case 1:
                    int o=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Primer piso\n 2-Segundo piso ");
                    System.out.print("Ingrese opcion :");
                   o=leer.nextInt();
                    if(o==1){
                      
                h.reservar(4);
                    }else if(o==2){
                    h.reservar(3);
                    
                    }
                break;
                
                case 2:
                    int j=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Tercer piso\n 2-Cuarto piso ");
                    System.out.print("Ingrese opcion :");
                   j=leer.nextInt();
                    if(j==1){
                      
                h.reservar(2);
                    }else if(j==2){
                    h.reservar(1);
                    
                    }
                    break;
                case 3:
                
                    System.out.println("------Suites--------");
                   
                    h.reservar(0);
                    
                    
                    break;
                    
                case 4:
                    break;
              
            
            }
            
            }catch(InputMismatchException e){
             System.out.println("Debes insertar un número");
                leer.next();
            }
            }
            break;
        case 3:
          int op = 0;
          
            while(op!=4){
            System.out.println("-------Tipo de habitacion------");
            System.out.println("1-Sencillas \n2-Dobles \n3-Suites \n4-Atras ");
            System.out.print("Ingrese opcion :");op=leer.nextInt();
                
                try{
                switch(op){
                
                
                case 1:
                    int o=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Primer piso\n 2-Segundo piso ");
                    System.out.print("Ingrese opcion :");
                   o=leer.nextInt();
                    if(o==1){
                      
                h.retirarReservacion(4);
                    }else if(o==2){
                    h.retirarReservacion(3);
                    
                    }
                break;
                
                case 2:
                  
                    int j=0;
                    System.out.println("------Pisos--------");
                    System.out.println(" 1-Tercer piso\n 2-Cuarto piso ");
                    System.out.print("Ingrese opcion :");
                   o=leer.nextInt();
                    if(j==1){
                      
                h.retirarReservacion(2);
                    }else if(j==2){
                    h.retirarReservacion(1);
                    
                    }
                    break;
                case 3:
                
                    System.out.println("------Suites--------");
                   
                    h.retirarReservacion(0);
                    
                    
                    break;
                    
                case 4:
                    break;
              
            
            }
            
            }catch(InputMismatchException e){
             System.out.println("Debes insertar un número");
                leer.next();
            }
            }
            break;
        case 4:
           System.out.print(" "); 
            h.dineroSencillas();
            h.dineroDobles();
            h.dineroSuits();
            h.dineroTotal();
           System.out.print(" ");
            break;
        
        case 5:
            
            System.exit(0);
            break;
        
       
    
  
  
    }
   } 
    catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                leer.next();
    }
}
    }
}