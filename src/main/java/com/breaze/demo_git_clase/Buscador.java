/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.breaze.demo_git_clase;

/**
 *
 * @author breaze
 */
public class Buscador {
    public int buscarNumero(int[] arreglo, int objetivo){
        int izquierda = 0, derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == objetivo) {
                return medio; // Elemento encontrado
            } else if (arreglo[medio] < objetivo) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }
        return -1; 
    }
}
