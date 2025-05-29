/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viladafolha;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class ClaNara extends Cla{

    public ClaNara(){
        this.nomeCla = "Nara";
        this.nomeLider = "Shikamaru Nara";
    }
    
    @Override
    public void habilidadeEspecial() {
        System.out.println("A Manipulação de Sombras é a habilidade especial do Clã "+nomeCla+"."); 
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("O ataque especial do Clã "+nomeCla+" é a Possessão das Sombras.\n");
    }
}
