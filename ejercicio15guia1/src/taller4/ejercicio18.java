/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class ejercicio18 {

    /**Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes parámetros: 
     * •Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y más Aux. de transporte= +11%.
     * •Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-6% y más Aux. de transporte= +9%.
     * •Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, descuento de segurode vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
     * •Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
     * •Si gana más de 2.500.000,
     * descuento por pensión es -8%, descuento de seguro de vida 6%, descuento de salud =-10% y más Aux. de transporte= +9%
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // DE: Numeros double
        // DS: Rangos de salario, descuentos
       
        double salario;
       
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Introduzca Salario");
        salario = read.nextDouble ();
        
        if (salario<700000){
            double pension= salario*0.02;
            double salud= salario*0.04;
            double trasnporte= salario*0.11;
            salario=salario-pension-salud+trasnporte;
            System.out.println("Salario final:"+salario);
            
        }
        
            if ((salario>=741000)&&(salario<=999999)){
            double pension= salario*0.04;
            double salud= salario*0.06;
            double trasnporte= salario*0.09;
            salario=salario-pension-salud+trasnporte;
            System.out.println("Salario final:"+salario);
             
    } 
    
            if ((salario>1000000)&&(salario<1800000)){
            double pension= salario*0.06;
            double seguro= salario*0.05;
            double salud= salario*0.06;
            double trasnporte= salario*0.09;
            salario=salario-pension-seguro-salud+trasnporte;
            System.out.println("Salario final:"+salario);
    }
            if ((salario>1800000)&&(salario<2500000)){
            double pension= salario*0.06;
            double seguro= salario*0.05;
            double salud= salario*0.08;
            double trasnporte= salario*0.08;
            salario=salario-pension-seguro-salud+trasnporte;
            System.out.println("Salario final:"+salario);
   }        
             if ((salario>2500000)){
            double pension= salario*0.08;
            double seguro= salario*0.06;
            double salud= salario*0.10;
            double trasnporte= salario*0.09;
            salario=salario-pension-seguro-salud+trasnporte;
            System.out.println("Salario final:"+salario);
    } 
}
}



