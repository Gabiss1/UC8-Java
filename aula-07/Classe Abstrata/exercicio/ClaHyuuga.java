/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viladafolha;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class ClaHyuuga extends Cla{
    
    public ClaHyuuga() {
        this.nomeCla = "Hyuuga";
        this.nomeLider = "Hiashi Hyuuga";
    }
    
    @Override
    public void habilidadeEspecial() {
        System.out.println("O Byakugan é a habilidade especial do Clã "+nomeCla+"."); 
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("O ataque especial do Clã "+nomeCla+" é Punho Gentil.\n");
    }
}
