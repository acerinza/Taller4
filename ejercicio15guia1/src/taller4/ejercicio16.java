package taller4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author uestudiantes
 */
public class ejercicio16 {

    /**
     * Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y 
     * mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.  
     * Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango permitido, 
     * también se debe pedir el precio de la hora.  Imprimir la cantidad de horas trabajadas y el pago.
     * DS:CANTIDAD DE HORAS Y PRECIO POR HORA
     * DE: NUMEROS DOUBLE
     */
    public static void main(String[] args) {
        
        double horasTrabajadas;
        double precioHora;
        double salario;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca horas trabajadas");
        horasTrabajadas = read.nextDouble ();
        
        System.out.println("Introduzca precio por hora");
        precioHora = read.nextDouble ();
        
        if ((horasTrabajadas<=56)&&(horasTrabajadas>=38)){
             System.out.println(salario = horasTrabajadas*precioHora);
                
    }else{
            System.out.println("Numero de horas invalidas");
            }
    
    }
}
