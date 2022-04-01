/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-03
 */
public class carro {
    String marca;
    String modelo;
    int año;
    float precio;
    
        public static void main(String[] args) {
        carro carro1 = new carro();
        
        carro1.marca= "TOYOTA";
        carro1.modelo= "Rize";
        carro1.año= 2022;
        carro1.precio= 2000;
        
            System.out.println("El nombre del carro es: "+carro1.marca);
            System.out.println("El modelo es: "+carro1.modelo);
            System.out.println("El el año es: "+carro1.año);
            System.out.println("su valor es: "+carro1.precio);
            
            carro1.marca= "CHEBROLET";
            carro1.modelo= "FAMILI";
            carro1.año= 2014;
            carro1.precio= 1000;
        
            System.out.println("El nombre del carro es: "+carro1.marca);
            System.out.println("El modelo es: "+carro1.modelo);
            System.out.println("El el año es: "+carro1.año);
            System.out.println("su valor es: "+carro1.precio);
    }
}

