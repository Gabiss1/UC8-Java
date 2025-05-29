/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viladafolha;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class ClaAkimichi extends Cla{
    
    public ClaAkimichi(){
        this.nomeCla = "Akimichi";
        this.nomeLider = "Chouza Akimichi";
    }
    
    @Override
    public void habilidadeEspecial() {
        System.out.println("O Ampliação corporal é a habilidade especial do Clã "+nomeCla+"."); 
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("O ataque especial do Clã "+nomeCla+" é o Modo Borboleta.\n");
    }
}
