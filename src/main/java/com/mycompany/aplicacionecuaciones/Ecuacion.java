/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
license
*/
package com.mycompany.aplicacionecuaciones;
public class Ecuacion {
 private double a;
 private double b;
 private double c;
 public Ecuacion(double a, double b, double c) {
 this.a = a;
 this.b = b;
 this.c = c;
 }

 public float[][] generarPuntosParaGraficar(int cantidadPuntos) {
 float[][] puntos = new float[cantidadPuntos][2];
 for (int i = 0; i < cantidadPuntos; i++) {
 float x = (float) (-10 + i * (20.0 / (cantidadPuntos - 1)));
 float y = (float) (a * x * x + b * x + c);
 puntos[i][0] = x;
 puntos[i][1] = y;
 }
 return puntos;
 }
}

