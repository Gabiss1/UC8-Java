/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public abstract class Mobilia {
    protected String cor;
    protected String material;

    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }
    
    // Método abstrato, que não tem implementação de lógica
    public abstract void montar();
    
    // Método concreto, que possui implementação lógica
    public void desmontar(){
        System.out.println("A mobília foi desmontada");
    }
}
