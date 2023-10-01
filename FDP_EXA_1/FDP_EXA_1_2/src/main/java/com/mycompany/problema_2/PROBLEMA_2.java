/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema_2;

import java.util.*;
/**
 *
 * @author alexl
 */
public class PROBLEMA_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double F;
        double K;
        double C;
        
        System.out.println("Ingrese la cantidad de grados Fahrenheit a convertir:");
        F = input.nextDouble();
        
        K = (F - 32) * 5/9 + 273.15;
        C = (F - 32) * 5/9;
        
        System.out.println(F+" grados Fahrenheit equivalen a:");
        System.out.println(K+" Grados Kelvin");
        System.out.println(C+" Grados Centigrados");
    }
}
