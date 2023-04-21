/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6_funciones;
import java.util.Scanner;

/**
 *
 * @author SUPCOMERCIO
 */
public class Act6_funciones {

    /**
     * @param args the command line arguments
     */
    int opcion;
        Scanner scan=new Scanner(System.in);
    
    public static void main(String[] args) {
        // Operaciones
        
        double num1, num2, resultado;
        int opcion;
        Scanner scan=new Scanner(System.in);
        boolean opcionValida=true;
        
        System.out.println("Elija una opción: \r\n1. Suma \r\n2. Resta \n\r3. Multiplicación \n\r4. División.");
        opcion=scan.nextInt();
        
        
        switch (opcion){
            case 1: 
                System.out.println("Ingrese dos números a sumar.");
                num1=LeerNumero();
                num2=LeerNumero();
                resultado=Suma(num1,num2);
            break;
            
            case 2: 
                System.out.println("Ingrese dos números a restar.");
                num1=LeerNumero();
                num2=LeerNumero();
                resultado=Resta(num1,num2);
                break;
                
                case 3: 
                System.out.println("Ingrese dos números a multiplicar.");
                num1=LeerNumero();
                num2=LeerNumero();
                resultado=Multiplicacion(num1,num2);
            break;
            
            case 4: 
                System.out.println("Ingrese dos números a dividir.");
                num1=LeerNumero();
                num2=LeerNumero();
                if(num1==0 && num2==0)
                {
                    opcionValida=false;
                    System.out.println("No se puede dividir por cero.");
                    resultado=0;
                }
                else
                {
                resultado=Division(num1,num2);
                }
                break;
                
            default:
                System.out.println("Usted no ha seleccionado ninguna opción válida.");
                opcionValida=false;
                resultado=0;
                break;
        }
        
        if(opcionValida){
        ImprimirResultado(resultado);
        }
        
    }
    
    private static int LeerNumero(){
                Scanner scan=new Scanner(System.in);
        return scan.nextInt();
    }
    
    
    
    private static double Suma(double n1, double n2){
        return n1+n2;
    }
    
    private static double Resta (double n1, double n2){
        if(n1>n2){
        return n1-n2;
        }
        else{
            return n2-n1;
        }
    }
    
    private static double Multiplicacion (double n1, double n2){
        return n1*n2;
    }
    
    private static double Division (double n1, double n2){
        if (n2!=0){
        return n1/n2;
        }
        else {
        return 0;
        }
        
    } 
    
    
    
    private static void ImprimirResultado(double num){
        System.out.println("El resultado de la operación es "+num+".");
    }
    
    
}
