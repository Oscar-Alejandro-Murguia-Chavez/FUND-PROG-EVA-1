/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_area_triangulo;

import java.util.*;
/**
 *
 * @author alexl
 */
public class EVA1_7_AREA_TRIANGULO {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Introduzca la base");
        base = input.nextDouble();
        System.out.println("Introduzca la altura");
        altura = input.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.println("El area del triangulo es: "+area);
        
    }
}
