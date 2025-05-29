/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Sofa extends Mobilia{

    public Sofa(String cor, String material) {
        super(cor, material);
    }

    @Override
    public void montar() {
        System.out.println("O Sofá está se montando!");
    }
    
    
    
}
