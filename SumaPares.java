/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumapares;
/**
 *
 * @author HernandezCecilia
 */

import java.util.Scanner;
public class SumaPares {
    public static void main(String[] args) {
        int n1, n2;
        int suma = 0;
        int mayor, menor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, instroduzca un número entero");
        n1 = sc.nextInt();
        System.out.println("Instroduzca otro número entero");
        n2 = sc.nextInt();
        
        if (n1>n2){
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }
        
        for (int i = menor; i<= mayor; i++){
            if(i%2==0){
                suma += i;
            }
        }
        System.out.println("LA suma de los pares entre " + n1 + " y " + n2 + " es " + suma);
        sc.close();
    }
}
