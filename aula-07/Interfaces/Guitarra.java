/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Guitarra implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("*Paranoid - Black Sabbath: 00:02~00:10*");
    }

    @Override
    public void afinar() {
        System.out.println("Guitarra está fina.");
    }
    
}
