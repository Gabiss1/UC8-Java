/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viladafolha;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public abstract class Cla {
    protected String nomeCla;
    protected String nomeLider;
    protected String ataqueEspecial;
    
    public abstract void habilidadeEspecial();
    public abstract void ataqueEspecial();
    public void exibirDetalhes(){
        System.out.println("Nome do Clã: "+nomeCla+".\nNome do Líder: "+nomeLider+".");
    }
}
