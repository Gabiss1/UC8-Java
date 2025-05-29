/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeabstrata;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class ClasseAbstrata {

    public static void main(String[] args) {
        Sofa sofa = new Sofa("Amarelo", "Tijolo");
        Cama cama = new Cama("Magenta", "Isopor");
        
        sofa.montar();
        cama.montar();
        
        sofa.desmontar();
        cama.desmontar();
    }
}
