/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema_6;

import java.util.*;

/**
 *
 * @author alexl
 */
public class PROBLEMA_6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radio;
        double V_inicial;
        double V_final;
        double tiempo;
        double distancia;
        double distancia_M;
        double V_angular;
        double V_angular_M;
        double aceleracion;
        double aceleracion_M;
        double frecuencia;
        
        System.out.println("Ingresa el radio en metros");
        radio = input.nextDouble();
        System.out.println("Ingresa la velocidad inicial radianes/s");
        V_inicial = input.nextDouble();
        System.out.println("Ingresa la velocidad final radianes/s");
        V_final = input.nextDouble();
        System.out.println("Ingresa el tiempo de rotacion en segundos");
        tiempo = input.nextDouble();
        
        distancia = (V_inicial + V_final)* tiempo / 2;     
        distancia_M = distancia * radio;
        V_angular = distancia / tiempo;
        V_angular_M = V_angular * radio;
        aceleracion = (V_final - V_inicial) / tiempo;
        aceleracion_M = aceleracion * radio;
        frecuencia = V_angular / (2 * Math.PI);
        
        System.out.println("La distancia angular es:"+distancia );
        System.out.println("La distancia angular en metros es:"+distancia_M);
        System.out.println("La Velocidad angular es:"+V_angular);
        System.out.println("La velocidad angular en metros/s es;"+V_angular_M);
        System.out.println("La aceleracion angular es:"+aceleracion);
        System.out.println("La aceleracion angular en metros/s:"+aceleracion_M);
        System.out.println("La frecuandia de giro es:"+frecuencia+"Hertz");
    }
}
