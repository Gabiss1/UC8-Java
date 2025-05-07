/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author GABRIELGARCEZDEOLIVE
 */
public class Tipos {
    String meuNome = "Gabriel";
    char minhaInicial = 'G';
    int minhaIdade = 19;
    double minhaAltura = 1.65;
    boolean verdadeiroOuFalso = true;
    
    public void verificaIdade(int idade){
        if (idade >= 18){
            System.out.println("Sua idade é "+idade+", você é de maior!");
        } else {
            System.out.println("Você é de menor! Sua idade é "+idade+" anos.");
        }
    }
    
    public String verificarIdadeOperador(){
        String maiorDeIdade = (minhaIdade >= 18) ? "Maior de Idade." : "Menor de Idade.";
        
        return maiorDeIdade;
    }
    
    // Primeiro, dizemos se o método é public, protected ou private
    // depois, devemis especificar o tipo de retorno do método
    // depois, colocamos o nome do método
    // e, por fim, os parâmetros (se houverem)
    public int calculaSoma(int num1, int num2){
        return num1+num2;
    }
    
    public void escolhaNacionalidade(String pais){
        switch(pais){
            case "Brasil": 
                System.out.println("Brasileiro(a)");
            break;
            case "Inglaterra":
                System.out.println("Argentino(a)");
            break;
            default:
                System.out.println("Não é de nenhum país!");
            break;
        }
    }
}
