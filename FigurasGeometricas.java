/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasgeometricas;

/**
 *
 * @author WIND 11
 */
import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args) {
        float area;
        int opcion;
        final float PI = 3.14159f;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Elige la opción: ");
            System.out.println("1. Area del círculo");
            System.out.println("2. Area del triángulo");
            System.out.println("3. Area del cuadrado");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\nSeleccionó el círculo");
                    float radio = 15;
                    area = PI * radio * radio;
                    break;
                    
                case 2:
                    System.out.println("\nSeleccionó el triángulo");
                    float base = 8, altura = 5;
                    area = (base * altura) / 2;
                    break;
                    
                case 3:
                    System.out.println("\nSeleccionó el cuadrado");
                    float lado = 10;
                    area = lado * lado;
                    break;
                    
                 case 4:
                    System.out.println("\nHasta luego");
                    continue;
                 default:
                     System.out.println("\nSeleccionó el cuadrado");
                     continue;
            }
            System.out.println("El area es: " + area);
        } while (opcion != 4);
        sc.close();
        }
        
    }
