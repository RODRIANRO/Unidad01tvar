/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-03
 */
public class tv {
    String marca;
    String modelo;
    int año;
    float precio;
    
        public static void main(String[] args) {
        tv tv1 = new tv();
        
        tv1.marca= "SAMSUNG";
        tv1.modelo= "CRISTAL GULL HD";
        tv1.año= 2020;
        tv1.precio= 500;
        
            System.out.println("El nombre del TV es: "+tv1.marca);
            System.out.println("El modelo es: "+tv1.modelo);
            System.out.println("El el año es: "+tv1.año);
            System.out.println("su valor es: "+tv1.precio);
            
             tv1.marca= "LG";
             tv1.modelo= "HD 4K";
             tv1.año= 202;
             tv1.precio= 600;
        
            System.out.println("El nombre del TV es: "+tv1.marca);
            System.out.println("El modelo es: "+tv1.modelo);
            System.out.println("El el año es: "+tv1.año);
            System.out.println("su valor es: "+tv1.precio);
    }
}
