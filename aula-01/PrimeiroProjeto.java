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
        System.out.println(tipo.verificarIdadeOperador());
        
        tipo.loopWhile();
        System.out.println("<--------===-------->");
        tipo.loopFor();
        
        Animal animal01 = new Animal("Swablu", "Pássaro Núvem", 0.2);
        Dog cachorro01 = new Dog("Lycanroc Midnight", "Cachorro de Pedra", 87.55, "Lycanroc");
        
        animal01.emitirSom();
        cachorro01.emitirSom();
        
        Escrever escrever = new Escrever();
        escrever.escrever();
        
        // Sem instanciar, usando apenas Static
        // Escrever.escreverNome();
        
        ScannerExercicio.verificarNumero();
    }
}
