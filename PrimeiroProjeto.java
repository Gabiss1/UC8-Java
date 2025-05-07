/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprojeto;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class PrimeiroProjeto {

    public static void main(String[] args) {
/*      Frase minhaFrase = new Frase();
        minhaFrase.mensagem();
*/
        Tipos tipo = new Tipos();
        tipo.verificaIdade(19);
        tipo.escolhaNacionalidade("Brasil");
        tipo.verificarIdadeOperador();
    }
}
