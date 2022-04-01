/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-03
 */
public class estudiante {
    String nombre;
    String apellido;
    int edad;
    float nota;
    
        public static void main(String[] args) {
        estudiante estudiante1 = new estudiante();
        
        estudiante1.nombre= "Juan";
        estudiante1.apellido= "Mendez";
        estudiante1.edad= 20;
        estudiante1.nota= 70;
        
            System.out.println("El nombre del estudiente es: "+estudiante1.nombre);
            System.out.println("El nombre del estudiente es: "+estudiante1.apellido);
            System.out.println("El nombre del estudiente es: "+estudiante1.edad);
            System.out.println("El nombre del estudiente es: "+estudiante1.nota);
            
            
             estudiante1.nombre= "PEDRO";
             estudiante1.apellido= "RIVERA";
             estudiante1.edad= 24;
             estudiante1.nota= 70;
         
            System.out.println("El nombre del estudiente es: "+estudiante1.nombre);
            System.out.println("El nombre del estudiente es: "+estudiante1.apellido);
            System.out.println("El nombre del estudiente es: "+estudiante1.edad);
            System.out.println("El nombre del estudiente es: "+estudiante1.nota);
    }
}

    



