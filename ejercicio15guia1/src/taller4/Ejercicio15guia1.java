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
public class Ejercicio15guia1 {

    /**
     Realizar un programaque calcule el valor a pagar por algunos galones de gasolina si sabemos que cada litro de 
     * gasolina vale 9.500.Imprimir la cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
     * DS: CANTIDAD DE GALONES, LITROS Y PRECIO
     * DE: NUMEROS DOUBLE
     */
    public static void main(String[] args) {

        double precioLitro;
        double galones;

        double cantLt;
        double precioGalon;
        cantLt = 3.78;
        precioLitro = 9500;
        precioGalon = precioLitro*cantLt;
        System.out.println("Precio de un galon: "+precioLitro*cantLt);
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca numero de galones");
        galones = read.nextDouble();
        System.out.println("Cantidad de litros: "+galones*cantLt);
        
        System.out.println("Precio a pagar: "+galones*precioGalon);
        
        
        
        
    }
    
}
