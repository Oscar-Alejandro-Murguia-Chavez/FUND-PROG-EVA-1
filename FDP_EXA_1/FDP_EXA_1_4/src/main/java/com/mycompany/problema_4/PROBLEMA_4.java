/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema_4;

import java.util.*;
/**
 *
 * @author alexl
 */
public class PROBLEMA_4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double R1;
        double R2;
        double R3;
        double R4;
        double R5;
        double resistencia;
        double voltaje;
        double intensidad_RT;
        double intensidad_R1;
        double intensidad_R2;
        double intensidad_R3;
        double intensidad_R4;
        double intensidad_R5;
        
        System.out.println("captura el valor del voltaje");
        voltaje = input.nextDouble();
        System.out.println("capturar las 5 resistencias");
        R1 = input.nextDouble();
        R2 = input.nextDouble();
        R3 = input.nextDouble();
        R4 = input.nextDouble();
        R5 = input.nextDouble();
        R5 = input.nextDouble();
        
        resistencia = 1/ ((1/R1)+(1/R2)+(1/R3)+(1/R4)+(1/R5));
        intensidad_RT = voltaje / resistencia;
        intensidad_R1 = voltaje / R1;
        intensidad_R2 = voltaje / R2;
        intensidad_R3 = voltaje / R3;
        intensidad_R4 = voltaje / R4;
        intensidad_R5 = voltaje / R5;
        
        System.out.println("la resistencia es:"+resistencia+"\n las intensidades de cada coriente son:\n"+intensidad_R1+"\n"+intensidad_R2+"\n"+intensidad_R3+"\n"+intensidad_R4+"\n"+intensidad_R5+ "\n la intensidad total es:"+intensidad_RT);
    }
}
