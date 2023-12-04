/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.aplicacionecuaciones;
import java.util.Scanner;
public class AplicacionEcuaciones {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Solicitar al usuario ingresar los términos de la ecuación
 System.out.print("Ingrese el coeficiente 'a' de la ecuación de segundo grado: ");
 double a = scanner.nextDouble();
 System.out.print("Ingrese el coeficiente 'b' de la ecuación de segundo grado: ");
 double b = scanner.nextDouble();
 System.out.print("Ingrese el término independiente 'c' de la ecuación de segundo grado:");
 double c = scanner.nextDouble();
 // Crear instancia de la clase Ecuacion
 Ecuacion ecuacion = new Ecuacion(a, b, c);
 // Resolver y mostrar raíces


 // Generar puntos para graficar
 float[][] puntos = ecuacion.generarPuntosParaGraficar(20);
 // Mostrar puntos para graficar
 System.out.println("Números para graficar:");
 for (float[] punto : puntos) {
 System.out.println("X: " + punto[0] + ", Y: " + punto[1]);
 }System.out.println("Muchas gracias por usarme :)");
 }
}