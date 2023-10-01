/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema_3;

import java.util.*;

/**
 *
 * @author alexl
 */
public class PROBLEMA_3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radio;
        double velocidad;
        double caudal;
        
        System.out.println("Introduzca el radio de la tuberia (en metros)");
        radio = input.nextDouble();
        
        System.out.println("Introduzca la velocidad a la que fluye el liquido (m/s)");
        velocidad = input.nextDouble();
        
        caudal = velocidad*(Math.PI*(Math.pow(radio,2)));
        
        System.out.println(caudal + "metros cuadrados fluyen por la tuberia"); 
    }
}
