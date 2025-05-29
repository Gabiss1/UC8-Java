/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viladafolha;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Konoha {

    public static void main(String[] args) {
        ClaAkimichi akimichis = new ClaAkimichi();
        ClaUchiha uchihas = new ClaUchiha();
        ClaNara naras = new ClaNara();
        ClaHyuuga hyuuga = new ClaHyuuga();

        akimichis.exibirDetalhes();
        akimichis.habilidadeEspecial();
        akimichis.ataqueEspecial();
        
        uchihas.exibirDetalhes();
        uchihas.habilidadeEspecial();
        uchihas.ataqueEspecial();
        
        naras.exibirDetalhes();
        naras.habilidadeEspecial();
        naras.ataqueEspecial();
        
        hyuuga.exibirDetalhes();
        hyuuga.habilidadeEspecial();
        hyuuga.ataqueEspecial();
    }
}
