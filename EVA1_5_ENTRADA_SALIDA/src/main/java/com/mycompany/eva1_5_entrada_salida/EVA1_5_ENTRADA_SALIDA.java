/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_salida;

import java.util.*;
/**
 *
 * @author alexl
 */
public class EVA1_5_ENTRADA_SALIDA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String apellidos;
        String nombre;
        String nocontrol;
        String carrera;
        int semestre;
        
        System.out.println("Introduce tus apellidos");
        apellidos = input.nextLine();
        System.out.println("Introduce tu nombre");
        nombre = input.nextLine();
        System.out.println("Introduce tu numero de control");
        nocontrol = input.nextLine();
        System.out.println("Introduce tu carrera");
        carrera = input.nextLine();
        System.out.println("Introduce tu semestre");
        semestre = input.nextInt();
        
        System.out.println(apellidos);
        System.out.println(nombre);
        System.out.println(nocontrol);
        System.out.println(carrera);
        System.out.println(semestre);
        
        
    }
}
