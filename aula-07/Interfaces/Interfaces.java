/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Interfaces {

    public static void main(String[] args) {
        Guitarra bateria = new Guitarra();
        Bateria guitarra = new Bateria();

        guitarra.afinar();
        bateria.afinar();
        
        System.out.println("\n");
        
        guitarra.tocar();
        bateria.tocar();
    }
}
