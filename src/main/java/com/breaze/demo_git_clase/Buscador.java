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
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (arreglo[i] == objetivo) 
            {
                return i;
                // Retorna la posición del elemento encontrado
            }
        }
        return -1; 
    }
}
