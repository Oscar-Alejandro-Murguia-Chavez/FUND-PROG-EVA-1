/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_area_triangulo;

import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Introduce la Base");
        base = input.nextDouble();
        System.out.println("Introduce la Altura");
        altura = input.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.println("El area es: "+area);
        
    }
    
}
