/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viladafolha;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class ClaUchiha extends Cla{

    public ClaUchiha() {
        this.nomeCla = "Uchiha";
        this.nomeLider = "Sasuke Uchiha";
    }
    
    @Override
    public void habilidadeEspecial() {
        System.out.println("O Sharingan é a habilidade especial do Clã "+nomeCla+"."); 
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("O ataque especial do Clã "+nomeCla+" é o Amaterasu.\n");
    }
    
}
