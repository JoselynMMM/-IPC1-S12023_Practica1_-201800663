/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author J1M3
 */
public class menu {
    
   
    public  void menu1() {
        
        Scanner sn = new Scanner(System.in);
        
        /*inicializando variables
        
        */
       
       int opcion; //Guardaremos la opcion del usuario
       
       
       
        do{
            
           System.out.println("***********************************"); 
           System.out.println("***********************************");
           System.out.println("************Menu inicial***********"); 
           System.out.println("1. Agregar nuevos productos.");
           System.out.println("2. Agregar cupones de descuento.");
           System.out.println("3. Realizar ventas.");
           System.out.println("4. Realizar reporte.");
           System.out.println("5. Salir");
           System.out.println("***********************************"); 
           System.out.println("***********************************"); 
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           
           /*panel de opciones
           
           */
           switch(opcion){
               case 1:
                    Scanner datos = new Scanner(System.in);

    
                    String productos[][] = new String[5][2];
                    

                    //variables donde guardar el nombre del producto y el precio
                    String pro;
                    int precio;
            
                     int i = 0;
                     int j = 0;
                     //los productos

                     for (i= 0; i< 5; i++) {
                            
                            for (j= 0; j< 2; j++) {
                                System.out.println("Introducir [Producto "+i+"] [Precio "+j+"]=");
                                productos[i][j] = datos.nextLine();
                                
                            }
                            
                                                  
                          
                        } 
                     System.out.println("Productos ingresados: ");
                        
                     for (i= 0; i< 5; i++) {
                            
                            for (j= 0; j< 2; j++) {
                                System.out.print(productos[i][j]);
                                
                            }
                            
                            System.out.println("");
                          
                        } 
                   break;
               case 2:
                   int cantidad, op=0, nit;
                   double pre, total, imp;
                   String nom;
                   
                   Scanner fac = new Scanner(System.in);
                   
                   System.out.println("************REALIZACION DE VENTA***********");
                   System.out.println("Ingrese el nombre del cliente: ");
                   nom = fac.nextLine();
                   
                   System.out.println("Ingrese el NIT del cliente: ");
                   nit = fac.nextInt();
                   
                   
                           
                    
                   
                         
                   
                   
                   System.out.println("Ingrese el nombre del cliente: ");
                   
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4");
                   break;
                case 5:
                   System.out.println("Cerrando sesión");
                  
                   break;
                   
                    /*deteccion de error
                    
                    */
                default:
                    
                   System.out.println("Solo números entre 1 y 5");
           }
             /*opcion para salir del programa
                    
                    */
       } while(opcion!=5);
       
        
    }
    
    
}
    


