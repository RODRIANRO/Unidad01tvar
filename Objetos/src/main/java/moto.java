/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-03
 */
public class moto {
     String marca;
    String modelo;
    int año;
    float precio;
    
        public static void main(String[] args) {
        moto moto1 = new moto();
        
        moto1.marca= "YAMAHA";
        moto1.modelo= "FZ";
        moto1.año= 2019;
        moto1.precio= 1000;
        
            System.out.println("El nombre del moto es: "+moto1.marca);
            System.out.println("El modelo es: "+moto1.modelo);
            System.out.println("El el año es: "+moto1.año);
            System.out.println("su valor es: "+moto1.precio);
            
            moto1.marca= "MOTOR 1";
            moto1.modelo= "20T";
            moto1.año= 2017;
            moto1.precio= 1500;
        
            System.out.println("El nombre del moto es: "+moto1.marca);
            System.out.println("El modelo es: "+moto1.modelo);
            System.out.println("El el año es: "+moto1.año);
            System.out.println("su valor es: "+moto1.precio);
    }
}


