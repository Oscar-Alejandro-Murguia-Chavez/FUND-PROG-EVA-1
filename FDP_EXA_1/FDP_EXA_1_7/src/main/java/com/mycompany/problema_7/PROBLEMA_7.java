/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema_7;

import java.util.*;

/**
 *
 * @author alexl
 */
public class PROBLEMA_7 {

    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);
      
        int x_p;
        double pendiente;
        
        System.out.println("Introduce el valor de X, para calcular la pendiente de y = x^2");
        x_p = input.nextInt();
        
        pendiente = 2 * x_p;  
        
        System.out.println("La pendiente de y = x^2 es: " + pendiente);
        
        // Ecuacion de la recta dados dos puntos
        int x1;
        int x2;
        double y1;
        double y2;
        double m_pend;
        double complemento_b;
        
        System.out.println("Introduce 2 valores de X");
        x1 = input.nextInt();
        x2 = input.nextInt();
        y1 = Math.pow(x1, 2);
        y2 = Math.pow(x2, 2);
        
        m_pend = (y2 - y1) / (x2 - x1);
        complemento_b = y2 - (m_pend * x2);
        
        // Área entre recta y parábola
        int a;
        int b;
        
        if (x1 < x2) {
            a = x1;
            b = x2;
        } else {
            a = x2;
            b = x1;
        }
        
        double delta_x = 0.001;
        double resultado = 0;
        
        for (double x = a; x <= b; x += delta_x) {
            double parabola = Math.pow(x, 2);
            double recta = (m_pend * x) + complemento_b;
            resultado += Math.abs(parabola - recta) * delta_x;
        }
        
        System.out.println("Área aproximada: " + resultado);
        
    }
}
