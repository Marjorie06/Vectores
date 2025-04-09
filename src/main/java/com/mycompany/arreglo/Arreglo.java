/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arreglo;

import java.util.Scanner;

/**
 *
 * @author IDC
 */
public class Arreglo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Bucle forr
        int[] notas = new int[10];    //Inicializar
        int contRegular = 0;
        int contBueno = 0;
        int contExcelente = 0;

        System.out.println("Ingrese las notas de los estudiantes");
        for (int i = 0; i < 10; i++) {
            notas[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (notas[i] > 0 && notas[i] <= 6) {
                contRegular = contRegular + 1;

            } else if (notas[i] > 6 && notas[i] <= 8) {
                contBueno++;
            } else if (notas[i] > 8 && notas[i] <= 10) {
                contExcelente++;

            }
        }
        System.out.println("Existen " + contRegular + " estudiantes con nota regular: ");
        System.out.println("Existen " + contBueno + " estudiantes con nota buena: ");
        System.out.println("Existen " + contExcelente + " estudiantes con nota excelente: ");

    }
}
