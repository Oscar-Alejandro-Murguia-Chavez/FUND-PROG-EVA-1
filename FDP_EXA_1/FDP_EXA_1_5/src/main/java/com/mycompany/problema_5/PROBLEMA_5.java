/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema_5;

import java.util.*;

/**
 *
 * @author alexl
 */
public class PROBLEMA_5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double v_inicial;
        double h_max;
        double G = -9.81;
        double angulo = 45;
        double angulo_grados = Math.toRadians(angulo);
        double x_max; 
        
        System.out.println("Introduzca la velocidad inicial");
        v_inicial = input.nextDouble();
        
        h_max = (-((Math.pow(v_inicial,2))*( Math.pow(Math.sin(angulo_grados),2))))/(2*G);
        System.out.println("la altura maxima es: " + h_max); 
        
        x_max = ((-(Math.pow(v_inicial, 2))*(Math.sin((2*angulo_grados))))  )/ G ;   
        System.out.println("La distancia que alcanza el objeto es: " + x_max);
    }
}
