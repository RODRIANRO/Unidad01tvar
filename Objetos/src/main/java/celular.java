/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-03
 */
public class celular {
    String marca;
    String modelo;
    int año;
    float precio;
    
        public static void main(String[] args) {
        celular celular1 = new celular();
        
        celular1.marca= "SAMSUNG";
        celular1.modelo= "CRISTAL GULL HD";
        celular1.año= 2020;
        celular1.precio= 500;
        
            System.out.println("El nombre del telefono es: "+celular1.marca);
            System.out.println("El modelo es: "+celular1.modelo);
            System.out.println("El el año es: "+celular1.año);
            System.out.println("su valor es: "+celular1.precio);
            
            
            celular1.marca= "REDMI";
            celular1.modelo= "S9";
            celular1.año= 2021;
            celular1.precio= 250;
        
            System.out.println("El nombre del telefono es: "+celular1.marca);
            System.out.println("El modelo es: "+celular1.modelo);
            System.out.println("El el año es: "+celular1.año);
            System.out.println("su valor es: "+celular1.precio);
    }
}

