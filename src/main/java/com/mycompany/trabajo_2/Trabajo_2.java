/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo_2;

import java.util.Scanner;
/**
 *
 * @author lmgom
 */
public class Trabajo_2 {

    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio en cm: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura en cm: ");
        double altura = scanner.nextDouble();

        double area = 2 * Math.PI * radio * altura;
        

        System.out.println("El area del cilindro es: " + area + " cm^2");
       
                
    }
}
