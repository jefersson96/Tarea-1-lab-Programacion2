/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author jefersson
 */
public class Clientes {
  Scanner leer=new Scanner(System.in);
    public static int s,j;
    int [][] habitaciones= new int [6][6];
   int precioSencillas=1200;
   int precioDobles=3400;
   int precioSuits=5000;
    int lobi;
   int sencillas;
   int dobles;
   int suits;
   
   public int  reservar(int x){

int y = 0;
 if(x==5 && y==0 || y==1 || y==2 || y==3 || y==4 || y==5){
System.out.print("No puede reservar una habitacion en el lobi");
 }else{
 System.out.print("Ingrese habitacion :");
 y=leer.nextInt();

 }
      return habitaciones[x][y]=1;
 }
   
   
   
   
   
   
   public void mostrarClientes(){
  for (int x=0; x < habitaciones.length; x++) {
  System.out.print("|");
  for (int y=0; y < habitaciones[x].length; y++) {
    System.out.print (habitaciones[x][y]);
    if (y!=habitaciones[x].length-1) System.out.print("\t");
  }
  System.out.println("|");
}
   
   }
   
   public int retirarReservacion(int x){
int y;
 System.out.print("Ingrese habitacion :");
 y=leer.nextInt();
return  habitaciones[x][y]=0;
   
   }
   
   public void dineroSencillas(){
       
   int dinero=0;
for(int x=0;x<habitaciones.length;x++){
if(habitaciones[4][x]==1 || habitaciones[3][x]==1){
dinero=dinero+precioSencillas;
}

else{
        
        dinero=dinero+0;
                }
 
   }
    
     System.out.println("Dinero en Habitaciones Sencillas : "+dinero+" Lempiras.");
   }
   
   
     public void dineroDobles(){
       
   int dinero=0;
for(int x=0;x<habitaciones.length;x++){
if(habitaciones[2][x]==1 || habitaciones[1][x]==1){
dinero=dinero+precioDobles;
}

else{
        
        dinero=dinero+0;
                }
 
   }
    
     System.out.println("Dinero en habitaciones dobles : "+dinero+" Lempiras.");
   }
     
    public void dineroSuits(){
       
   int dinero=0;
for(int x=0;x<habitaciones.length;x++){
if(habitaciones[0][x]==1){
dinero=dinero+precioSuits;
}

else{
        
        dinero=dinero+0;
                }
 
   }
    
     System.out.println("Dinero total en Suits : "+dinero+" Lempiras.");
   }
      public void dineroTotal(){
       
   int dineroSen=0;
   int dineroDob=0;
   int dineroSuit=0;
   int dinerototal=0;
for(int x=0;x<habitaciones.length;x++){

    if(habitaciones[4][x]==1 || habitaciones[3][x]==1){
dineroSen=dineroSen+precioSencillas;
}

else{
        
        dineroSen=dineroSen+0;
                }
 
   }
    
for(int x=0;x<habitaciones.length;x++){

    if(habitaciones[2][x]==1 || habitaciones[1][x]==1){
dineroDob=dineroDob+precioDobles;
}

else{
        
        dineroDob=dineroDob+0;
                }
 
   }


for(int x=0;x<habitaciones.length;x++){

    if(habitaciones[0][x]==1){
dineroSuit=dineroSuit+precioSuits;
}

else{
        
        dineroSuit=dineroSuit+0;
                }
 
   }


dinerototal=dineroSuit+dineroSen+dineroDob;
     System.out.println("Dinero Total :  "+dinerototal+" Lempiras.");
   }
     
      public void Ocupadas(){
     int contador=0;
     int desocupadas=0;
          for(int i=0;i<habitaciones.length;i++){
      for(int x=1;x<habitaciones.length;x++){
      if(habitaciones[i][x]==1){
      contador++;
      
      }else{
      desocupadas++;
      }
     
      
      }
      
      
      }
       System.out.println("Habitaciones Ocupadas : "+contador+"\n Habitaciones Des-Ocupadas : "+desocupadas);
      }
      
      
}
   
   
   
   
   
   
   

   
   
   

