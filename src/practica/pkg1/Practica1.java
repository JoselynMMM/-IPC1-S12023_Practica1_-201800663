
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author J1M3
 */
public class Practica1 {

    public static void main(String[] args) {
    
        /*registro de usuario
        
        */
        
        String pass = "12", user = "12";
        String passw, use;
        int i = 0;
        int j = 0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("*************SUPER_25**************");
        System.out.println("***********Iniciar sesion**********");
        
        /*Ingreso de datos
        
        */
        
        do {
            
            System.out.println("Ingrese su usuario: ");
            use = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            passw = sc.nextLine();
            
            
            /* evaluacion de acceso
            
            */
            if (user.equals(use)&& pass.equals(passw)){
                
                /*llamar a la clase menu
                
                */
                menu obj=new menu();
                obj.menu1();
                j = 1;
            }else {
                System.out.println("El usuario o la contaseña es incorrecto.");
                System.out.println("Ingrese sus dato nuevamente.");
                i++;
                if (i == 5){
                    System.out.println("Acceso restringido.");
                }
            }
            /*condicion de repeticion del bucle
            
            */
        } while((i != 5)&& j==0);
        
        
        
    }
    
}
